package com.netcracker.tasks.four;

import com.netcracker.person.Person;

import java.time.Duration;
import java.time.Instant;

public class Operator {
    public static void operationAdd(OperationOnlyByReference operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 100000; ++i){
            operation.operate(new Person(25, "P" + (Math.random() * 100000), "13"));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for add ");
    }

    public static void operationAddByIndex(Operation operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 100000; ++i){
            int index = (int) (Math.random() * 100000);
            operation.operate(index, new Person(25, "P" + index, "13"));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for add by index ");
    }
    public static void operationGetByIndex(OperationOnlyByIndex operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 100000; ++i){
            operation.operate((int) (Math.random() * 100000));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for get by index ");
    }
    public static void operationContains(OperationOnlyByReference operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 100000; ++i){
            operation.operate(new Person(25, "P" + (int) (Math.random() * 10000), "13"));

        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for contains ");
    }

    public static void operationSet(Operation operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 100000; ++i){
            operation.operate((int) (Math.random() * 100000), new Person(25, "SET" , "13"));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for set ");
    }

    public static void operationRemove(OperationOnlyByIndex operation) {
        Instant start = Instant.now();
        for (int i = 0; i < 100000; ++i){
            operation.operate((int) (Math.random() * 100000));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for remove ");
    }
    public static void operationRemoveByReference(OperationOnlyByReference operation) {
        Instant start = Instant.now();
        for (int i = 0; i < 100000; ++i){
            operation.operate(new Person(25, "P" + (int) (Math.random() * 100000) , "13"));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for remove ");
    }
    public static void operationPut(OperationMap operation) {
        Instant start = Instant.now();
        for (int i = 0; i< 100000; ++i){
            operation.operate((int) (Math.random() * 100000), new Person(25, "P" + (int) (Math.random() * 100000), "13"));
        }
        Instant finish = Instant.now();
        System.out.print(Duration.between(start, finish).toMillis() + " ms for put ");
    }

}
