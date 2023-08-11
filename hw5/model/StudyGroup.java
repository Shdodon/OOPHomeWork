package ru.danilov.oop.homework.hw5.model;

import java.util.List;

public class StudyGroup {
    private int groupID;

    private Teacher teacher;
    private List<User> studentList;

    public StudyGroup(int groupID, Teacher teacher, List<User> studentList) {
        this.groupID = groupID;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public StudyGroup(Teacher teacher, List<User> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public void getTeacher() {
        System.out.println(teacher.toString());
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }

    public void creatStudent(User user){
        studentList.add((Student) user);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "groupID=" + groupID +
                ", teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
