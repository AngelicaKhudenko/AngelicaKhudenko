package home_work_2.loops;

import java.util.Random;

public class Task_1_5 {

    /**
     * Находит наибольшую цифру в заданном числе
     * @param number - число
     * @return max - максимальная цифра в числе
     *         -1 - если передано не натуральное число
     */
    public byte findMaxDigit(int number) {
        if (number<=0){
            return -1;
        }

        byte digit;
        byte max=0;

        while(number>0) {
            digit=(byte)(number%10);
            number=number/10;
            if(digit>=max) {
                max=digit;
            }
        }

        return max;
    }

    /**
     * Определяет вероятность выпадения четных чисел
     * @param numberRandom - массив рандомных чисел
     * @param even - количество четных чисел в массиве
     * @return вероятность выпадения четных чисел
     */
    public double findProbability(int [] numberRandom, int even ) {
        return even/1000.0*100;
    }

    /**
     * Считает четные и нечетные цифры в заданном числе
     * @param number - число
     * @return result - строка с информацией о четных и нечетных цифрах числа
     */
    public String infoOnEvenAndOdd(long number) {
        byte digit;
        byte even=0;
        byte odd=0;

        String resultEven=""; // Создание строки для записи четных цифр
        String resultOdd=""; // Создание строки для записи нечетных цифр

        if (number<0){
            number=number*-1;
        }

        while(number>0) {
            digit=(byte)(number%10); // Получение цифры числа справа налево
            number=number/10;
            if (digit%2==0) { // Проверка на четность числа
                even++;
                if(resultEven.isEmpty()) { // Запись в строку четных чисел
                    resultEven = resultEven + digit;
                } else {
                    resultEven=resultEven+", "+digit;
                }
            } else {
                odd++; // Запись в строку нечетных чисел
                if (resultOdd.isEmpty()) {
                    resultOdd=resultOdd+digit;
                } else {
                    resultOdd=resultOdd+", "+digit;
                }
            }
        }

        String result="Количество четных цифр в числе: "+even;
        if (even!=0) {
            result=result+"("+resultEven+")";
        }
        result=result+". Количество нечетных цифр: "+odd;
        if (odd!=0){
            result=result+("("+resultOdd+")");
        }

        return result;
    }

    /**
     * Функция по созданию строки, содержащей ряд Фибоначчи по заданным условиям
     * @param number - количество элементов для вывода ряда
     * @return result - строка, содержащая ряд Фибоначчи по заданным условиям
     */
    public String makeRowFibonachi(int number) {
        int first=1;
        int second=1;
        int t=0; // Создание переменной для метода "трех стаканов"

        String result="";

        for (int i=1; i<=number; i++) {
            result=result+second+" "; // Вывод числа из ряда

            t=first;
            first=second;
            second=second+t;
        }

        return result.trim();
    }

    /**
     * Формирование строки, содержащей ряд натуральных чисел от минимума до максимума с шагом
     * @param minimum - значение минимума диапазона
     * @param maximum = значение максимума диапазона
     * @param step - значение шага
     * @return result - строка, содержащая ряд натуральных чисел от минимума до максимума с шагом
     */

    public String naturalNumberStep(int minimum, int maximum, int step) {
        String result="";
        if (minimum>=maximum||minimum+step>maximum) {
            result="Введенные значения не позволяют выполнить задачу";
        } else {
            do {
                result=result+minimum+" ";
                minimum=minimum+step;
            } while (minimum<=maximum);
        }
        return result.trim();
    }

    /**
     * Формирование строки, содержащей заданное число, обратное по порядку входящих в него цифр
     * @param number - заданное число
     * @return result - строка, содержащая заданное число в обратном порядке
     */
    public String makeNumberReverse(int number) {
        if (number==0) {
            return "0";
        }

        String result="";
        byte digit=0;
        boolean minusNeсessity=false;

        if (number<0){
            number*=-1;
            minusNeсessity=true;
        }

        while(number>0) {
            digit=(byte)(number%10);
            result=result+digit;
            number=number/10;
        }

        if (minusNeсessity) {
            return "-"+result;
        }

        return result;
    }

    /**
     * Метод для проверки введенного значения на соблюдение определения натурального числа и соответствие пределов переменной int
     * @param check - строка, содержащая введенные с клавиатуры значения
     * @return  true, если введенное значение выполняет условия
     *          false, если введенное значение не является натуральным числом (если введен ноль или если число является дробным,
     *           или если число является отрицательным, или если введено не число), а также если число превышает пределы переменной int
     */
    public boolean checkNumber (String check) {
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
        } else if (check.charAt(0) == '-' && problems == 1) {
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
