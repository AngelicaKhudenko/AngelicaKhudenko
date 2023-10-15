package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long counter; // создание поля-счетчика количества использований калькулятора

    /**
     * Метод, увеличивающий счетчик-поле в калькуляторе при каждом использовании калькулятора
     */
    public void incrementCountOperation() {
        counter++;
    }

    /**
     * Метод, который возвращает количество использований калькулятора
     * @return - возвращает количество использований калькулятора
     */
    public long getCountOperation() {
        return counter;
    }
}
