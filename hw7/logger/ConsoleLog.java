package ru.danilov.oop.homework.hw7.logger;

import ru.danilov.oop.homework.hw7.interfaces.WriteLog;

public class ConsoleLog implements WriteLog {
    @Override
    public void log(String message) {
        System.out.println("Log:" + message);
    }
}
