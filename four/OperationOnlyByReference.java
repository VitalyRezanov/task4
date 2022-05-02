package com.netcracker.tasks.four;

import com.netcracker.person.Person;

@FunctionalInterface
public interface OperationOnlyByReference {
    void operate(Person p);
}
