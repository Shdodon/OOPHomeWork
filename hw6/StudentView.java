package ru.danilov.oop.homework.hw6;

import java.util.List;

public class StudentView implements UserViewInterface<Student> {
    /**
     * S - Single Responsibility Principle - принцип единственной ответственности.
     * Зона ответственности данного класса печать в консоль (То есть у нас не Класс-бог который все умеет)
     * O - Open closed Principle - принцип открытости-закрытости.
     * Класс открыт для расширений(переопределили метод), при этом не вносили изменений в родительский класс
     * L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
     * Вместо родительсокго класса подставили его подтип, при этом работа программы не нарушилась
     *
     */
    @Override
    public void sendOnConsole(List<Student> listT){
        System.out.println("Spisok studentov");
        for (Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}