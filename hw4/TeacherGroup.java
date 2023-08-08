package ru.danilov.oop.homework.hw4;

import ru.danilov.oop.lesson4.Teacher;
import ru.danilov.oop.lesson4.User;

import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teacherList;
    private String since;
    public TeacherGroup(String since, List<Teacher> teacherList){
        this.since = since;
        this.teacherList = teacherList;
    }
    public List<Teacher> getTeacherList(){
        return teacherList;
    }
    public void setTeacherList(List<Teacher> teacherList){
        this.teacherList = teacherList;
    }
    public String getSince(){
        return since;
    }
    public void setSince(String since){
        this.since = since;
    }
    public void createTeacher(User user){
        teacherList.add((Teacher) user);
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teacherList=" + teacherList +
                ", since='" + since + '\'' +
                '}';
    }

    @Override
    public TeacherGroupIterator iterator(){
        return new TeacherGroupIterator(this);
    }
}