package home_work_3.calcs.api;

public interface ICalculator {
    /**
     * Метод выполнения деления двух чисел
     * @param number - делимое
     * @param divider - делитель
     * @return - возвращает результат деления делимого на делитель
     */
    double makeDivision(double number, double divider);

    /**
     * Метод умножения двух чисел
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат умножения первого числа на второе
     */
    double makeMultiplication(double first, double second);

    /**
     * Метод вычитания двух чисел
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат вычитания второго числа из первого
     */
    double makeMinus(double first, double second);

    /**
     * Метод суммы двух чисел
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат суммы первого и второго чисел
     */
    double makePlus(double first, double second);

    /**
     * Метод возведения в степень с помощью библиотеки Math
     * @param number - число, которое возводится в степень
     * @param degree - степень
     * @return - возвращает -1, если number<=0
     *         - возвращает результат возведения числа в степень в иных случаях
     */
    double makeDegree(double number, int degree);

    /**
     * Метод определения модуля числа с помощью библиотеки Math
     * @param number - число для определения его модуля
     * @return - возвращает заданное число после операции модуля
     */
    double makeModule(double number);

    /**
     * Метод вычисления квадратного корня с помощью библиотеки Math
     * @param number - число для вычисления квадратного корня
     * @return - возвращает -1, если number<0
     *         - возвращает квадратный корень из заданного числа в иных случаях
     */
    double makeSquareRadical(double number);
}
