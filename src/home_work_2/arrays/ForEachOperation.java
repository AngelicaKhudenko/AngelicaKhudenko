package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForEachOperation implements IArraysOperation {
    public String printAllElements(int[] container) {
        int i = 0;

        String result="";
        for (int element : container) {
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
        int k = 0;
        for (int element : container) {
            k++;
            if (k % 2 == 0) {
                result+=element + " ";
            }
        }
        return result.trim();
    }

    public String printReverseElements(int[] container) {
        int length = container.length; // Получение длины массива
        int i = length - 1;

        String result = "";
        for (int element : container) {
            result = element + " " + result;
        }
        return result.trim();
    }
}
