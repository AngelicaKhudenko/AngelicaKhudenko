package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class WhileOperation implements IArraysOperation {
    public String printAllElements(int[] container) {
        int length = container.length; // Получение длины массива
        int i = 0;

        String result="";
        while (i < length) {
            result+=container[i] + " ";
            i++;
        }
        return result.trim();
    }

    public String printSecondElement(int[] container) {
        int length = container.length; // Получение длины массива
        int i = 1;
        if (length < 2) {
            return "Длина массива не позволяет вывести каждый второй элемент";
        }

        String result="";
        while (i < length) {
            result+=container[i] + " ";
            i += 2;
        }
        return result.trim();
    }

    public String printReverseElements(int[] container) {
        int length = container.length; // Получение длины массива
        int i = length - 1;

        String result="";
        while (i >= 0) {
            result+=container[i] + " ";
            i--;
        }
        return result.trim();
    }
}
