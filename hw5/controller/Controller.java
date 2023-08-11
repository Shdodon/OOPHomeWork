package ru.danilov.oop.homework.hw5.controller;

import ru.danilov.oop.homework.hw5.model.Student;
import ru.danilov.oop.homework.hw5.model.Teacher;
import ru.danilov.oop.homework.hw5.model.Type;
import ru.danilov.oop.homework.hw5.model.User;
import ru.danilov.oop.homework.hw5.service.DataService;
import ru.danilov.oop.homework.hw5.service.StudyGroupService;
import ru.danilov.oop.homework.hw5.view.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    StudentView view= new StudentView();

    public void createSteudent(String name, String surName, String lastName ){
        service.create(name, surName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }
    public void  gettAllStudent(){
        List<User> userList = service.getAllStudents();
        for (User user: userList) {
            //Student student =(Student) user;
           // StudentView.printOnConsole(student);
            StudentView.printOnConsole((Student) user); //то же самое, только компактнее
        }
    }

    StudyGroupService studyGroupService = new StudyGroupService();
    public void createStudyGroup(Teacher teacher, List<User> students){
        studyGroupService.creatStudyGroup(teacher, students);
    }
    public void getStudyGroupId(){
        List<User> userList = studyGroupService.getStudentList();
        for (User user: userList) {
            Student student = (Student) user;
            System.out.println("StudentId: " + student.getStudentId());
        }
    }
    public void getTeacherId(){
        studyGroupService.getTeacher();
    }


}
