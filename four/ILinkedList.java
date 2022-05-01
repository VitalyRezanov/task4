package com.netcracker.tasks.four;

import java.util.Iterator;

public interface ILinkedList<E> extends Iterable<E>{

    void add(int index, E element);

    void add(E element);

    void clear();

    E get(int index);

    int indexOf(E element);

    E remove(int index);

    E set(int index, E element);

    int size();

    <T> T[] toArray(T[] a);

    Object[] toArray();

    boolean isEmpty();

    boolean contains(E element);

}
