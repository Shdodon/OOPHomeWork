package ru.danilov.oop.homework.hw2;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder; //когда мы пишем protected наши методы будут доступны классам одного и тогоже пакета, но еще и подклассам
    protected boolean isTakeOrder;



    String getName(){
        return this.name;
    }

    public Actor(String name){
        this.name = name;
    }
}
