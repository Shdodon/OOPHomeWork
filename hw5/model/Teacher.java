package ru.danilov.oop.homework.hw5.model;

public class Teacher extends User {

    private int teacherId;

    public Teacher(String name, String surName, String lastName, int teacherId) {
        super(name, surName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Преподаватель: " +
                "teacherId=" + teacherId +
                ", Имя: '" + name + '\'' +
                ", Фамилия: '" + surName + '\'' +
                ", Отчество: '" + lastName + '\'' +
                '}';
    }
}
