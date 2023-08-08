package ru.danilov.oop.homework.hw4;

import ru.danilov.oop.lesson4.Teacher;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private int counter;
    private final List<Teacher> teacherList;
    public TeacherGroupIterator(TeacherGroup teacherGroup){
        this.teacherList = teacherGroup.getTeacherList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teacherList.size() - 1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return teacherList.get(counter);
    }
}
