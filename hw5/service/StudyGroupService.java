package ru.danilov.oop.homework.hw5.service;

import ru.danilov.oop.homework.hw5.model.StudyGroup;
import ru.danilov.oop.homework.hw5.model.Teacher;
import ru.danilov.oop.homework.hw5.model.User;

import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;
    public void creatStudyGroup(Teacher teacher, List<User> students){
        this.studyGroup = new StudyGroup(teacher, students);
    }
    public void creatStudent(User user){
        studyGroup.creatStudent(user);
        }
    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
    public List<User> getStudentList(){
        return studyGroup.getStudentList();
    }
    public void getTeacher(){
        studyGroup.getTeacher();
    }

    @Override
    public String toString() {
        return "StudyGroupService{" +
                "studyGroup=" + studyGroup +
                '}';
    }
}

