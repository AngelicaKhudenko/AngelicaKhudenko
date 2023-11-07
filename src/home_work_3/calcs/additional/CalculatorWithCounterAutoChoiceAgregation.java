package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private CalculatorWithOperator calculatorWithOperator; // поле для первого варианта конструктора
    private CalculatorWithMathCopy calculatorWithMathCopy; // поле для второго варианта конструктора
    private CalculatorWithMathExtends calculatorWithMathExtends; // поле для третьего варианта конструктора

    private long counter; // создание поля-счетчика количества использований калькулятора

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) { // первый конструктор
        this.calculatorWithOperator = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) { // второй конструктор
        this.calculatorWithMathCopy = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) { // третий конструктор
        this.calculatorWithMathExtends = calculator;
    }

    /**
     * Метод выполнения деления двух чисел с помощью делегирования в зависимости от выбора объекта, а также с подсчетом количества использований калькулятора
     * @param number - делимое
     * @param divider - делитель
     * @return - возвращает результат деления делимого на делитель
     *         - возвращает -1, если переданный объект в конструктор не соответствует условию
     */
    public double makeDivision(double number, double divider) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.makeDivision(number, divider);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.makeDivision(number, divider);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.makeDivision(number, divider);
        } return -1;
    }

    /**
     * Метод умножения двух чисел с помощью делегирования в зависимости от выбора объекта, а также с подсчетом количества использований калькулятора
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат умножения первого числа на второе
     *         - возвращает -1, если переданный объект в конструктор не соответствует условию
     */
    public double makeMultiplication(double first, double second) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.makeMultiplication(first,second);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.makeMultiplication(first,second);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.makeMultiplication(first,second);
        } return -1;
    }

    /**
     * Метод вычитания двух чисел с помощью делегирования в зависимости от выбора объекта, а также с подсчетом количества использований калькулятора
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат вычитания второго числа из первого
     *         - возвращает -1, если переданный объект в конструктор не соответствует условию
     */
    public double makeMinus(double first, double second) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.makeMinus(first,second);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.makeMinus(first,second);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.makeMinus(first,second);
        } return -1;
    }

    /**
     * Метод суммы двух чисел с помощью делегирования в зависимости от выбора объекта, а также с подсчетом количества использований калькулятора
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат суммы первого и второго чисел
     *         - возвращает -1, если переданный объект в конструктор не соответствует условию
     */
    public double makePlus(double first, double second) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.makePlus(first,second);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.makePlus(first,second);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.makePlus(first,second);
        } return -1;
    }

    /**
     * Метод возведения в степень с помощью делегирования в зависимости от выбора объекта, а также с подсчетом количества использований калькулятора
     * @param number - число, которое возводится в степень
     * @param degree - степень
     * @return - возвращает результат возведения числа в степень
     *         - возвращает -10, если переданный объект в конструктор не соответствует условию
     *         - возвращает -1, если number<=0
     */

    public double makeDegree(double number, int degree) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.makeDegree(number,degree);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.makeDegree(number,degree);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.makeDegree(number,degree);
        } return -10;
    }

    /**
     * Метод поиска модуля числа с помощью делегирования в зависимости от выбора объекта, а также с подсчетом количества использований калькулятора
     * @param number - число для определения его модуля
     * @return - возвращает заданное число после операции модуля
     *         - возвращает -1, если переданный объект в конструктор не соответствует условию
     */
    public double makeModule(double number) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.makeModule(number);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.makeModule(number);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.makeModule(number);
        } return -1;
    }

    /**
     * Метод определения квадратного корня с помощью делегирования в зависимости от выбора объекта, а также с подсчетом количества использований калькулятора
     * @param number - число для вычисления квадратного корня
     * @return - возвращает квадратный корень из заданного числа, если число отрицательное
     *         - возвращает -10, если переданный объект в конструктор не соответствует условию
     *         - возвращает -1, если number<0
     */
    public double makeSquareRadical(double number) {
        counter++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.makeSquareRadical(number);
        } else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.makeSquareRadical(number);
        } else if (calculatorWithMathExtends != null) {
            return calculatorWithMathExtends.makeSquareRadical(number);
        } return -10;
    }

    /**
     * Метод, который возвращает количество использований калькулятора
     * @return - возвращает количество использований калькулятора
     */
    public long getCountOperation(){
        return counter;
    }
}
