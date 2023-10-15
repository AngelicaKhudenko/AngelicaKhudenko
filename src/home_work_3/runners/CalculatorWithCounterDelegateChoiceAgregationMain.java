package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

import javax.sound.midi.Soundbank;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        // экземпляр калькулятора, принимающий CalculatorWithOperator
        CalculatorWithOperator calculatorWithOperator=new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterOperator=new CalculatorWithCounterAutoChoiceAgregation(calculatorWithOperator);

        double divisionFirst=calculatorWithCounterOperator.makeDivision(28,5);
        double degreeFirst=calculatorWithCounterOperator.makeDegree(divisionFirst,2);
        double multiplicationFirst=calculatorWithCounterOperator.makeMultiplication(15,7);
        double resultFirst=calculatorWithCounterOperator.makePlus(4.1,calculatorWithCounterOperator.makePlus(multiplicationFirst,degreeFirst));

        long quantityOfUsagesFirst=calculatorWithCounterOperator.getCountOperation();

        System.out.println("Объект CalculatorWithOperator");
        System.out.format("Результат выражения равен: %.3f",resultFirst); // вывод результата с 3-мя знаками после запятой
        System.out.println();
        System.out.println("Количество использований калькулятора равно: "+quantityOfUsagesFirst);
        System.out.println("__________");

        // экземпляр калькулятора, принимающий CalculatorWithMathCopy
        CalculatorWithMathCopy calculatorWithMathCopy=new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterMathCopy=new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathCopy);

        double divisionSecond=calculatorWithCounterMathCopy.makeDivision(28,5);
        double degreeSecond=calculatorWithCounterMathCopy.makeDegree(divisionSecond,2);
        double multiplicationSecond=calculatorWithCounterMathCopy.makeMultiplication(15,7);
        double resultSecond=calculatorWithCounterMathCopy.makePlus(4.1,calculatorWithCounterMathCopy.makePlus(multiplicationSecond,degreeSecond));

        long quantityOfUsagesSecond=calculatorWithCounterOperator.getCountOperation();

        System.out.println("Объект CalculatorWithMathCopy");
        System.out.format("Результат выражения равен: %.3f",resultSecond); // вывод результата с 3-мя знаками после запятой
        System.out.println();
        System.out.println("Количество использований калькулятора равно: "+quantityOfUsagesSecond);
        System.out.println("__________");

        // экземпляр калькулятора, принимающий CalculatorWithMathExtends
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterMathExtends=new CalculatorWithCounterAutoChoiceAgregation(calculatorWithMathExtends);

        double divisionThird=calculatorWithCounterMathCopy.makeDivision(28,5);
        double degreeThird=calculatorWithCounterMathCopy.makeDegree(divisionThird,2);
        double multiplicationThird=calculatorWithCounterMathCopy.makeMultiplication(15,7);
        double resultThird=calculatorWithCounterMathCopy.makePlus(4.1,calculatorWithCounterMathCopy.makePlus(multiplicationThird,degreeThird));

        long quantityOfUsagesThird=calculatorWithCounterOperator.getCountOperation();

        System.out.println("Объект CalculatorWithMathExtends");
        System.out.format("Результат выражения равен: %.3f",resultThird); // вывод результата с 3-мя знаками после запятой
        System.out.println();
        System.out.println("Количество использований калькулятора равно: "+quantityOfUsagesThird);
    }
}
