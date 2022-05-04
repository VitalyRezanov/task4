package com.netcracker.tasks.four;

import com.netcracker.person.Person;

@FunctionalInterface
public interface OperationMap {
    void operate(Integer i, Person p);
}
