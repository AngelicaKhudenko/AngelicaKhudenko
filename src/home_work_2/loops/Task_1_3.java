package home_work_2.loops;

import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите число для возведения его в степень");
        double num=reader.nextDouble();
        reader.nextLine(); // Считывание \n, чтобы сканер мог в дальнейшем считать строку

        boolean checkResult;
        String check;
        int degree=0;

        do { // Проверка на корректность введенных данных
            System.out.println("Введите целое положительное число, обозначающее степень, в которую будем возводить первое число");
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
            } else if (check.length()>10||(check.length()==10&&check.compareTo("2147483647")>0)) {
                System.out.println("Введено число больше диапазона int");
                checkResult=false;
            } else degree=Integer.parseInt(check);
        } while (!checkResult);

        double result=1; // Создание переменной для возведения в степень
        for (int i=1; i<=degree; i++){
            result=result*num;
        }

        System.out.format("%.2f^%d=%.2f",num,degree,result);
    }
}
