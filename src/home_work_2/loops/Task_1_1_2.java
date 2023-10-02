package home_work_2.loops;

import java.util.Scanner;

public class Task_1_1_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean checkResult=true;
        byte num=0;

        do { // Проверка на корректность введенных данных
            System.out.println("Введите целое положительное число не больше 20"); // Значения факториалов чисел больше 20 - больше максимального значения long, что приведет к переполнению
            String check = reader.nextLine();

            if (check.length()==2&&check.compareTo("20")<=0&&check.compareTo("10")>=0||check.length()==1&&check.compareTo("1")>=0&&check.compareTo("9")<=0) {
                num=Byte.parseByte(check);
                checkResult=true;
            } else {
                System.out.println("Введено некорректное значение, не соответствующее заданному условию");
                checkResult=false;
            }
        } while (!checkResult);

        long factorial=findFactorial(num); // Вызов функции для нахождения факториала

        String result=""; // Создание пустой строки для вывода результата
        for (int i=1; i<=num; i++) {
            if (i==num){
                result=result+i+"="+factorial;
            } else {
                result=result+i+"*";
            }
        }

        System.out.println(result);
    }

    /**
     * Метод получения факториала от заданного числа
     * @param num - заданное число
     * @return - факториал заданного числа
     */
    public static long findFactorial (byte num) {
        if (num==1) {
            return 1;
        } else {
            return num*findFactorial((byte) (num-1));
        }
    }
}
