package com.kalokanand.dp.creational.prototype;

public class Student implements Prototype {

    int rollnumber;
    String name;

    public Student() {
    }
    public Student(int rollnumber, String name) {
        this.rollnumber = rollnumber;
        this.name = name;
    }
    @Override
    public Prototype clone() {
        return new Student(rollnumber, name);
    }
}
