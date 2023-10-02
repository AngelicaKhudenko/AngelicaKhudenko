package home_work_2.loops;

import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        boolean checkResult;
        String check;

        do { // Проверка на корректность введенных данных
            System.out.println("Введите целое положительное число");
            check=reader.nextLine();

            int problems = 0; // Создание переменной для подсчета нестандартных символов в строке
            for (int i = 0; i < check.length(); i++) {
                if (check.charAt(i) > '9'||check.charAt(i)<'0') {
                    problems++;
                }
            }

            checkResult=true;
            if (check.equals("0")) {
                System.out.println("Введен ноль");
                checkResult=false;
                continue;
            } else if ((check.contains(".") || check.contains(","))&&problems==1&&check.indexOf(".")!=(check.length()-1)&&check.indexOf(",")!=(check.length()-1)) {
                System.out.println("Введено не целое число");
                checkResult=false;
                continue;
            } else if (check.charAt(0) == '-' && problems == 1) {
                System.out.println("Введено отрицательное число");
                checkResult=false;
                continue;
            } else if (check.startsWith("00")) {
                System.out.println("Введено не число");
                checkResult=false;
                continue;
            } else if (problems >= 1) {
                System.out.println("Введено не число");
                checkResult=false;
                continue;
            } else if (check.length()>19||check.length()==19&&check.compareTo("9223372036854775807")>0) {
                System.out.println("Введено число больше диапазона long");
                checkResult=false;
            }
        } while (!checkResult);

        long multiplication=1; // Создание переменной для расчета умножения
        String result=""; // Создание строки для вывода результата

        for(int i=0; i<check.length(); i++) {
            char digit=check.charAt(i); // Создание символьной переменной для записи элемента строки
            byte num=Byte.parseByte(String.valueOf(digit)); // Считывание элемента строки в числовую переменную

            multiplication=multiplication*num;

            if (i==check.length()-1) {
                result=result+num+"="+multiplication;
            } else {
                result=result+num+"*";
            }
        }

        System.out.println(result);
    }
}
