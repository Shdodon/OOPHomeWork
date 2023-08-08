package ru.danilov.oop.homework.hw4;

import ru.danilov.oop.lesson4.Teacher;

import java.util.List;

public interface TeacherViewInterface<T extends Teacher> {
    public void sendOnConsole(List<T> tList);
}
