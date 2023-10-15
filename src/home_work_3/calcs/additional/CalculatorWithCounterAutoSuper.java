package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long counter; // создание поля-счетчика количества использований калькулятора

    /**
     * Метод для деления двух чисел с подсчетом количества использований калькулятора
     * @param number - делимое
     * @param divider - делитель
     * @return - возвращает результат деления
     */
    public double makeDivision(double number, double divider) {
        counter++;
        return super.makeDivision(number,divider);
    }

    /**
     * Метод для умножения двух чисел с подсчетом количества использований калькулятора
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат умножения
     */
    public double makeMultiplication(double first, double second) {
        counter++;
        return super.makeMultiplication(first,second);
    }

    /**
     * Метод для вычитания второго числа из первого с подсчетом количества использований калькулятора
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат вычитания
     */
    public double makeMinus(double first, double second) {
        counter++;
        return super.makeMinus(first,second);
    }

    /**
     * Метод для суммы первого и второго чисел с подсчетом количества использований калькулятора
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат суммы
     */
    public double makePlus(double first, double second) {
        counter++;
        return super.makePlus(first,second);
    }

    /**
     * Метод для возведения в степень с подсчетом количества использований калькулятора
     * @param number - число, которое возводится в степень
     * @param degree - степень
     * @return - возвращает -1, если number<=0
     *         - возвращает результат возведения числа в степень в иных случаях
     */
    public double makeDegree(double number, int degree) {
        counter++;
        return super.makeDegree(number,degree);
    }

    /**
     * Метод для определения модуля с подсчетом количества использований калькулятора
     * @param number - число для определения его модуля
     * @return - возвращает результат определения модуля
     */
    public double makeModule(double number) {
        counter++;
        return super.makeModule(number);
    }

    /**
     * Метод для извлечения квадратного корня из числа с подсчетом использований кальулятора
     * @param number - число для вычисления квадратного корня
     * @return - возвращает -1, если number<0
     *         - возвращает квадратный корень из заданного числа в иных случаях
     */
    public double makeSquareRadical(double number) {
        counter++;
        return super.makeSquareRadical(number);
    }

    /**
     * Метод, который возвращает количество использований калькулятора
     * @return - возвращает количество использований калькулятора
     */
    public long getCountOperation(){
        return counter;
    }
}
