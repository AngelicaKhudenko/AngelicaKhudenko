package home_work_2.loops;

public class Task_1_3 {
    /**
     * Метод, который проверяет строки на корректность данных, считывает числа из этих строк
     * и возвращает результат возведения первого числа в степень, обозначенную вторым числом
     *
     * @param numberInString - первое числа, которое будем возводить в степень (в виде строки)
     * @param degreeInString - второе число, обозначающее степень (в виде строки), только положительное и целое
     * @return строку, содержащую формулу и результата возведения первого числа во второе
     * "Переданные аргументы не соответствуют условиям работы метода", если аргументы не соответствуют условиям
     */
    public String findDegreeString(String numberInString, String degreeInString) {
        String numberInfo = checkTheNumber(numberInString, false);
        String degreeInfo = checkTheNumber(degreeInString, true);

        if (numberInfo.equals("Число соответствует условиям") && degreeInfo.equals("Число соответствует условиям")) {
            double result = 1; // Создание переменной для возведения в степень
            int degree = Integer.parseInt(degreeInString);
            double num = Double.parseDouble(numberInString);

            for (int i = 1; i <= degree; i++) {
                result = result * num;
            }

            String resultOfDegree = num + "^" + degree + "=" + result;
            return resultOfDegree;
        }

        return "Переданные аргументы не соответствуют условиям работы метода";
    }

    /**
     * Метод, осуществляющий проверку переданной строки, содержащей число, условиям для ввода чисел
     *
     * @param check   - строка для проверки
     * @param natural - режим проверки (true - натуральное число, false - любое число)
     * @return "Число соответствует условиям", если нарушений нет, иначе "Введен ноль", "Введено не целое число", "Введено отрицательное число", "Введено не число"
     */
    public String checkTheNumber(String check, boolean natural) {
        int problems = 0; // Создание переменной для подсчета нестандартных символов в строке
        int length = check.length();
        for (int i = 0; i < length; i++) {
            if (check.charAt(i) > '9' || check.charAt(i) < '0') {
                problems++;
            }
        }

        if (natural) { // Если проверяется натурльное число
            if (check.equals("0")) {
                return "Введен ноль";
            }

            if ((check.contains(".") || check.contains(",")) && problems == 1 && check.indexOf(".") != (check.length() - 1) && check.indexOf(",") != (check.length() - 1)) {
                return "Введено не целое число";
            }

            if (check.charAt(0) == '-' && problems == 1) {
                return "Введено отрицательное число";
            }

            if (check.startsWith("00") || problems >= 1) {
                return "Введено не число";
            }

            return "Число соответствует условиям";
        }

        if (problems == 0) { // Далее если проверяется ненатуральное число, проверка по общим условиям
            return "Число соответствует условиям";
        }

        if (problems == 1) {
            if ((check.contains(".") || check.contains(",")) && check.indexOf(".") != (check.length() - 1) && check.indexOf(",") != (check.length() - 1)) {
                return "Число соответствует условиям";
            }

            if (check.charAt(0) == '-') {
                return "Число соответствует условиям";
            }
        }

        if (problems == 2) {
            if (((check.contains(".") || check.contains(",")) && check.indexOf(".") != (check.length() - 1) && check.indexOf(",") != (check.length() - 1)) && (check.charAt(0) == '-')) {
                return "Число соответствует условиям";
            }
        }
        return "Введено не число";
    }
}

