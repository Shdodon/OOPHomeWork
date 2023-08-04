package ru.danilov.oop.homework.hw3;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup implements Iterable<Student>{
    private List<Student> studentList;
    public StudentsGroup(){
        studentList = new ArrayList<>();
    }
    public StudentsGroup(List<Student> studentList){
        setStudents(studentList);
    }
    public void addStudent(Student student){
        if (studentList != null){
            studentList.add(student);
        }
    }
    public List<Student> getStudents(){
        return studentList;
    }
    public void setStudents(List<Student> studentList){
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "students=" + studentList +
                '}';
    }

    @Override
    public StudentsGroupIterator iterator() {
        return new StudentsGroupIterator(this);
    }
}
