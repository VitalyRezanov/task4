package com.netcracker;


import com.netcracker.figures.Circle;
import com.netcracker.person.Person;
import com.netcracker.tasks.four.ILinkedList;
import com.netcracker.tasks.four.MyLinkedList;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ILinkedList<Person> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(new Person(22, "P1", "24"));
        myLinkedList.add(new Person(13, "P2", "13"));
        myLinkedList.add(new Person(25, "P3", "13"));
        try {
            myLinkedList.add(-1, new Person(30, "P4", "131"));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.getStackTrace();
        }

        Person[] array = new Person[4];
        array[3] = new Person(30, "P4", "131");
        array = myLinkedList.toArray(array);
        for (Person l: array) {
            System.out.println(l);
        }
    }
}

