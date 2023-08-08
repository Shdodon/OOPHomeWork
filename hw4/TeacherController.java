package ru.danilov.oop.homework.hw4;

import ru.danilov.oop.lesson4.Teacher;

import java.util.List;

public class TeacherController implements TeacherControllerInterface{
    private TeacherViewInterface teacherView = new TeacherView();


    public void printTeacher(List<Teacher> teacherList){
        teacherView.sendOnConsole(teacherList);
    }



    @Override
    public void create(String firstName, String secondName, Integer teacherID) {
        Teacher newTeacher = new Teacher(firstName, secondName, teacherID);
    }

}
