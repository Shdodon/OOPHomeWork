package ru.danilov.oop.homework.hw7.view;

import ru.danilov.oop.homework.hw7.interfaces.CreatCalculator;
import ru.danilov.oop.homework.hw7.interfaces.Method;

import java.util.Scanner;

public class ViewConsole {
    private CreatCalculator creatCalculator;
    public ViewConsole(CreatCalculator creatCalculator){
        this.creatCalculator = creatCalculator;
    }
    public void programStart(){
        while (true){
            double firstNum = promptDouble("Ввод аргумента: ");
            Method method = creatCalculator.create(firstNum);
            while (true){
                String methodic = prompt("Ввод метода [/*-+=]");
                if (methodic.equals("/")){
                    double num = promptDouble("Ввод аргумента: ");
                    method.division(num);
                    continue;
                }
                if (methodic.equals("*")){
                    double num = promptDouble("Ввод аргумента: ");
                    method.multiplication(num);
                    continue;
                }
                if (methodic.equals("+")){
                    double num = promptDouble("Ввод аргумента: ");
                    method.summa(num);
                    continue;
                }
                if (methodic.equals("=")){
                    double result = method.getResult();
                    System.out.printf("Ответ %f\n", result);
                    break;
                }
            }
            String methodic = prompt("Следующий расчет? y/n: ");
            if (methodic.equals("y")){
                continue;
            }
            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
