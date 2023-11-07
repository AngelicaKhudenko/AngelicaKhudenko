package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_4 {
    /**
     * Расчет суммы четных положительных элементов массива
     * @param container - заданный массив
     * @return sum - сумма четных положительных элементов массива
     */
    public int findSumPositive (int []container){
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
    public int findMaximumEven (int []container) {
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
     * Поиск элементов массива, которые меньше среднего арифметического
     * @param container - заданный массив
     * @return indexLessMiddle - массив элементов, которые меньше среднего арифметического заданного массива
     */
    public int [] findIndexLessMiddle(int []container) {
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

    public int [] findTwoMinimum(int []container) {
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
     * @param right - правая граница интервала для сжатия массива
     * @param left - левая граница интервала для сжатия массива
     * @return result[] - новый сжатый массив
     */
    public int []createChangedMass(int [] container, int left, int right) {
        int length=container.length;
        int j=0;
        int [] result=new int[length];

        for (int i=0; i<length; i++) {
            if (container[i]<left||container[i]>right) {
                result[j]=container[i];
                j++;
            }
        }

        for (int i=j; j<length; j++){
            result[j]=0;
        }
        return result;
    }

    /**
     * Находит сумму всех цифр массива
     * @param container - заданный массив
     * @return sumDigits - сумма цифр чисел
     */
    public int findSumDigits(int []container) {
        int length=container.length;

        int sumDigits=0;

        int digits;
        int number;
        for (int i=0; i<length; i++) {
            number=container[i];
            if (number<0){
                number*=-1;
            }
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

    public boolean checkNumber (String check) {
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
