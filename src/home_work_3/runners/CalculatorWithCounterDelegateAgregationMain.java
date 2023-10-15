package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculatorWithCounter=new CalculatorWithCounterAutoAgregation(calculator);

        double division=calculatorWithCounter.makeDivision(28,5);
        double degree=calculatorWithCounter.makeDegree(division,2);
        double multiplication=calculatorWithCounter.makeMultiplication(15,7);
        double result=calculatorWithCounter.makePlus(4.1,calculatorWithCounter.makePlus(multiplication,degree));

        long quantityOfUsages=calculatorWithCounter.getCountOperation(); // подсчет итогового количества использований калькулятора

        System.out.format("Результат выражения равен: %.3f",result); // вывод результата с 3-мя знаками после запятой
        System.out.println();
        System.out.println("Количество использований калькулятора равно: "+quantityOfUsages);
    }
}
