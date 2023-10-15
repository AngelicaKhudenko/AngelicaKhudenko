package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator=new CalculatorWithMathExtends();

        double division=calculator.makeDivision(28,5);
        double degree=calculator.makeDegree(division,2);
        double multiplication=calculator.makeMultiplication(15,7);
        double result=calculator.makePlus(4.1,calculator.makePlus(multiplication,degree));

        System.out.format("Результат выражения равен: %.3f",result); // вывод результата с 3-мя знаками после запятой
    }
}
