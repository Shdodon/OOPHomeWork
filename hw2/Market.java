package ru.danilov.oop.homework.hw2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavior, MarketBehavior {
    private final List<Actor> queue;
    boolean status = false;

    public Market(){
        this.queue = new ArrayList<>();
    }


    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " come shop");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors) {
            System.out.println(actor.getName() + " left order");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromeQueue();

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " come order");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor: queue) {
             if(!actor.isMakeOrder(status)){
                 status = true;
                 actor.setMakeOrder(true);
                 System.out.println(actor.getName() + " make order");
             }
        }

    }

    @Override
    public void giveOrders(){
        for (Actor actor: queue) {
            if(actor.isMakeOrder(status)){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " get order");
            }
        }

    }

    @Override
    public void releaseFromeQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue) {
            if(actor.isTakeOrder(status)){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " left shop");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
