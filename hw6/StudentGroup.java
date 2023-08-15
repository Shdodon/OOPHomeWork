package ru.danilov.oop.homework.hw6;

import java.util.List;

public class StudentGroup implements Iterable<Student>{

    /**
     *  S - Single Responsibility Principle
     *  Каждый класс должен иметь только одну зону ответственности.
     *  Dependency Inversion Principle - принцип инверсии зависимостей.
     *  Модули верхнего уровня не должны зависеть от модулей нижнего уровня.
     *  И те, и другие должны зависеть от абстракции. Абстракции не должны зависеть от деталей.
     *  Детали должны зависеть от абстракций.
     */
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void createStudent(User user){
        students.add((Student) user);
    }

    /**
     * O - Open closed Principle
     * L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
     * Вместо базового (родительского) типа (класса) можем подставить
     * любой его подтип (класс-наследник), при этом работа программы не измениться.
     */

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
