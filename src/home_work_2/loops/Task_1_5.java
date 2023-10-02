package home_work_2.loops;

import java.util.Scanner;
import java.util.Random;

public class Task_1_5 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        // 1.5.1. Найти наибольшую цифру натурального числа

        boolean checkInfo;
        String checkNatural;

        do { // Проверка на корректность введенных данных для минимума
            System.out.println("Введите натуральное число");
            checkNatural = reader.nextLine();
            checkInfo = checkNumber(checkNatural); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int number=Integer.parseInt(checkNatural);

        byte max=findMaxDigit(number); // Вызов функции поиска наибольшей цифры в числе
        System.out.println("Наибольшая цифра в заданном числе "+number+" равна "+max);

        System.out.println();

        // 1.5.2. Вероятность четных случайных чисел

        double probability=findProbability(); // Вызов функции определения вероятности выпадения четных чисел
        System.out.println("Вероятность выпадения четных чисел на выборке не меньше 1000 составляет "+probability+"%");

        System.out.println();

        // 1.5.3. Посчитать четные и нечетные цифры числа

        String evenOdd=infoOnEvenAndOdd(number); // Вызов функции подсчета четных и нечетных цифр числа
        System.out.println("Введено число "+ number+". "+evenOdd);

        System.out.println();

        // 1.5.4. Ряд Фибоначчи

        String checkRow;

        do { // Проверка на корректность введенных данных для минимума
            System.out.println("Введите натуральное число, обозначающее число для вывода ряда Фибоначчи");
            checkRow = reader.nextLine();
            checkInfo = checkNumber(checkRow); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int numberRow=Integer.parseInt(checkRow);

        String rowFibonacci=makeRowFibonachi(numberRow); // Вызов функции по выведению ряда Фибоначчи
        System.out.println("Ряд Фибоначчи: "+rowFibonacci);

        System.out.println();

        // 1.5.5. Вывести ряд чисел в диапазоне с шагом

        String checkMinimum;
        String checkMaximim;
        String checkStep;

        do { // Проверка на корректность введенных данных для минимума
            System.out.println("Введите натуральное число, обозначающее минимум");
            checkMinimum = reader.nextLine();
            checkInfo = checkNumber(checkMinimum); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int minimum=Integer.parseInt(checkMinimum);

        do { // Проверка на корректность введенных данных для максимума
            System.out.println("Введите натуральное число, обозначающее максимум");
            checkMaximim=reader.nextLine();
            checkInfo = checkNumber(checkMaximim); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int maximum=Integer.parseInt(checkMaximim);

        do { // Проверка на корректность введенных данных для шага
            System.out.println("Введите натуральное число, обозначающее шаг");
            checkStep=reader.nextLine();
            checkInfo = checkNumber(checkStep); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int step=Integer.parseInt(checkStep);

        String resultMinimumMaximumStep=naturalNumberStep(minimum,maximum,step); // Вызов функции вывода ряда чисел в диапазоне с шагом
        System.out.println(resultMinimumMaximumStep);

        System.out.println();

        // 1.5.6. Переворот числа

        String checkFirstNumber;

        do { // Проверка на корректность введенных данных для шага
            System.out.println("Введите натуральное число");
            checkFirstNumber=reader.nextLine();
            checkInfo = checkNumber(checkFirstNumber); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int firstNumber=Integer.parseInt(checkFirstNumber);
        String numberReverse=makeNumberReverse(firstNumber); // Вызов функции по формированию числа в обратном порядке
        System.out.println(numberReverse);
    }

    /**
     * Находит наибольшую цифру в заданном числе
     * @param number - число
     * @return max - максимальная цифра в числе
     */
    public static byte findMaxDigit(int number) {
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
     * @return probability - вероятность выпадения четных чисел
     */
    public static double findProbability() {
        Random rnd=new Random();
        int number;
        int even=0;
        for (int i=1; i<=1000; i++) {
            number=rnd.nextInt(100);
            if (number % 2 == 0) {
                even++;
            }
        }
        double probability=even/1000.0*100;
        return probability;
    }

    /**
     * Считает четные и нечетные числа в заданном числе
     * @param number - число
     * @return result - строка с информацией о четных и нечетных цифрах числа
     */
    public static String infoOnEvenAndOdd(long number) {
        byte digit;
        byte even=0;
        byte odd=0;

        String resultEven=""; // Создание строки для записи четных цифр
        String resultOdd=""; // Создание строки для записи нечетных цифр

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
    public static String makeRowFibonachi(int number) {
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

        return result;
    }

    /**
     * Формирование строки, содержащей ряд натуральных чисел от минимума до максимума с шагом
     * @param minimum - значение минимума диапазона
     * @param maximum = значение максимума диапазона
     * @param step - значение шага
     * @return result - строка, содержащая ряд натуральных чисел от минимума до максимума с шагом
     */

    public static String naturalNumberStep(int minimum, int maximum, int step) {
        String result="";
        if (minimum>maximum||minimum+step>maximum) {
            result="Введенные значения не позволяют выполнить задачу";
        } else {
            do {
                result=result+minimum+" ";
                minimum=minimum+step;
            } while (minimum<=maximum);
        }
        return result;
    }

    /**
     * Формирование строки, содержащей заданное число, обратное по порядку входящих в него цифр
     * @param number - заданное число
     * @return result - строка, содержащая заданное число в обратном порядке
     */
    public static String makeNumberReverse(int number) {
        String result="";

        byte digit=0;

        while(number>0) {
            digit=(byte)(number%10);
            result=result+digit;
            number=number/10;
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
