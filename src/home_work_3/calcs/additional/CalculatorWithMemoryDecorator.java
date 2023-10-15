package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator calculator; // поле, хранящее объект типа ICalculator
    private double resultAfterCalculation; // поле для записи результата вычисления каждого действия калькулятора
    private double memory; // поле для записи памяти калькулятора

    public CalculatorWithMemoryDecorator(ICalculator calculator) { // конструктор создания калькулятора
        this.calculator=calculator;
    }

    /**
     * Метод выполнения деления двух чисел с помощью делегирования
     * @param number - делимое
     * @param divider - делитель
     * @return - возвращает результат деления делимого на делитель и записывает этот результат в поле для записи результата вычисления
     */
    public double makeDivision(double number, double divider) {
        return resultAfterCalculation=calculator.makeDivision(number,divider);
    }

    /**
     * Метод умножения двух чисел с помощью делегирования
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат умножения первого числа на второе и записывает этот результат в поле для записи результата вычисления
     */
    public double makeMultiplication(double first, double second) {
        return resultAfterCalculation=calculator.makeMultiplication(first,second);
    }

    /**
     * Метод вычитания двух чисел с помощью делегирования
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат вычитания второго числа из первого и записывает этот результат в поле для записи результата вычисления
     */
    public double makeMinus(double first, double second) {
        return resultAfterCalculation=calculator.makeMinus(first,second);
    }

    /**
     * Метод суммы двух чисел с помощью делегирования
     * @param first - первое число
     * @param second - второе число
     * @return - возвращает результат суммы первого и второго чисел и записывает этот результат в поле для записи результата вычисления
     */
    public double makePlus(double first, double second) {
        return resultAfterCalculation=calculator.makePlus(first,second);
    }

    /**
     * Метод возведения в степень с помощью делегирования
     * @param number - число, которое возводится в степень
     * @param degree - степень
     * @return - возвращает -1, если number<=0, и записывает этот результат в поле для записи результата вычисления
     *         - возвращает результат возведения числа в степень в иных случаях и записывает этот результат в поле для записи результата вычисления
     */
    public double makeDegree(double number, int degree) {
        return resultAfterCalculation=calculator.makeDegree(number,degree);
    }

    /**
     * Метод поиска модуля числа с помощью делегирования
     * @param number - число для определения его модуля
     * @return - возвращает заданное число после операции модуля и записывает этот результат в поле для записи результата вычисления
     */
    public double makeModule(double number) {
        return resultAfterCalculation=calculator.makeModule(number);
    }

    /**
     * Метод определения квадратного корня с помощью делегирования
     * @param number - число для вычисления квадратного корня
     * @return - возвращает -1, если number<0, и записывает этот результат в поле для записи результата вычисления
     *         - возвращает квадратный корень из заданного числа в иных случаях и записывает этот результат в поле для записи результата вычисления
     */
    public double makeSquareRadical(double number) {
        return resultAfterCalculation=calculator.makeSquareRadical(number);
    }

    /**
     * Метод для записи результата выполнения вычисления последним вызванным методом в память результата - в поле memory
     */
    public void save() {
        memory=resultAfterCalculation;
    }

    /**
     * Метод для получения из памяти записанного значения
     * @return - возвращает результат выполнения последнего вызванного метода из памяти результата
     */
    public double load() {
        double middle=memory; // создание переменной для метода трех стаканов
        memory=0; // обнуление памяти
        return middle;
    }
}
