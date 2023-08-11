package ru.danilov.oop.homework.hw5.model;

public class Student extends User {

    private int studentId;

    public Student(String name, String surName, String lastName, int studentId) {
        super(name, surName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }
}
