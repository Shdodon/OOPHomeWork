package ru.danilov.oop.homework.hw1;

public class HotDring extends Product {
    private Double volume;
    private Double temperature;

    public HotDring(String name, Double cost, Double volume, Double temperature) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }
    public void setVolume(){
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Горячий напиток: " +
                " " + super.getName()+
                "; Цена: " + super.getCost() +
                "; Объем: " + volume + ". " +
                "Внимание температура напитка: " + temperature +
                '}';
    }
}
