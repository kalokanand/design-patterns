package com.kalokanand.dp.creational.prototype;

public class PrototypeClient {

    public static void main(String[] args) {
        Student student = new Student(1, "Adrika Rai");
        Student protoTypeStudent = (Student) student.clone();
        System.out.println(student == protoTypeStudent);
    }
}
