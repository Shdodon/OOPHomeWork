package ru.danilov.oop.homework.hw2;

public interface ActorBehaviour {

    void setMakeOrder(boolean status);
    void setTakeOrder(boolean status);

    boolean isMakeOrder(boolean status);
    boolean isTakeOrder(boolean status);

}
