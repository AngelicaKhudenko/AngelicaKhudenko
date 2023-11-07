package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        boolean checkInfo=false;

        String check1="";
        String check2="";

        do {
            System.out.println("Введите первое целое число:"); // Число 100, или 01100100
            check1 = reader.nextLine();
            checkInfo=checkNumber(check1);
            if (!checkInfo){
                System.out.println("Введено число, которое не попадает в допустимый диапазон");
            }
        } while (!checkInfo);

        do {
            System.out.println("Введите второе целое число:"); // Число 99, или 001100011
            check2=reader.nextLine();
            checkInfo=checkNumber(check2);
            if (!checkInfo){
                System.out.println("Введено число, которое не попадает в допустимый диапазон");
            }
        } while (!checkInfo);

        byte first=Byte.parseByte(check1);
        byte second=Byte.parseByte(check2);

        System.out.println("Результат побитового И введенных чисел равен: "+(first&second)); // Число 96, или 0110 0000
        System.out.println("Результат побитового ИЛИ введенных чисел равен: "+(first|second)); // Число 103, 0110 0111
    }

    /**
     * Метод, который проверяет корректность введенных чисел (целое число)
     * @param check - строка для проверки
     * @return checkNumber - true, если число соответствует заданным условиям
     *                     - false, если число не соответствует заданным условиям
     */

    public static boolean checkNumber(String check){
        int problems = 0; // Создание переменной для подсчета нестандартных символов в строке
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) > '9'||check.charAt(i)<'0') {
                problems++;
            }
        }

        if (check.charAt(0)!='-'&&(check.length()>3||check.length()==3&& check.compareTo("127") > 0)) {
            return false;
        }

        if (check.charAt(0) == '-'&& (check.length() > 4 || check.length() == 4 && check.compareTo("-128") > 0)) {
            return false;
        }

        if (problems == 1&&check.charAt(0)!='-') {
            return false;
        }

        if (problems >1) {
            return false;
        }

        return true;
    }
}
