package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class DoWhileOperation implements IArraysOperation {
    public static void main(String[] args) {
        int [] container= ArraysUtils.arrayFromConsole(); // Получение массива чисел

        IArraysOperation.printAllElements(container, 2); // Вызов метода по выводу всех элементов массива
        System.out.println();
        IArraysOperation.printSecondElement(container,2); // Вызов метода по выводу каждого второго элемента массива
        System.out.println();
        IArraysOperation.printReverseElements(container,2); // Вызов метода по выводу всех элементов массива в обратном порядке
    }
}
