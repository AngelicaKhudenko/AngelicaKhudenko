package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calculator=new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double division=calculator.makeDivision(28,5);
        double degree=calculator.makeDegree(division,2);
        double multiplication=calculator.makeMultiplication(15,7);
        double result=calculator.makePlus(4.1, calculator.makePlus(multiplication,degree));

        long quantityOfUsages= ((CalculatorWithCounterAutoDecorator) calculator).getCountOperation(); // подсчет итогового количества использований калькулятора

        System.out.format("Результат выражения равен: %.3f",result); // вывод результата с 3-мя знаками после запятой
        System.out.println();
        System.out.println("Количество использований калькулятора равно: "+quantityOfUsages);
    }
}
