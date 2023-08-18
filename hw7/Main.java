package ru.danilov.oop.homework.hw7;

import ru.danilov.oop.homework.hw7.interfaces.CreatCalculator;
import ru.danilov.oop.homework.hw7.logger.ConsoleLog;
import ru.danilov.oop.homework.hw7.logger.LogCreator;
import ru.danilov.oop.homework.hw7.view.ViewConsole;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");

        CreatCalculator newCalc = new LogCreator(new ConsoleLog());
        ViewConsole console = new ViewConsole(newCalc);
        console.programStart();
    }
}
