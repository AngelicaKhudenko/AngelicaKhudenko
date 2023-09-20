package home_work_1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число:");
        String check1 = reader.nextLine();

        byte numberDecimal = 0; // Объявление переменной для будущей записи числа после проверки на размерность

        if (check1.charAt(0)!='-'&&(check1.length()>3||check1.length()==3&&check1.compareTo("127")==1)) {
            System.out.println("Введено число, которое не попадает в допустимый диапазон. Программа остановлена");
            System.exit(0);
        } else if (check1.charAt(0)=='-'&&(check1.length()>4||check1.length()==4&&check1.compareTo("-128")==1)) {
            System.out.println("Введено число, которое не попадает в допустимый диапазон. Программа остановлена");
            System.exit(0);
        } else numberDecimal = Byte.parseByte(check1); // Проверка введенного числа на размерность, соответствующую байту

        toBinaryString(numberDecimal);
    }
    public static void toBinaryString (byte number) {
            boolean positive; // Создание переменной для того, чтобы запомнить знак числа
            if (number>0) {
                positive=true;
            } else positive=false;

            number=(byte)(Math.abs(number)); // Модуль числа

            byte []num=new byte[8]; // Создание массива для записи битов и присвоение значениям нулевое значение
            for (int i=0; i<8; i++) {
                num[i]=0;
            }

            int z=7;
            while (number!=1) { // Нахождение остатка от деления числа на 2
                num[z]=((byte)(number%2));
                number=(byte)(number/2);
                --z;
            }
            num[z]=1;

            if (positive==false) { // Дальнейшее преобразование числа, если изначально было введено отрицательное число
                for (int m=0; m<8; m++) {
                    if (num[m]==0) {
                        num[m]=1;
                    } else num[m]=0; // Аналогия побитовому отрицанию
                }
                for (int m=7; m>=0; m--) { // Добавление единицы к полученному числу
                    if (num[m]==0){
                        num[m]=1;
                        break;
                    } else num[m]=0;
                }
            }

            String result=""; // Создание пустой строки для записи результата

            for (int l=0; l<8; l++){
                result=result+num[l];
            }

            System.out.println("Заданное число в двочином представлении равно: "+result); // Вывод результата по итогам метода
    }
}
