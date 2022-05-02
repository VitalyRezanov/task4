package com.netcracker;


import com.netcracker.figures.Circle;
import com.netcracker.person.Person;
import com.netcracker.tasks.four.ILinkedList;
import com.netcracker.tasks.four.MyLinkedList;
import com.netcracker.tasks.four.OperatorList;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ILinkedList<Person> listPerson = new MyLinkedList<>();
        listPerson.add(new Person(22, "P1", "24"));
        listPerson.add(new Person(13, "P2", "13"));
        listPerson.add(new Person(25, "P3", "13"));
        try {
            listPerson.add(-1, new Person(30, "P4", "131"));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.getStackTrace();
        }

        Person[] array = new Person[4];
        array[3] = new Person(30, "P4", "131");
        array = listPerson.toArray(array);
        for (Person l: array) {
            System.out.println(l);
        }

        ILinkedList<Person> myLinkedList = new MyLinkedList<>();
        LinkedList<Person> linkedList = new LinkedList<>();
        // Add *****************************************************************************************
        OperatorList.operationAdd(myLinkedList::add);
        System.out.println(myLinkedList.getClass());
        OperatorList.operationAdd(linkedList::add);
        System.out.println(linkedList.getClass());
        // Add by index *********************************************************************************
        OperatorList.operationAddByIndex(myLinkedList::add);
        System.out.println(myLinkedList.getClass());
        OperatorList.operationAddByIndex(linkedList::add);
        System.out.println(linkedList.getClass());
        // get  by index *********************************************************************************
        OperatorList.operationGetByIndex(myLinkedList::get);
        System.out.println(myLinkedList.getClass());
        OperatorList.operationGetByIndex(linkedList::get);
        System.out.println(linkedList.getClass());
        //  contains *********************************************************************************
        OperatorList.operationContains(myLinkedList::contains);
        System.out.println(myLinkedList.getClass());
        OperatorList.operationContains(linkedList::contains);
        System.out.println(linkedList.getClass());
        //  set *********************************************************************************
        OperatorList.operationSet(myLinkedList::set);
        System.out.println(myLinkedList.getClass());
        OperatorList.operationSet(linkedList::set);
        System.out.println(linkedList.getClass());
        //  remove *********************************************************************************
        OperatorList.operationRemove(myLinkedList::remove);
        System.out.println(myLinkedList.getClass());
        OperatorList.operationRemove(linkedList::remove);
        System.out.println(linkedList.getClass());
    }
}

