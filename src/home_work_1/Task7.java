package home_work_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.print("Введите цифры номера телефона без пробелов:");
        String oldPhone=reader.nextLine(); // Получение данных

        if (oldPhone.length()>10){ // Проверка количества введенных цифр
            System.out.println("Введены лишние цифры. Остановка программы");
            System.exit(0);
        } else if (oldPhone.length()<10){
            System.out.println("Введено недостаточно цифр. Остановка программы");
            System.exit(0);
        }

        char [] number=new char[10]; // Создание массива чисел из 10 элементов

        for (int i=0; i<10; i++){
            number[i]=oldPhone.charAt(i);
        } // Присвоение значений элементам массива

        createPhoneNumber (number); // Вызов метода
    }
    public static void createPhoneNumber(char[] num){
        String result="("+ num[0]+num[1]+num[2]+") "+num[3]+num[4]+num[5]+"-"+num[6]+num[7]+num[8]+num[9]; // Создание строки для вывода
        System.out.println(result);
    }
}
