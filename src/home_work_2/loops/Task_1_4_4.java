package home_work_2.loops;

import java.util.Scanner;

public class Task_1_4_4 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        long a = 1;
        boolean checkResult;
        String check;

        do { // Проверка на корректность введенных данных
            System.out.println("Введите целое число");
            check=reader.nextLine();

            int problems = 0; // Создание переменной для подсчета нестандартных символов в строке
            for (int i = 0; i < check.length(); i++) {
                if (check.charAt(i) > '9'||check.charAt(i)<'0') {
                    problems++;
                }
            }

            checkResult=true;
            if ((check.contains(".") || check.contains(","))&&problems==1&&check.indexOf(".")!=(check.length()-1)&&check.indexOf(",")!=(check.length()-1)) {
                System.out.println("Введено не целое число");
                checkResult=false;
                continue;
            } else if (check.startsWith("00")) {
                System.out.println("Введено не число");
                checkResult=false;
                continue;
            } else if ((problems==1&&check.charAt(0)!='-')||problems>1) {
                System.out.println("Введено не число");
                checkResult=false;
                continue;
            } else if (check.length()>19||check.length()==19&&check.compareTo("2147483647")>0) {
                System.out.println("Введено число больше диапазона int");
                checkResult=false;
            }
        } while (!checkResult);

        int num=Integer.parseInt(check);

        long resultBefore = a;
        long resultAfter = 1;

        boolean checkBorder = true;

        while (checkBorder) {
            resultBefore = resultBefore * num;
            if (resultBefore * num / num != resultBefore) {
                checkBorder = false;
            }
        }

        resultAfter = resultBefore * num; // Поиск значения после переполнения
        System.out.println("Значение умножения до переполнения: " + resultBefore);
        System.out.println("Значение умножения после переполнения: " + resultAfter);
    }
}
