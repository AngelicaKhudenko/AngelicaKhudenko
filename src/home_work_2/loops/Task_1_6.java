package home_work_2.loops;

public class Task_1_6 {
    /**
     * Метод, который возвращает cтолбики, содержащие, содержащую таблицу умножения по заданным условиям
     * @param from - число, с которого начинается умножение, - первый множитель
     * @param to - число, до которого осуществляется умножение, - первый множитель
     * @param start - число, начиная с которого начинается умножение, - второй множитель
     * @param end - число, до которого осуществляется умножение, - второй множитель
     * @return result - строка, содержащая таблицу умножения по заданным условиям
     */
    public String makeStringsOfMultiplication(int from, int to, int start, int end) {
        String result="";
        for (int i=start; i<=end; i++) {
            for (int j=from; j<=to; j++) {
                result=result+j+"*"+i+"="+j*i;
                if (j*i>=10&&i!=10) { // Добавление пробелов для выравнивания столбиков
                    result+="   ";
                } else if (i==10) {
                    result+="  ";
                } else {
                    result+="    ";
                }
            }
            result+="\n";
        }
        return result;
    }
}
