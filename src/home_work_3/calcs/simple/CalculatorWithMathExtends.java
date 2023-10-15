package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     * Метод возведения в степень (переопределение)
     * @param number - число, которое возводится в степень
     * @param degree - степень
     * @return - возвращает -1, если number<=0
     *         - возвращает результат возведения числа в степень в иных случаях
     */
    public double makeDegree(double number, int degree) {
        if (number<=0){ // проверка на тот случай, если передано отрицательное число для возведения в степень или ноль
            return -1;
        }

        return Math.pow(number,degree);
    }

    /**
     * Метод определения модуля числа (переопределение)
     * @param number - число для определения его модуля
     * @return - возвращает заданное число после операции модуля
     */
    public double makeModule(double number) {
        return Math.abs(number);
    }

    /**
     * Метод вычисления квадратного корня (переопределение)
     * @param number - число для вычисления квадратного корня
     * @return - возвращает -1, если number<0
     *         - возвращает квадратный корень из заданного числа в иных случаях
     */
    public double makeSquareRadical(double number) {
        if (number<0) {
            return -1;
        } else {
            return Math.sqrt(number);
        }
    }
}
