package ru.danilov.oop.homework.hw4;

import ru.danilov.oop.lesson4.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иван", "Иванов", 123);
        Teacher teacher2 = new Teacher("Петр", "Петров", 124);


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);


        TeacherGroup teachers = new TeacherGroup("Начальные классы", teacherList);
        TeacherController teacherController = new TeacherController();
        teacherController.create("Иван", "Иванов", 123);
        teacherController.create("Петр", "Петров", 124);

        System.out.println(teacherList);




        teacherController.printTeacher(teacherList);
    }
}
