package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {
    public static void main(String[] args) {
        int [] container= ArraysUtils.arrayFromConsole(); // Получение массива чисел
        printAllElements(container); // Вызов метода по выводу всех элементов массива
        System.out.println();
        printSecondElement(container); // Вызов метода по выводу каждого второго элемента массива
        System.out.println();
        printReverseElements(container); // Вызов метода по выводу всех элементов массива в обратном порядке
    }

    /**
     * Метод выводит все элементы массива
     * @param container - массив элементов
     */
    public static void printAllElements(int []container) {
        int length=container.length; // Получение длины массива
        int i=0;

        for (i=0; i<length; i++) {
            System.out.print(container[i]+" ");
        }
        System.out.print("\t");

        i=0;
        do {
            System.out.print(container[i]+" ");
            i++;
        } while(i<length);
        System.out.print("\t");

        i=0;
        while (i<length) {
            System.out.print(container[i]+" ");
            i++;
        }
        System.out.print("\t");

        for (int element: container) {
            System.out.print(element+" ");
        }
    }

    /**
     * Метод выводит каждый второй элемент массива
     * @param container - массив элементов
     */
    public static void printSecondElement(int []container) {
        int length=container.length; // Получение длины массива
        if (length<2) {
            System.out.print("Длина массива не позволяет вывести каждый второй элемент"); // Проверка на факт введения менее двух чисел
        } else {
            int i=1;

            for (i=1; i<length; i+=2) {
                System.out.print(container[i]+" ");
            }
            System.out.print("\t");

            i=1;
            do {
                System.out.print(container[i]+" ");
                i+=2;
            } while(i<length);
            System.out.print("\t");

            i=1;
            while(i<length) {
                System.out.print(container[i]+" ");
                i+=2;
            }
            System.out.print("\t");

            int k=0;
            for (int element: container) {
                k++;
                if (k%2==0){
                    System.out.print(element+" ");
                }
            }
        }
    }

    /**
     * Метод выводит все элементы массива в обратном порядке
     * @param container - массив элементов
     */
    public static void printReverseElements(int []container) {
        int length=container.length; // Получение длины массива
        int i=length-1;

        for (i=length-1; i>=0; i--) {
            System.out.print(container[i]+" ");
        }
        System.out.print("\t");

        i=length-1;
        do {
            System.out.print(container[i]+" ");
            i--;
        } while(i>=0);
        System.out.print("\t");

        i=length-1;
        while(i>=0) {
            System.out.print(container[i]+" ");
            i--;
        }
        System.out.print("\t");

        String result="";
        for (int element: container) {
            result=element+" "+result;
        }
        System.out.print(result);
    }
}
