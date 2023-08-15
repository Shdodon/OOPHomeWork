package ru.danilov.oop.homework.hw6;

import java.util.List;
import java.util.logging.Logger;

public class UserView {

    /**
     *  S - Single Responsibility Principle - принцип единственной ответственности.
     *  Зона ответственности печать в консоль
     */

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}
