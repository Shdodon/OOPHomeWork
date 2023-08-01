package ru.danilov.oop.homework.hw2;

public  class Human extends Actor {
    public Human(String name) {
        super(name);
    }


    @Override
    public void setMakeOrder(boolean status) {
        isMakeOrder(status);

    }

    @Override
    public void setTakeOrder(boolean status) {
        isTakeOrder(status);

    }

    @Override
    public boolean isMakeOrder(boolean status) {
        if (status) return true;
        return false;
    }

    @Override
    public boolean isTakeOrder(boolean status) {
        if (status) return true;
        return false;
    }

    @Override
    String getName() {
        return super.getName();
    }
}
