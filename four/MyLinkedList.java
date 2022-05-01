package com.netcracker.tasks.four;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ILinkedList<E> {

//    private static int INITIAL_CAPACITY = 16;
//    private static float RESIZE_FACTOR = 0.75f;
//
//    private Node<E>[] nodesRefer;
    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    @Override
    public void add(int index, E element) {
        checkPositionIndex(index);
        if (index == size)
            add(element);
        else
            addByIndex(element, node(index));
    }

    private void addByIndex(E e, Node<E> n) {
        if (n.next == first.next)
            first = new Node<>(e, first);
        else
            n.next = new Node<>(e, n.next);
        size++;
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element, null);
        Node<E> l = last;
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    private void checkPositionIndex(int index) {
        if (!(index >= 0 && index <= size))
            throw new IndexOutOfBoundsException("index " + index);
    }

    private void checkElementIndex(int index) {
        if (!(index >= 0 && index < size))
            throw new IndexOutOfBoundsException();
    }

    private Node<E> node(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }

    @Override
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    @Override
    public int indexOf(E e) {
        int index = 0;
        if (e == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (e.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(index);

    }

//    private void checkSize() {
//        if (size > nodesRefer.length * RESIZE_FACTOR)
//            resize();
//    }

//    private void resize() {
//        Node<E>[] newNodesRefer = (Node<E>[]) java.lang.reflect.Array.newInstance(
//                nodesRefer.getClass().getComponentType(), nodesRefer.length * 2);
//        for (int i = 0; i < nodesRefer.length; ++i)
//            newNodesRefer[i] = newNodesRefer[i];
//    }

    private E unlink(int index) {
        if (index == 0)
            return removeFirst(node(index));
        else
            return removeByIndex(node(index - 1));
    }

    private E removeFirst(Node<E> f) {
        final E element = f.item;
        final Node<E> next = f.next;
        f.item = null;
        f.next = null;
        first = next;
        if (next == null)
            last = null;
        size--;
        return element;
    }

    private E removeByIndex(Node<E> prev) {
        final Node<E> x = prev.next;
        final E element = x.item;
        prev.next = x.next;
        x.item = null;
        if (x.next == null)
            last = prev;
        x.next = null;
        size--;
        return element;
    }

    @Override
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> x = node(index);
        E oldElement = x.item;
        x.item = element;
        return oldElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }


    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[]) java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;
        if (a.length > size)
            a[size] = null;
        return a;
    }
    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> x = first; x != null; x = x.next)
            result[i++] = x.item;
        return result;
    }


    @Override
    public Iterator<E> iterator() {
        return new MyListIterator();
    }

    private static class Node<E> {
        private E item;
        private Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    private class MyListIterator implements Iterator<E>{

        private Node<E> lastReturned;
        private Node<E> next = first;
        private int nextIndex;

        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }

        @Override
        public void remove() {
            if (lastReturned == null)
                throw new IllegalStateException();

            Node<E> lastNext = lastReturned.next;
            unlink(nextIndex);
            if (next == lastReturned)
                next = lastNext;
            else
                nextIndex--;
            lastReturned = null;
        }

//        @Override
//        public void forEachRemaining(Consumer<? super E> action) {
//            Iterator.super.forEachRemaining(action);
//        }
    }

    private  String printList(){
        String s = "[";
        Node<E> x = first;
        for (int i = 0; i < size; ++i){
            s = s + " " + x.item;
            x = x.next;
            if (i == size - 1)
                s = s + " ]";
        }
        return s;
    }

    @Override
    public String toString() {
        return printList();
    }
}
