package ru.danilov.oop.homework.hw6;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    /**
     *  S - Single Responsibility Principle
     *  Каждый класс должен иметь только одну зону ответственности.
     *  Dependency Inversion Principle - принцип инверсии зависимостей.
     *  Модули верхнего уровня не должны зависеть от модулей нижнего уровня.
     *  И те, и другие должны зависеть от абстракции. Абстракции не должны зависеть от деталей.
     *  Детали должны зависеть от абстракций.
     */

    private int counter;
    private final List<Student> students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.students = studentGroup.getStudents();
        this.counter = 0;
    }
    /**
     * O - Open closed Principle Классы открыты для расширения, но закрыты для изменения
     * L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
     * Вместо базового (родительского) типа (класса) можем подставить
     * любой его подтип (класс-наследник), при этом работа программы не измениться.
     */


    @Override
    public boolean hasNext() {
        return counter < students.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return students.get(counter);
    }
}