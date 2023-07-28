package ru.danilov.oop.homework.hw1;

import java.util.List;

public interface VendingMachine {

    Product getProduct(String name) throws IllegalStateException;

    public boolean addProduct(List<Product> productList);
}
