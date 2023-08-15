package ru.danilov.oop.homework.hw6;

import java.util.List;

public interface UserViewInterface<T extends User> {
    /**
     * S - Single Responsibility Principle - принцип единственной ответственности.
     * I -  Interface Segregation Principle - принцип разделения интерфейсов.
     */

    public void sendOnConsole(List<T> listT);
}
