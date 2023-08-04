package ru.danilov.oop.homework.hw3;

public class Student {
    private Integer studentId;
    private String firstName;

    private String secondName;
    private String lastName;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Поток студентов: " +
                "Номер зачетки: " + studentId +
                ", Имя '" + firstName + '\'' +
                ", Фамилия'" + secondName + '\'' +
                ", Отчество'" + lastName + '\'' +
                '}';
    }
}
