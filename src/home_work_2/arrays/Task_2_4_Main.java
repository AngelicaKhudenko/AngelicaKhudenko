package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_4_Main {
    public static void main(String[] args) {
        Task_2_4 task=new Task_2_4();

        int size = 50;
        int maxValueExclusion = 100;
        int[] container = ArraysUtils.arrayRandom(size, maxValueExclusion); // Создание массива
        System.out.println("Сформированный массив");
        System.out.println(Arrays.toString(container));

        System.out.println();

        // 2.4.1. Сумма четных положительных элементов массива

        int summa=task.findSumPositive(container); // Вызов метода для поиска суммы четных положительных элементов массива
        System.out.println("Сумма четных положительных элементов массива равна: " + summa);

        System.out.println();

        // 2.4.2. Максимальный из элементов массива с четными индексами

        int maxEvenIndex=task.findMaximumEven(container); // Вызов метода для поиска максимального элемента среди элементов массива с четными индексами
        System.out.println("Максимальный элемент массива среди элементов с четными индексами: " + maxEvenIndex);

        System.out.println();

        // 2.4.3. Элементы массива, которые меньше среднего арифметического

        int [] indexLessMiddle=task.findIndexLessMiddle(container); // Вызов метода для поиска элементов массива, которые меньше среднего арифметического
        System.out.print("Элементы массива, которые меньше среднего арифметического: ");
        for (int i=0; i<indexLessMiddle.length; i++){ // Вывод полученного массива элементов
            System.out.print(indexLessMiddle[i]+" ");
        }

        System.out.println();
        System.out.println();

        // 2.4.4. Найти два наименьших (минимальных) элемента массива

        int [] minimumTwo=task.findTwoMinimum(container); // Вызов метода для поиска двух минимальных значений
        System.out.print("Два минимальных элемента массива: ");
        for (int i=0; i<2; i++){ // Вывод полученного массива элементов
            System.out.print(minimumTwo[i]+" ");
        }

        System.out.println();
        System.out.println();

        // 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу

        Scanner reader=new Scanner(System.in);
        boolean checkInfo;
        String checkLeft;
        String checkRight;

        do { // Проверка на корректность введенных данных для границ отрезка
            System.out.println("Введите левую границу интервала для сжатия массива");
            checkLeft = reader.nextLine();
            checkInfo = task.checkNumber(checkLeft); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int left=Integer.parseInt(checkLeft);

        do { // Проверка на корректность введенных данных для границ отрезка
            System.out.println("Введите правую границу интервала для сжатия массива");
            checkRight = reader.nextLine();
            checkInfo = task.checkNumber(checkRight); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int right=Integer.parseInt(checkRight);

        int []changedMass=task.createChangedMass(container,left,right); // Вызов метода для сжатия массива
        System.out.println("Массив после сжатия: "+Arrays.toString(changedMass));

        System.out.println();

        // 2.4.6. Сумма цифр массива

        int sumDigits=task.findSumDigits(container); // Вызов метода для нахождения суммы цифр массива
        System.out.println("Сумма всех цифр массива равна: "+sumDigits);
    }
}
