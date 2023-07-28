package ru.danilov.oop.homework.hw1;

public abstract class Product {
    private String name;

    private Double cost;


    public Product(String name, Double cost){
        setName(name);
        setCost(cost);

    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
