package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator=new CalculatorWithCounterClassic();

        double division=calculator.makeDivision(28,5);
        calculator.incrementCountOperation(); // увеличение счетчика использований калькулятора
        double degree=calculator.makeDegree(division,2);
        calculator.incrementCountOperation(); // увеличение счетчика использований калькулятора
        double multiplication=calculator.makeMultiplication(15,7);
        calculator.incrementCountOperation(); // увеличение счетчика использований калькулятора
        double result=calculator.makePlus(4.1,calculator.makePlus(multiplication,degree));
        calculator.incrementCountOperation(); // увеличение счетчика использований калькулятора
        calculator.incrementCountOperation(); // увеличение счетчика использований калькулятора


        long quantityOfUsages=calculator.getCountOperation(); // подсчет итогового количества использований калькулятора

        System.out.format("Результат выражения равен: %.3f",result); // вывод результата с 3-мя знаками после запятой
        System.out.println();
        System.out.println("Количество использований калькулятора равно: "+quantityOfUsages);
    }
}
