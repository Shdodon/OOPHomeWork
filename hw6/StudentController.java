package ru.danilov.oop.homework.hw6;

import java.time.LocalDate;
import java.util.List;

public class StudentController implements IUserController {

    private UserViewInterface studentsView = new StudentView();
    @Override
    public void create(String firstName, String surName, String lastName){
        Student newStudent = new Student(firstName, lastName, surName, LocalDate.now());
    }
    public void printConsole(List<Student> students){
        studentsView.sendOnConsole(students);
    }
}
