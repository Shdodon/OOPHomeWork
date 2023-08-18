package ru.danilov.oop.homework.hw7.calculator;

import ru.danilov.oop.homework.hw7.interfaces.Method;

/**
 * Фабричный паттерн
 */
public class Calculator implements Method {
    private Double inNumber;
    public Calculator(Double inNumber){
        this.inNumber = inNumber;
    }
    @Override
    public Method summa(double num) {
        this.inNumber += num;
        return this;
    }

    @Override
    public Method division(double num) {
        this.inNumber /= num;
        return this;
    }

    @Override
    public Method multiplication(double num) {
        this.inNumber *= num;
        return this;
    }


    @Override
    public double getResult() {
        return inNumber;
    }
}
