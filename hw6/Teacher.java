package ru.danilov.oop.homework.hw6;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparable<Teacher>{
    /**
     * D - Dependency Inversion Principle - принцип инверсии зависимостей.
     * S - Single Responsibility Principle - принцип единственной ответственности.
     */


    private Integer teacherId;


    public Teacher(String firstName, String secondName, Integer teacherId) {
        super(firstName, secondName);
        this.teacherId = teacherId;
    }
    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Integer teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * O - Open closed Principle - принцип открытости-закрытости.
     * L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
     */

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}