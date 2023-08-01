package ru.danilov.oop.homework.hw2;

public interface QueueBehavior {

    void takeInQueue(Actor actor); // заход в очередь
    void takeOrders(); //получаем закас
    void giveOrders(); //отдаем заказ
    void releaseFromeQueue(); //выход из очереди
}
