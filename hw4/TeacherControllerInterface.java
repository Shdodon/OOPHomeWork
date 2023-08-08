package ru.danilov.oop.homework.hw4;

import ru.danilov.oop.lesson4.Teacher;

public interface TeacherControllerInterface<T extends Teacher> {
    void create(String firstName, String secondName, Integer teacherID);
}
