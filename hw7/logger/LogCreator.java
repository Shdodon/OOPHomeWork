package ru.danilov.oop.homework.hw7.logger;

import ru.danilov.oop.homework.hw7.calculator.Calculator;
import ru.danilov.oop.homework.hw7.interfaces.CreatCalculator;
import ru.danilov.oop.homework.hw7.interfaces.Method;
import ru.danilov.oop.homework.hw7.interfaces.WriteLog;

public class LogCreator implements CreatCalculator {
    private WriteLog writeLog;
    public LogCreator(WriteLog writeLog){
        this.writeLog = writeLog;
    }
    @Override
    public Method create(double num) {
        return new CalcLog(new Calculator(num), writeLog);
    }
}
