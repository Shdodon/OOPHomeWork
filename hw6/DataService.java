package ru.danilov.oop.homework.hw6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    /**
     * S - Single responsibility principle - принцип единственной ответственности.
     * Класс иммет зону только одну зону ответственности - работа с данными
     */
    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users.add(student);
    }
}
