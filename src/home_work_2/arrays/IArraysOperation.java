package home_work_2.arrays;

public interface IArraysOperation {
    /**
     * Метод,который возвращает строку со всеми элементами массива
     * @param container - массив элементов
     * @return - строка со всеми элементами массива
     */
    String printAllElements(int[] container);

    /**
     * Метод, который возвращает строку с каждым вторым элементом массива
     * @param container - массив элементов
     * @return - строка с каждым вторым элементом массива
     *         - "Длина массива не позволяет вывести каждый второй элемент", если передан массив размером меньше двух
     */
    String printSecondElement(int[] container);

    /**
     * Метод,который возвращает все элементы массива в обратном порядке
     * @param container- массив элементов
     * @return - строка со всеми элементами массива в обратном порядке
     */
    String printReverseElements(int[] container);
}

