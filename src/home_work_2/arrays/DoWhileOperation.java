package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class DoWhileOperation implements IArraysOperation {
    public String printAllElements(int[] container) {
        int length = container.length; // Получение длины массива
        int i = 0;

        String result="";
        do {
            result+=container[i] + " ";
            i++;
        } while (i < length);
        return result.trim();
    }

    public String printSecondElement(int[] container) {
        int length = container.length; // Получение длины массива
        int i = 1;
        if (length < 2) { // Проверка на факт введения менее двух чисел
            return "Длина массива не позволяет вывести каждый второй элемент";
        }

        String result="";
        do {
            result+=container[i] + " ";
            i += 2;
        } while (i < length);
        return result.trim();
    }

    public String printReverseElements(int[] container) {
        int length = container.length; // Получение длины массива
        int i = length - 1;

        String result="";
        do {
            result+=container[i] + " ";
            i--;
        } while (i >= 0);
        return result.trim();
    }
}
