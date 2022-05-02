package com.netcracker.tasks.four;

import com.netcracker.person.Person;

import java.time.Duration;
import java.time.Instant;

public class OperatorList {
    public static void operationAdd(OperationOnlyByReference operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 1000000; ++i){
            operation.operate(new Person(25, "P" + i, "13"));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for add ");
    }

    public static void operationAddByIndex(Operation operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 10000; ++i){
            operation.operate((int) (Math.random() * 10000), new Person(25, "P", "13"));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for add by index ");
    }
    public static void operationGetByIndex(OperationOnlyByIndex operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 10000; ++i){
            operation.operate((int) (Math.random() * 10000));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for get by index ");
    }
    public static void operationContains(OperationOnlyByReference operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 10000; ++i){
            operation.operate(new Person(25, "P" + (int) (Math.random() * 10000), "13"));

        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for contains ");
    }

    public static void operationSet(Operation operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 10000; ++i){
            operation.operate((int) (Math.random() * 10000), new Person(25, "SET" , "13"));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for set ");
    }

    public static void operationRemove(OperationOnlyByIndex operation) {
        Instant start = Instant.now();
        for (int i = 10000; i > 0; --i){
            operation.operate(i);
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for remove ");
    }

}
