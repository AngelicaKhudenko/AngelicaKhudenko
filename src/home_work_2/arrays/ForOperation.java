package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForOperation implements IArraysOperation {

    public String printAllElements(int[] container) {
        int length = container.length; // Получение длины массива
        int i = 0;

        String result="";
        for (i = 0; i < length; i++) {
            result+=container[i] + " ";
        }
        return result.trim();
    }

    public String printSecondElement(int[] container) {
        int length = container.length; // Получение длины массива
        int i = 1;
        if (length < 2) { // Проверка на факт введения менее двух чисел
            return "Длина массива не позволяет вывести каждый второй элемент";
        }

        String result="";
        for (i = 1; i < length; i += 2) {
            result+=container[i] + " ";
        }
        return result.trim();
    }

    public String printReverseElements(int[] container) {
        int length = container.length; // Получение длины массива
        int i = length - 1;

        String result="";
        for (i = length - 1; i >= 0; i--) {
            result+=container[i] + " ";
        }
        return result.trim();
    }
}
