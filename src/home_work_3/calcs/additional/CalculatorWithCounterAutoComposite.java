package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calculator=new CalculatorWithMathCopy(); // поле, хранящее объект класса калькулятор
    private long counter; // создание поля-счетчика количества использований калькулятора

    /**
     * Метод выполнения деления двух чисел с помощью делегирования, а также с подсчетом количества использований калькулятора
     * @param number - делимое
     * @param divider - делитель
     * @return - возвращает результат деления делимого на делитель
     */
    public double makeDivision(double number, double divider) {
        counter++;
        return calculator.makeDivision(number,divider);
    }

    /**
     * Метод умножения двух чисел с помощью делегирования, а также с подсчетом количества использований калькулятора
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат умножения первого числа на второе
     */
    public double makeMultiplication(double first, double second) {
        counter++;
        return calculator.makeMultiplication(first,second);
    }

    /**
     * Метод вычитания двух чисел с помощью делегирования, а также с подсчетом количества использований калькулятора
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат вычитания второго числа из первого
     */
    public double makeMinus(double first, double second) {
        counter++;
        return calculator.makeMinus(first,second);
    }

    /**
     * Метод суммы двух чисел с помощью делегирования, а также с подсчетом количества использований калькулятора
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат суммы первого и второго чисел
     */
    public double makePlus(double first, double second) {
        counter++;
        return calculator.makePlus(first,second);
    }

    /**
     * Метод возведения в степень с помощью делегирования, а также с подсчетом количества использований калькулятора
     * @param number - число, которое возводится в степень
     * @param degree - степень
     * @return - возвращает -1, если number<=0
     *         - возвращает результат возведения числа в степень в иных случаях
     */

    public double makeDegree(double number, int degree) {
        counter++;
        return calculator.makeDegree(number,degree);
    }

    /**
     * Метод поиска модуля числа с помощью делегирования, а также с подсчетом количества использований калькулятора
     * @param number - число для определения его модуля
     * @return - возвращает заданное число после операции модуля
     */
    public double makeModule(double number) {
        counter++;
        return calculator.makeModule(number);
    }

    /**
     * Метод определения квадратного корня с помощью делегирования, а также с подсчетом количества использований калькулятора
     * @param number - число для вычисления квадратного корня
     * @return - возвращает -1, если number<0
     *         - возвращает квадратный корень из заданного числа в иных случаях
     */
    public double makeSquareRadical(double number) {
        counter++;
        return calculator.makeSquareRadical(number);
    }

    /**
     * Метод, который возвращает количество использований калькулятора
     * @return - возвращает количество использований калькулятора
     */
    public long getCountOperation(){
        return counter;
    }
}
