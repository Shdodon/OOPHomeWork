package ru.danilov.oop.homework.hw2;

public class Pro {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Somebody1");
        Human human2 = new Human("Somebody2");
        market.acceptToMarket(human1);
        //market.acceptToMarket(human2); //ctrl+d -дублирует строку
        market.update();


    }
}
