package home_work_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        // Задача 1. Даны длины катетов прямоугольного треугольника. Найдите гипотенузу треугольника
        System.out.println("Задача 1");
        System.out.println("Введите длину первого катета треугольника:");
        double a=reader.nextDouble();
        System.out.println("Введите длину второго катета треугольника:");
        double b=reader.nextDouble();
        if (a<0||b<0) {
            System.out.println("Ошибка заданных параметров. Вместо отрицательных значений записан модуль числа");
        }
        a=Math.abs(a);
        b=Math.abs(b);
        double c=Math.pow((Math.pow(a,2)+Math.pow(b,2)),0.5);
        System.out.println("Длина гипотенузы равна: "+c);

        // Задача 2. По условию дано общее количество конфет в кг. Определите, какое количество целых новогодних подарков из них получится
        System.out.println("Задача 2");
        System.out.println("Введите общий вес конфет в килограммах:");
        double sweets=reader.nextDouble();
        System.out.println("Введите вес одного новогоднего подарка:");
        double present=reader.nextDouble();
        System.out.println("Итого получится подарков: "+(int)Math.floor(sweets/present));

        // Задача 3. Определите, какое количество упаковок плитки необходимо приобрести, чтобы сделать ремонт пола с заданной площадью
        System.out.println("Задача 3");
        System.out.println("Введите площадь пола:");
        double floor=reader.nextDouble();
        System.out.println("Введите площадь плитки в одной упаковке:");
        double square=reader.nextDouble();
        System.out.println("Итого вам необходимо приобрести "+(int)Math.ceil(floor/square)+" упаковок плитки для ремонта");
    }
}
