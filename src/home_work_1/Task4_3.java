package home_work_1;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first;
        do {
            System.out.println("Введите первое целое число, отличное от нуля:");
            first = reader.nextInt();
        } while (first == 0);

        int second;
        do {
            System.out.println("Введите второе целое число, отличное от нуля:");
            second = reader.nextInt();
        } while (second == 0);

        int checkBigger=checkDivisionBigger(first,second); // Вызов метода по определению делимого
        int checkSmaller; // Переменная для записи делителя
        if (checkBigger==first){ // Инициализация делителя
            checkSmaller=second;
        } else {
            checkSmaller=first;
        }

        if (checkBigger%checkSmaller==0) { // Вывод информации о делителе и частном
            System.out.println(checkBigger+" кратно "+checkSmaller +". Результат: "+checkBigger/checkSmaller);
        } else {
            System.out.println(checkBigger+" больше "+checkSmaller+". Оно не делится на "+checkSmaller+" без остатка. Частное: "+checkBigger/checkSmaller+". Остаток: "+checkBigger%checkSmaller);
        }
    }

    /**
     * Метод, который проверяет, какое число из двух делится на другое
     * @param first - первое число (целое, отличное от нуля)
     * @param second - второе число (целое, отличное от нуля)
     * @return first - первое число, если первое число больше второго
     *         second - второе число, если второе число больше первого
     *         0 - если в качестве одного из аргументов передан 0
     */
    public static int checkDivisionBigger(int first, int second) {
        if (first==0||second==0){
            return 0;
        }
        if (first>second) {
            return first;
        }
        return second;
    }
}
