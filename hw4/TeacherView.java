package ru.danilov.oop.homework.hw4;

import ru.danilov.oop.lesson4.Teacher;

import java.util.List;

public class TeacherView implements TeacherViewInterface<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> teacherList) {
        System.out.println("Список учитлей: ");
        for (Teacher t: teacherList) {
            System.out.println(t.getTeacherId());
        }
    }
}
