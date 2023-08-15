package ru.danilov.oop.homework.hw6;

import java.time.LocalDate;

public class UserController implements IUserController {

    @Override
    public void create(String firstName, String surName, String lastName){
        User newUser = new User(firstName, lastName, surName, LocalDate.now());
    }
    public void printConsole(User user){

    }
}
