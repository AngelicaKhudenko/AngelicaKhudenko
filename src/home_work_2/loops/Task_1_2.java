package home_work_2.loops;

public class Task_1_2 {
    /**
     * Метод, который возвращает строку, содержащую формулу и результат перемножения цифр числа
     * @param numberString - строка, содержащая число
     * @return result - строка, содержащая формулу и результат перемножения цифр числа
     *         "Введен ноль" - если пользователь ввел ноль
     *         "Введено не целое число" - если пользователь ввел не целое число
     *         "Введено отрицательное число" - если пользователь ввел отрицательное число
     *         "Введено не число" - если пользователь ввел не число, а иные символы
     *         "Введено число больше диапазона long" - если пользователь ввел число больше диапазона long
     */
    public String findMultiplicationOfDigits(String numberString) {
        long multiplication=1; // Создание переменной для расчета умножения
        String result=""; // Создание строки для вывода результата

        int problems = 0; // Создание переменной для подсчета нестандартных символов в строке

        int length=numberString.length();
        for (int i = 0; i <length; i++) {
            if (numberString.charAt(i) > '9'||numberString.charAt(i)<'0') {
                problems++;
            }
        }

        if (numberString.equals("0")) {
            return "Введен ноль";
        }

        if ((numberString.contains(".") || numberString.contains(","))&&problems==1&&numberString.indexOf(".")!=(numberString.length()-1)&&numberString.indexOf(",")!=(numberString.length()-1)) {
            return "Введено не целое число";
        }

        if (numberString.charAt(0) == '-' && problems == 1) {
            return "Введено отрицательное число";
        }

        if (numberString.startsWith("00")||problems >= 1) {
            return "Введено не число";
        }

        if (numberString.length()>19||numberString.length()==19&&numberString.compareTo("9223372036854775807")>0) {
            return "Введено число больше диапазона long";
        }

        for(int i=0; i<numberString.length(); i++) {
            char digit=numberString.charAt(i); // Создание символьной переменной для записи элемента строки
            byte num=Byte.parseByte(String.valueOf(digit)); // Считывание элемента строки в числовую переменную

            multiplication=multiplication*num;

            if (i==numberString.length()-1) {
                result=result+num+"="+multiplication;
            } else {
                result=result+num+"*";
            }
        }

        return result;
    }
}
