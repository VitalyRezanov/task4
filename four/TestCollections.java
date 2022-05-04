package com.netcracker.tasks.four;
import com.netcracker.person.Person;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        List<Person> arrayPerson = new ArrayList<>();
        List<Person> linkedList = new LinkedList<>();
        // Add *****************************************************************************************
        Operator.operationAdd(arrayPerson::add);
        System.out.println(arrayPerson.getClass());
        Operator.operationAdd(linkedList::add);
        System.out.println(linkedList.getClass());
        // Add by index *********************************************************************************
        Operator.operationAddByIndex(arrayPerson::add);
        System.out.println(arrayPerson.getClass());
        Operator.operationAddByIndex(linkedList::add);
        System.out.println(linkedList.getClass());
        //  remove *********************************************************************************
        Operator.operationRemove(arrayPerson::remove);
        System.out.println(arrayPerson.getClass());
        Operator.operationRemove(linkedList::remove);
        System.out.println(linkedList.getClass());
        //*********************************************************
        HashSet<Person> hashSet = new HashSet<>();
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Person> treeSet = new TreeSet<>();
        // Add *****************************************************************************************
        Operator.operationAdd(hashSet::add);
        System.out.println(hashSet.getClass());
        Operator.operationAdd(linkedHashSet::add);
        System.out.println(linkedHashSet.getClass());
        Operator.operationAdd(treeSet::add);
        System.out.println(treeSet.getClass());
        //  remove *********************************************************************************
        Operator.operationRemoveByReference(hashSet::remove);
        System.out.println(hashSet.getClass());
        Operator.operationRemoveByReference(linkedHashSet::remove);
        System.out.println(linkedHashSet.getClass());
        Operator.operationRemoveByReference(treeSet::remove);
        System.out.println(treeSet.getClass());
        //***************************************************************
        HashMap<Integer,Person> hashMap = new HashMap<>();
        LinkedHashMap<Integer,Person> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer,Person> treeMap = new TreeMap<>();
        // Put *****************************************************************************************
        Operator.operationPut(hashMap::put);
        System.out.println(hashMap.getClass());
        Operator.operationPut(linkedHashMap::put);
        System.out.println(linkedHashMap.getClass());
        Operator.operationPut(treeMap::put);
        System.out.println(treeMap.getClass());
        //  remove *********************************************************************************
        Operator.operationRemove(hashMap::remove);
        System.out.println(hashMap.getClass());
        Operator.operationRemove(linkedHashMap::remove);
        System.out.println(linkedHashMap.getClass());
        Operator.operationRemove(treeMap::remove);
        System.out.println(treeMap.getClass());

    }

}
