package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task_1_5_Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        Task_1_5 task=new Task_1_5();

        // 1.5.1. Найти наибольшую цифру натурального числа

        boolean checkInfo;
        String checkNatural;

        do { // Проверка на корректность введенных данных для минимума
            System.out.println("Введите натуральное число");
            checkNatural = reader.nextLine();
            checkInfo = task.checkNumber(checkNatural); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int number=Integer.parseInt(checkNatural);

        byte max=task.findMaxDigit(number); // Вызов функции поиска наибольшей цифры в числе
        System.out.println("Наибольшая цифра в заданном числе "+number+" равна "+max);

        System.out.println();

        // 1.5.2. Вероятность четных случайных чисел

        Random rnd=new Random(); // Создание массива рандомных чисел
        int [] numberRandom=new int[1000];
        int even=0;
        for (int i=0; i<1000; i++) {
            numberRandom[i]=rnd.nextInt(100);
            if (numberRandom[i] % 2 == 0) {
                even++;
            }
        }

        double probability=task.findProbability(numberRandom, even); // Вызов функции определения вероятности выпадения четных чисел
        System.out.println("Вероятность выпадения четных чисел на выборке не меньше 1000 составляет "+probability+"%");

        System.out.println();

        // 1.5.3. Посчитать четные и нечетные цифры числа

        String evenOdd=task.infoOnEvenAndOdd(number); // Вызов функции подсчета четных и нечетных цифр числа
        System.out.println("Введено число "+ number+". "+evenOdd);

        System.out.println();

        // 1.5.4. Ряд Фибоначчи

        String checkRow;

        do { // Проверка на корректность введенных данных для минимума
            System.out.println("Введите натуральное число, обозначающее число для вывода ряда Фибоначчи");
            checkRow = reader.nextLine();
            checkInfo = task.checkNumber(checkRow); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int numberRow=Integer.parseInt(checkRow);

        String rowFibonacci=task.makeRowFibonachi(numberRow); // Вызов функции по выведению ряда Фибоначчи
        System.out.println("Ряд Фибоначчи: "+rowFibonacci);

        System.out.println();

        // 1.5.5. Вывести ряд чисел в диапазоне с шагом

        String checkMinimum;
        String checkMaximim;
        String checkStep;

        do { // Проверка на корректность введенных данных для минимума
            System.out.println("Введите натуральное число, обозначающее минимум");
            checkMinimum = reader.nextLine();
            checkInfo = task.checkNumber(checkMinimum); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int minimum=Integer.parseInt(checkMinimum);

        do { // Проверка на корректность введенных данных для максимума
            System.out.println("Введите натуральное число, обозначающее максимум");
            checkMaximim=reader.nextLine();
            checkInfo = task.checkNumber(checkMaximim); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int maximum=Integer.parseInt(checkMaximim);

        do { // Проверка на корректность введенных данных для шага
            System.out.println("Введите натуральное число, обозначающее шаг");
            checkStep=reader.nextLine();
            checkInfo = task.checkNumber(checkStep); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int step=Integer.parseInt(checkStep);

        String resultMinimumMaximumStep=task.naturalNumberStep(minimum,maximum,step); // Вызов функции вывода ряда чисел в диапазоне с шагом
        System.out.println(resultMinimumMaximumStep);

        System.out.println();

        // 1.5.6. Переворот числа

        String checkFirstNumber;

        do { // Проверка на корректность введенных данных для шага
            System.out.println("Введите натуральное число");
            checkFirstNumber=reader.nextLine();
            checkInfo = task.checkNumber(checkFirstNumber); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int firstNumber=Integer.parseInt(checkFirstNumber);
        String numberReverse=task.makeNumberReverse(firstNumber); // Вызов функции по формированию числа в обратном порядке
        System.out.println(numberReverse);
    }
}
