package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_4 {
    public static void main(String[] args) {
        int size = 50;
        int maxValueExclusion = 100;
        int[] container = ArraysUtils.arrayRandom(size, maxValueExclusion); // Создание массива
        System.out.println("Сформированный массив");
        System.out.println(Arrays.toString(container));

        System.out.println();

        // 2.4.1. Сумма четных положительных элементов массива

        int summa=findSumPositive(container); // Вызов метода для поиска суммы четных положительных элементов массива
        System.out.println("Сумма четных положительных элементов массива равна: " + summa);

        System.out.println();

        // 2.4.2. Максимальный из элементов массива с четными индексами

        int maxEvenIndex=findMaximumEven(container); // Вызов метода для поиска максимального элемента среди элементов массива с четными индексами
        System.out.println("Максимальный элемент массива среди элементов с четными индексами: " + maxEvenIndex);

        System.out.println();

        // 2.4.3. Элементы массива, которые меньше среднего арифметического

        int [] indexLessMiddle=findIndexLessMiddle(container); // Вызов метода для поиска элементов массива, которые меньше среднего арифметического
        System.out.print("Элементы массива, которые меньше среднего арифметического: ");
        for (int i=0; i<indexLessMiddle.length; i++){ // Вывод полученного массива элементов
            System.out.print(indexLessMiddle[i]+" ");
        }

        System.out.println();
        System.out.println();

        // 2.4.4. Найти два наименьших (минимальных) элемента массива

        int [] minimumTwo=findTwoMinimum(container); // Вызов метода для поиска двух минимальных значений
        System.out.print("Два минимальных элемента массива: ");
        for (int i=0; i<2; i++){ // Вывод полученного массива элементов
            System.out.print(minimumTwo[i]+" ");
        }

        System.out.println();
        System.out.println();

        // 2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу

        Scanner reader=new Scanner(System.in);
        boolean checkInfo;
        String checkLeft;
        String checkRight;

        do { // Проверка на корректность введенных данных для границ отрезка
            System.out.println("Введите левую границу интервала для сжатия массива");
            checkLeft = reader.nextLine();
            checkInfo = checkNumber(checkLeft); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int left=Integer.parseInt(checkLeft);

        do { // Проверка на корректность введенных данных для границ отрезка
            System.out.println("Введите правую границу интервала для сжатия массива");
            checkRight = reader.nextLine();
            checkInfo = checkNumber(checkRight); // Вызов функции проверки введенного значения
            if (!checkInfo) {
                System.out.println("Введены некорректные данные");
            }
        } while (!checkInfo);

        int right=Integer.parseInt(checkRight);

        int []changedMass=createChangedMass(container,left,right); // Вызов метода для сжатия массива
        System.out.println("Массив после сжатия: "+Arrays.toString(changedMass));

        System.out.println();

        // 2.4.6. Сумма цифр массива

        int sumDigits=findSumDigits(container); // Вызов метода для нахождения суммы цифр массива
        System.out.println("Сумма всех цифр массива равна: "+sumDigits);
    }

    /**
     * Расчет суммы четных положительных элементов массива
     * @param container - заданный массив
     * @return sum - сумма четных положительных элементов массива
     */
    public static int findSumPositive (int []container){
        int length=container.length;
        int sum=0;

        for (int i = 0; i < length; i++) {
            if (container[i] > 0 && container[i] % 2 == 0) {
                sum = sum + container[i];
            }
        }

        return sum;
    }

    /**
     * Поиск максимального элемента среди элементов массива с четными индексами
     * @param container - заданный массив
     * @return - максимальный элемент среди элементов массива с четными индексами
     */
    public static int findMaximumEven (int []container) {
        int length=container.length;
        int max;

        if (length<3){
            max=container[0];
        } else {
            max=container[0];
            for (int i=2; i<length; i+=2) {
                if (container[i]>max) {
                    max=container[i];
                }
            }
        }

        return max;
    }

    /**
     * Поиск элементов массива, которые меньше среднего арифметическог
     * @param container - заданный массив
     * @return indexLessMiddle - массив элементов, которые меньше среднего арифметического заданного массива
     */
    public static int [] findIndexLessMiddle(int []container) {
        int length=container.length;
        int sum=0;

        for (int i=0; i<length; i++) {
            sum=sum+container[i];
        }
        int middle=sum/length;

        int n=0;
        for (int i=0; i<length; i++) {
            if (container[i]<middle) {
                n++;
            }
        }

        int [] indexLessMiddle=new int[n];
        int k=0;

        for (int i=0; i<length; i++) {
            if (container[i]<middle) {
                indexLessMiddle[k]=container[i];
                k++;
            }
        }

        return indexLessMiddle;
    }

    /**
     * Поиск двух минимальных элементов массива
     * @param container - заданный массив
     * @return minimum - массив с двумя минимальными элементами по возрастанию
     */

    public static int [] findTwoMinimum(int []container) {
        int length=container.length;

        int minFirst=0;
        int minSecond=0;

        if (length==1) {
            System.out.println("Введенный массив не позволяет выполнить поиск двух наименьших чисел");
        } else if(length==2) {
            minFirst=container[0];
            minSecond=container[1];
        } else {
            if (container[0]<container[1]) {
                minFirst=container[0];
                minSecond=container[1];
            } else {
                minFirst=container[1];
                minSecond=container[0];
            }

            for (int i=2; i<length; i++) {
                if (container[i]<minFirst&&container[i]<minSecond) {
                    minFirst=container[i];
                } else if (container[i]>minFirst&&container[i]<minSecond) {
                    minSecond=container[i];
                }
            }
        }

        int [] minimum={minFirst,minSecond};
        return minimum;
    }

    /**
     * Сжатие массива за счет удаления элементов, значения которых принадлежат введенному интервалу
     * @param container - заданный массив
     * @return container - измененный массив
     */
    public static int []createChangedMass(int [] container, int left, int right) {
        int length=container.length;

        for (int i=0; i<length; i++) {
            if (container[i]>=left&&container[i]<=right) {
                int j=i;
                while(j<length) {
                    if (j+1<length) {
                        container[j]=container[j+1];
                    } else {
                        container[j]=0;
                    }
                    j++;
                }
            }
        }
        return container;
    }

    /**
     * Находит сумму всех цифр массива
     * @param container - заданный массив
     * @return sumDigits - сумма цифр чисел
     */
    public static int findSumDigits(int []container) {
        int length=container.length;

        int sumDigits=0;

        int digits;
        int number;
        for (int i=0; i<length; i++) {
            number=container[i];
            while(number>0){
                digits=number%10;
                number=number/10;
                sumDigits=sumDigits+digits;
            }
        }

        return sumDigits;
    }

    /**
     * Метод для проверки введенного значения на соблюдение условий ввода и соответствие пределов переменной int
     * @param check - строка, содержащая введенные с клавиатуры значения
     * @return - true, если введенное значение выполняет условия
     *         - false, если введенное значение не выполняет условия ввода, а также если число превышает пределы переменной int
     */

    public static boolean checkNumber (String check) {
        int problems = 0; // Создание переменной для подсчета нестандартных символов в строке
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) > '9'||check.charAt(i)<'0') {
                problems++;
            }
        }

        boolean checkResult=true;
        if ((check.contains(".") || check.contains(","))&&problems==1&&check.indexOf(".")!=(check.length()-1)&&check.indexOf(",")!=(check.length()-1)) {
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
