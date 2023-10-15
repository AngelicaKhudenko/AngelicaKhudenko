package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorVersion=new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calculator=new CalculatorWithCounterAutoAgregationInterface(calculatorVersion);

        double division=calculator.makeDivision(28,5);
        double degree=calculator.makeDegree(division,2);
        double multiplication=calculator.makeMultiplication(15,7);
        double result=calculator.makePlus(4.1, calculator.makePlus(multiplication,degree));

        long quantityOfUsages=calculator.getCountOperation(); // подсчет итогового количества использований калькулятора

        System.out.format("Результат выражения равен: %.3f",result); // вывод результата с 3-мя знаками после запятой
        System.out.println();
        System.out.println("Количество использований калькулятора равно: "+quantityOfUsages);
    }
}
