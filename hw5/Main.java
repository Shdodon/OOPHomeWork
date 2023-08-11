package ru.danilov.oop.homework.hw5;

import ru.danilov.oop.homework.hw5.controller.Controller;
import ru.danilov.oop.homework.hw5.model.Student;
import ru.danilov.oop.homework.hw5.model.StudyGroup;
import ru.danilov.oop.homework.hw5.model.Teacher;
import ru.danilov.oop.homework.hw5.model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> students = new ArrayList<>();
        Controller controller = new Controller();

        Teacher teacher = new Teacher("Константин", "Петров", "Иванович", 125);
        Student student1 = new Student("Иван", "Иванов", "Иванович", 11);
        Student student2 = new Student("Лев", "Сидоров", "Львович", 12);
        Student student3 = new Student("Николай", "Колесов", "Николаевич", 13);
        Student student4 = new Student("Михаил", "Михайлов", "Кириллович", 15);
        Student student5 = new Student("Михаил", "Конев", "Петрович", 14);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudyGroup studyGroup = new StudyGroup(teacher, students);
        controller.createStudyGroup(teacher, studyGroup.getStudentList());

        controller.getTeacherId();
        controller.getStudyGroupId();

    }
}
