package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_1_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String checkLength;
        String checkMaxValueExclusion;
        boolean checkInfo;

        do { // Проверка на корректность введенных данных для длины массива
            System.out.println("Введите натуральное число, обозначающее длину массива");
            checkLength = reader.nextLine();
            checkInfo = checkNumber(checkLength); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int size=Integer.parseInt(checkLength);

        do { // Проверка на корректность введенных данных для предела генератора случайных чисел
            System.out.println("Введите натуральное число, обозначающее предел генератора случайных чисел");
            checkMaxValueExclusion = reader.nextLine();
            checkInfo = checkNumber(checkMaxValueExclusion); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int maxValueExclusion=Integer.parseInt(checkMaxValueExclusion);

        int []container= ArraysUtils.arrayRandom(size,maxValueExclusion);
        System.out.println(Arrays.toString(container));
    }

    /**
     * Метод для проверки введенного значения на соблюдение условий натурального числа и соответствие пределов переменной int
     * @param check - строка, содержащая введенные с клавиатуры значения
     * @return - true, если введенное значение выполняет условия
     *      *  - false, если введенное значение не является натуральным числом (если введен ноль или если число является дробным,
     *      *    или если число является отрицательным, или если введено не число), а также если число превышает пределы переменной int
     */
    public static boolean checkNumber (String check) {
        int problems = 0; // Создание переменной для подсчета нестандартных символов в строке
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) > '9'||check.charAt(i)<'0') {
                problems++;
            }
        }

        boolean checkResult=true;
        if (check.equals("0")) {
            checkResult=false;
        } else if ((check.contains(".") || check.contains(","))&&problems==1&&check.indexOf(".")!=(check.length()-1)&&check.indexOf(",")!=(check.length()-1)) {
            checkResult=false;
        } else if ((check.charAt(0) == '-'&&problems == 1)) {
            checkResult=false;
        } else if (check.startsWith("00")) {
            checkResult=false;
        } else if (problems >= 1) {
            checkResult=false;
        } else if (check.length()>10||(check.length()==10&&check.compareTo("2147483647")>0)) {
            checkResult=false;
        }

        return checkResult;
    }
}
