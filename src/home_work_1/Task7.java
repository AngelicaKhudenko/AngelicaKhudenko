package home_work_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        String oldPhone;
        boolean checkInfo;
        do{
            System.out.print("Введите 10 цифр номера телефона без пробелов:");
            oldPhone=reader.nextLine(); // Получение данных
            int length=oldPhone.length(); // Длина строки

            if (length>10||length<10) { // Проверка количества введенных цифр
                System.out.println("Неверный ввод, количество введенных символов не соответствует условию");
                checkInfo=false;
            } else {
                checkInfo=true;
            }

            for (int i=0; i<length; i++) { // Проверка на посторонние символы, отличные от цифр
                if (oldPhone.charAt(i)>'9'||oldPhone.charAt(i)<'0'){
                    System.out.println("Неверный ввод, введены неверные символы");
                    checkInfo=false;
                    break;
                }
            }
        } while (!checkInfo);

        char [] number=new char[10]; // Создание массива чисел из 10 элементов

        for (int i=0; i<10; i++) {  // Наполнение массива данными, введенными пользователем в строку
            number[i]=oldPhone.charAt(i);
        }

        String result=createPhoneNumber (number); // Вызов метода
        System.out.println(result); // Вывод результата
    }

    /**
     * Метод, который возвращает переданную строку в отформатированном виде
     * @param num - массив символов для форматирования
     * @return - возвращает строку формата (XXX) XXX-XXXX, если пользователь передал массив символов длиной 10, где символы - цифры
     *         - "неверный ввод", если пользователь передал массив символов, содержащий иные символы, кроме цифр, а также если длина массива не равна 10
     */
    public static String createPhoneNumber(char[] num) {
        if (num.length>10||num.length<10) {
            return "неверный ввод";
        }

        for (int i=0; i<10; i++) {
            if (num[i]>'9'||num[i]<'0') {
                return "неверный ввод";
            }
        }

        return "("+ num[0]+num[1]+num[2]+") "+num[3]+num[4]+num[5]+"-"+num[6]+num[7]+num[8]+num[9];
    }
}
