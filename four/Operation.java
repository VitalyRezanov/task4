package com.netcracker.tasks.four;

import com.netcracker.person.Person;

@FunctionalInterface
public interface Operation {
    void operate(int index, Person p);
}
