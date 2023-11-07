package home_work_2.loops;

public class Task_1_4 {
    /**
     * Метод, который осуществляет умножение единицы на переданное целое число до переполнения и возвращает строку,
     * содержащую информацию о значении до переполнения и после переполнения
     * @param numInString - число, на которое умножают 1, в виде строки
     * @return - строку, содержащую информацию о значении до переполнения и после переполнения
     *         - неверный ввод("Введено не целое число","Введено не число","Введено число больше диапазона int"), если переданы некорректные данные
     *
     */
    public String findOverflow(String numInString) {
        int length=numInString.length();
        int problems = 0; // Создание переменной для подсчета нестандартных символов в строке
        for (int i = 0; i < length; i++) {
            if (numInString.charAt(i) > '9'||numInString.charAt(i)<'0') {
                problems++;
            }
        }

        if ((numInString.contains(".") || numInString.contains(","))&&problems==1&&numInString.indexOf(".")!=(numInString.length()-1)&&numInString.indexOf(",")!=(numInString.length()-1)) {
            return "Введено не целое число";
        }

        if (numInString.startsWith("00")) {
            return "Введено не число";
        }

        if ((problems==1&&numInString.charAt(0)!='-')||problems>1) {
            return "Введено не число";
        }

        if (numInString.length()>19||numInString.length()==19&&numInString.compareTo("2147483647")>0) {
            return "Введено число больше диапазона int";
        }

        int num=Integer.parseInt(numInString);

        long a = 1;
        long resultBefore = a;
        long resultAfter = 1;

        boolean checkBorder = true;

        while (checkBorder) {
            resultBefore = resultBefore * num;
            if (resultBefore * num / num != resultBefore) {
                checkBorder = false;
            }
        }

        resultAfter = resultBefore * num; // Поиск значения после переполнения
        return "Значение умножения до переполнения: "+resultBefore+". Значение умножения после переполнения: " + resultAfter;
    }
}
