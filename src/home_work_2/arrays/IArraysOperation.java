package home_work_2.arrays;

public interface IArraysOperation {

    /**
     * Метод выводит все элементы массива
     * @param container - массив элементов
     * @param methodInfo - информация о способе выполнения задачи (1-цикл for; 2-цикл do....while; 3 - цикл while; 4 - цикл foreach)
     */
    public static void printAllElements(int[] container, int methodInfo) {
        int length = container.length; // Получение длины массива
        int i = 0;

        if (methodInfo == 1) {
            System.out.println("Все элементы массива:");
            for (i = 0; i < length; i++) {
                System.out.print(container[i] + " ");
            }
        } else if (methodInfo == 2) {
            System.out.println("Все элементы массива:");
            do {
                System.out.print(container[i] + " ");
                i++;
            } while (i < length);
        } else if (methodInfo == 3) {
            System.out.println("Все элементы массива:");
            while (i < length) {
                System.out.print(container[i] + " ");
                i++;
            }
        } else if (methodInfo == 4) {
            System.out.println("Все элементы массива:");
            for (int element : container) {
                System.out.print(element + " ");
            }
        }
    }

    /**
     * Метод выводит каждый второй элемент массива
     * @param container - массив элементов
     * @param methodInfo - информация о способе выполнения задачи (1-цикл for; 2-цикл do....while; 3 - цикл while; 4 - цикл foreach)
     */
    public static void printSecondElement(int[] container, int methodInfo) {
        int length = container.length; // Получение длины массива
        int i = 1;
        if (length < 2) {
            System.out.print("Длина массива не позволяет вывести каждый второй элемент"); // Проверка на факт введения менее двух чисел
        } else if (methodInfo == 1) {
            System.out.println("Каждый второй элемент массива:");
            for (i = 1; i < length; i += 2) {
                System.out.print(container[i] + " ");
            }
        } else if (methodInfo == 2) {
            System.out.println("Каждый второй элемент массива:");
            do {
                System.out.print(container[i] + " ");
                i += 2;
            } while (i < length);
        } else if (methodInfo == 3) {
            System.out.println("Каждый второй элемент массива:");
            while (i < length) {
                System.out.print(container[i] + " ");
                i += 2;
            }
        } else if (methodInfo == 4) {
            System.out.println("Каждый второй элемент массива:");
            int k = 0;
            for (int element : container) {
                k++;
                if (k % 2 == 0) {
                    System.out.print(element + " ");
                }
            }
        }
    }

    /**
     * Метод выводит все элементы массива в обратном порядк
     * @param container - массив элементов
     * @param methodInfo - информация о способе выполнения задачи (1-цикл for; 2-цикл do....while; 3 - цикл while; 4 - цикл foreach)
     */
    public static void printReverseElements(int[] container, int methodInfo) {
        int length = container.length; // Получение длины массива
        int i = length - 1;

        if (methodInfo == 1) {
            System.out.println("Массив в обратном порядке:");
            for (i = length - 1; i >= 0; i--) {
                System.out.print(container[i] + " ");
            }
        } else if (methodInfo == 2) {
            System.out.println("Массив в обратном порядке:");
            do {
                System.out.print(container[i] + " ");
                i--;
            } while (i >= 0);
        } else if (methodInfo == 3) {
            System.out.println("Массив в обратном порядке:");
            while (i >= 0) {
                System.out.print(container[i] + " ");
                i--;
            }
        } else if (methodInfo == 4) {
            System.out.println("Массив в обратном порядке:");
            String result = "";
            for (int element : container) {
                result = element + " " + result;
            }
            System.out.print(result);
        }
    }
}

