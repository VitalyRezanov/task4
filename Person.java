package com.netcracker.person;

import java.util.Objects;

public class Person implements Comparable<Person> {
    int age;
    String name;
    String passport;

    private static int counter;

    public Person(int age, String name, String passport) {
        this.age = age;
        this.name = name;
        this.passport = passport;
        counter++;
    }

    @Override
    public int compareTo(Person person) {
        if (this.name.equals(person.name)) {
            return 0;
        }
        else {
            return this.name.compareTo(person.name);
        }
    }

    public static void m(int x, int y) {
        m(1, 2, 3);
    }

    public static void m(int x, int y, int z) {

    }

    public static void staticMethod() {
        counter++;
//        age++;
//        nonStaticMethod();
        AnotherStaticMethod();
    }

    public void nonStaticMethod() {

        counter++;
        age++;
        staticMethod();


    }
    public static void AnotherStaticMethod() {

    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name) && Objects.equals(passport, person.passport);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name, passport);
//    }

    @Override
    public boolean equals(Object obj) {

        //return false;
        if (this == obj) return true;

        //if (!(obj instanceof Person)) return false;

        if (obj == null || !(this.getClass().equals(obj.getClass()))) return false;

        Person person = (Person) obj; // downcast

        return this.age == person.age && this.name.equals(person.name) && this.passport.equals(person.passport);

    }

    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + age;
        result = 31 * result + passport.hashCode();
        result = 31 * result + name.hashCode();

        return result;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }


}
