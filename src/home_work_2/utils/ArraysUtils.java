package home_work_2.utils;

import java.util.Scanner;
import java.util.Random;

public class ArraysUtils {

    /**
     * Метод запрашивает через консоль размер массива и каждый его элемент
     * @return container - массив целых чисел формата int по условиям пользователя
     */
    public static int[] arrayFromConsole() {
        Scanner reader = new Scanner(System.in);
        String checkLength;
        String checkElement;
        boolean checkInfo;
        boolean naturalInfo;

        do { // Проверка на корректность введенных данных для длины массива
            naturalInfo=true;
            System.out.println("Введите натуральное число, обозначающее длину массива");
            checkLength = reader.nextLine();
            checkInfo = checkNumber(checkLength, naturalInfo); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int size = Integer.parseInt(checkLength);
        int [] container=new int[size];

        for (int i=0; i<size; i++) {
            do { // Проверка на корректность введенных данных для элементов массива
                naturalInfo=false;
                System.out.println("Введите целое число, являющееся элементом массива");
                checkElement = reader.nextLine();
                checkInfo = checkNumber(checkElement, naturalInfo); // Вызов функции проверки введенного значения
                if (!checkInfo) {
                    System.out.println("Введены некорректные данные");
                }
            } while (!checkInfo);

            container[i]=Integer.parseInt(checkElement);
        }
        return container;
    }

    /**
     * Метод формирует массив чисел на основе информации с консоли о размере массива и пределах генерирования рандомных чисел
     * @param size - размер массива
     * @param maxValueExclusion - предел генерирования рандомных чисел
     * @return container - массив целых чисел формата int по условиям пользователя
     */
    public static int [] arrayRandom (int size, int maxValueExclusion) {
        Random rnd=new Random();
        int []container=new int[size];
        for (int i=0; i<size; i++) {
            container[i]= rnd.nextInt(maxValueExclusion);
        }
        return container;
    }


    /**
     * Метод для проверки введенного значения на соблюдение условий ввода и соответствие пределов переменной int
     * @param check - строка, содержащая введенные с клавиатуры значения
     * @return - возвращает true, если введенное значение выполняет условия
     *         - возвращает false, если введенное значение не выполняет условия ввода, а также если число превышает пределы переменной int
     */

    public static boolean checkNumber (String check, boolean natural) {
        int problems = 0; // Создание переменной для подсчета нестандартных символов в строке
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) > '9'||check.charAt(i)<'0') {
                problems++;
            }
        }

        boolean checkResult=true;
        if (check.equals("0")&&natural) {
            checkResult=false;
        } else if ((check.contains(".") || check.contains(","))&&problems==1&&check.indexOf(".")!=(check.length()-1)&&check.indexOf(",")!=(check.length()-1)) {
            checkResult=false;
        } else if ((check.charAt(0) == '-'&&problems == 1)&&natural) {
            checkResult=false;
        } else if ((check.charAt(0) == '-'&&problems == 1)&&!natural) {
            checkResult=true;
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
