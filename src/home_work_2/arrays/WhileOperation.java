package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class WhileOperation implements IArraysOperation {
    public static void main(String[] args) {
        int [] container= ArraysUtils.arrayFromConsole(); // Получение массива чисел

        IArraysOperation.printAllElements(container, 3); // Вызов метода по выводу всех элементов массива
        System.out.println();
        IArraysOperation.printSecondElement(container,3); // Вызов метода по выводу каждого второго элемента массива
        System.out.println();
        IArraysOperation.printReverseElements(container,3); // Вызов метода по выводу всех элементов массива в обратном порядке
        System.out.println();
    }
}
