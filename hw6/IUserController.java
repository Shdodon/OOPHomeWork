package ru.danilov.oop.homework.hw6;

public interface IUserController <T extends User>{

    /**
     * S - Single Responsibility Principle - принцип единственной ответственности.
     * I -  Interface Segregation Principle - принцип разделения интерфейсов.
     */

    void create(String firstName, String surName, String lastName);
}
