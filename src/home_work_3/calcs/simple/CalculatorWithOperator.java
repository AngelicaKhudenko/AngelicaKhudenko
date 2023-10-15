package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    /**
     * Метод выполнения деления двух чисел
     * @param number - делимое
     * @param divider - делитель
     * @return - возвращает результат деления делимого на делитель
     */
    public double makeDivision(double number, double divider) {
        return number/divider;
    }

    /**
     * Метод умножения двух чисел
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат умножения первого числа на второе
     */
    public double makeMultiplication(double first, double second) {
        return first*second;
    }

    /**
     * Метод вычитания двух чисел
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат вычитания второго числа из первого
     */
    public double makeMinus(double first, double second) {
        return first-second;
    }

    /**
     * Метод суммы двух чисел
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат суммы первого и второго чисел
     */
    public double makePlus(double first, double second) {
        return first+second;
    }

    /**
     * Метод возведения в степень
     * @param number - число, которое возводится в степень
     * @param degree - степень
     * @return  - возвращает -1, если number<=0
     *          - вовзращает 1, если degree=0
     *          - возвращает результат возведения числа в степень в иных случаях (result)
     */
    public double makeDegree(double number, int degree) {
        if (number<=0){ // проверка на тот случай, если передано отрицательное число для возведения в степень или ноль
            return -1;
        }

        if (degree==0){ // проверка на тот случай, если число возводится в нулевую степень
            return 1;
        }

        double result=1;
        if (degree<0){ // проверка на тот случай, если число возводится в отрицательное число
            degree=degree*(-1); // операция, равная модулю числа
            for (int i=1; i<=degree; i++){
                result=result*number;
            }
            result=1/result;
        } else {
            for (int i=1; i<=degree; i++){
                result=result*number;
            }
        }

        return result;
    }

    /**
     * Метод определения модуля числа
     * @param number - число для определения его модуля
     * @return result - возвращает заданное число после операции модуля
     */
    public double makeModule(double number) {
        double result=number;

        if (result<0) {
            result=result*(-1);
        }

        return result;
    }

    /**
     * Метод вычисления квадратного корня из числа
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
