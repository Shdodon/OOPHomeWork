package ru.danilov.oop.homework.hw5.service;

import ru.danilov.oop.homework.hw5.model.Student;
import ru.danilov.oop.homework.hw5.model.Teacher;
import ru.danilov.oop.homework.hw5.model.Type;
import ru.danilov.oop.homework.hw5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public void create(String name, String surName, String lastName, Type type){
        int id = getFreeId(type);
        if(Type.STUDENT == type){
            Student student = new Student(name, surName, lastName, id);
            userList.add(student);
        }
        if(Type.TEACHER == type)
        {
            Teacher teacher = new Teacher(name, surName,lastName, id);
            userList.add(teacher);
        }
    }

    public List<User> getAllStudents(){
        List<User> students = new ArrayList<>();
        for (User user:
             userList) {
            if(user instanceof Student){
                students.add(user);
            }
        }
        return students;
    }

    public User getUserID(Type type, int id){
        User resultuser = null;
        boolean itsStudent = Type.STUDENT == type;
        for(User user : userList){
            if(itsStudent && user instanceof Student && ((Student) user).getStudentId() == id){
                resultuser = user;
            }
            if(!itsStudent && user instanceof Teacher && ((Teacher) user).getTeacherId() == id){
                resultuser = user;
            }
        }
        return resultuser;
    }

    private  int getFreeId(Type type){
        int lastID = 1;
        boolean itsStudent = Type.STUDENT == type;
        for(User user : userList){
            if(itsStudent && user instanceof Student){
                lastID = ((Student) user).getStudentId() + 1;
            }
            if(!itsStudent && user instanceof Teacher){
                lastID = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return lastID;
    }
}
