package ru.danilov.oop.homework.hw1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        HotDring indianTea = new HotDring("Индийский чай", 30.5, 0.3,55.5);
        HotDring herbalTea = new HotDring("Травяной чай", 30.5, 0.3,50.0);
        HotDring decaffeinatedCoffee  = new HotDring("Кофе без кофеина", 30.5, 0.3,50.0);

        List<Product> productList = new ArrayList<>();
        productList.add(indianTea);
        productList.add(herbalTea);

        HotDringVendingMachine hotDringVendingMachine = new HotDringVendingMachine(productList);
        Product getHotDring = hotDringVendingMachine.getProduct("Индийский чай");
        System.out.println(getHotDring);


    }
}
