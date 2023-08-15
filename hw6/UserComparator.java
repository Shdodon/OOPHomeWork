package ru.danilov.oop.homework.hw6;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    /**
     *
     * S - Single Responsibility Principle - принцип единственной ответственности.
     * O - Open closed Principle - принцип открытости-закрытости.
     * L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
     */
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}