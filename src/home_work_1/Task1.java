package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Введите первое целое число:"); // Число 100, или 01100100
        String check1=reader.nextLine();
        System.out.println("Введите второе целое число:"); // Число 99, или 001100011
        String check2=reader.nextLine();

        byte first=0;
        byte second=0;

        if (check1.charAt(0)!='-'&&(check1.length()>3||check1.length()==3&&check1.compareTo("127")==1)) {
            System.out.println("Введено число, которое не попадает в допустимый диапазон. Программа остановлена");
            System.exit(0);
        } else if (check1.charAt(0)=='-'&&(check1.length()>4||check1.length()==4&&check1.compareTo("-128")==1)) {
            System.out.println("Введено число, которое не попадает в допустимый диапазон. Программа остановлена");
            System.exit(0);
        } else first=Byte.parseByte(check1); // Проверка первого введенного числа на размерность, соответствующую байту

        if (check2.charAt(0)!='-'&&(check2.length()>3||check2.length()==3&&check2.compareTo("127")==1)) {
            System.out.println("Введено число, которое не попадает в допустимый диапазон. Программа остановлена");
            System.exit(0);
        } else if (check2.charAt(0)=='-'&&(check2.length()>4||check2.length()==4&&check2.compareTo("-128")==1)) {
            System.out.println("Введено число, которое не попадает в допустимый диапазон. Программа остановлена");
            System.exit(0);
        } else second=Byte.parseByte(check2); // Проверка второго введенного числа на размерность, соответствующую байту

        System.out.println("Результат побитового И введенных чисел равен: "+(first&second)); // Число 96, или 0110 0000
        System.out.println("Результат побитового ИЛИ введенных чисел равен: "+(first|second)); // Число 103, 0110 0111
    }
}
