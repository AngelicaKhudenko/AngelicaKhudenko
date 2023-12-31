package home_work_1;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите единицу измерения (байты или килобайты):");
        String measure = reader.nextLine();
        System.out.println("Введите число:");
        double n = reader.nextDouble();
        double result=converter(measure, n);

        if (measure.contains("килобайт")) {
            System.out.println(n + " килобайт = " + result + " байт");
        } else if (measure.contains("байт")&&!measure.contains("килло")) { // Проверка на правильность написания единицы измерения
            System.out.println(n+" байт = "+result+" килобайт");
        } else {
            System.out.println("Единица измерения введена неверно"); // Проверка на правильность написания единицы измерения
        }
    }

    /**
     * Метод, который переводит число в байтах в килобайты и наоборот
     * @param measure - единица измерения (байты или килобайты)
     * @param n - число
     * @return result - результат перевода байты в килобайты или наоборот
     *                - -1, если единица измерения введена неверно
     */
    public static double converter(String measure, double n) {
        double result;
        if (measure.contains("килобайт")) {
            result = n * 1024;
        } else if (measure.contains("байт")&&!measure.contains("килло")) { // Проверка на правильность написания единицы измерения
            result = n / 1024;
        } else result=-1;

        return result;
    }
}
