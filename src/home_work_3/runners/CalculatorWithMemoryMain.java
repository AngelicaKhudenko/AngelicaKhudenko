package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorVersion=new CalculatorWithMathCopy();
        CalculatorWithMemory calculator=new CalculatorWithMemory(calculatorVersion);

        calculator.makeDivision(28,5);
        calculator.save(); // сохранение результата в память калькулятора

        calculator.makeDegree(calculator.load(),2);
        calculator.save(); // сохранение результата в память калькулятора

        calculator.makePlus(calculator.load(),4.1);
        calculator.save(); // сохранение результата в память калькулятора

        calculator.makePlus(calculator.load(),(calculator.makeMultiplication(15,7)));
        calculator.save(); // сохранение результата в память калькулятора

        System.out.format("Результат выражения равен: %.3f",calculator.load()); // вывод результата с 3-мя знаками после запятой
    }
}