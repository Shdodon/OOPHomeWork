package ru.danilov.oop.homework.hw7.logger;

import ru.danilov.oop.homework.hw7.interfaces.Method;
import ru.danilov.oop.homework.hw7.interfaces.WriteLog;

public class CalcLog implements Method {
    private Method readResult;
    private WriteLog log;

    public CalcLog(Method readResult, WriteLog log) {
        this.readResult = readResult;
        this.log = log;
    }

        @Override
        public Method summa (double num){
            double firstNum = readResult.getResult();
            log.log(String.format("Число %f. Начало вызова метода summa %f", firstNum, num));
            Method result = readResult.summa(num);
            log.log(String.format("Вызван метод summa"));
            return result;
        }

        @Override
        public Method division ( double num){
            double firstNum = readResult.getResult();
            log.log(String.format("Число %f. Start Начало вызова метода division %f", firstNum, num));
            Method result = readResult.division(num);
            log.log(String.format("Вызован метод division "));
            return result;
        }

        @Override
        public Method multiplication ( double num){
            double firstNum = readResult.getResult();
            log.log(String.format("Число %f. Начало вызова метода multiplication %f", firstNum, num));
            Method result = readResult.multiplication(num);
            log.log(String.format("Вызван метод multiplication"));
            return result;
        }

        @Override
        public double getResult () {
            double result = readResult.getResult();
            log.log(String.format("Ответ %f", result));
            return result;
        }
    }
