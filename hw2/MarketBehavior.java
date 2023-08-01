package ru.danilov.oop.homework.hw2;

import java.util.List;

public interface MarketBehavior {


    void acceptToMarket(Actor actor); // приход покупателя
    void releaseFromMarket(List<Actor> actors); // уход покупателя
    void update(); // обновление состояния нашего магазина
}
