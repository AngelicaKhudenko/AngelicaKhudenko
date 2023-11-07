package home_work_2.loops;

public class Task_1_1_1 {
    /**
     * Метод, который вовзращает факториал заданного числа
     * @param num - число для расчета факториала (не больше 20)
     * @return result - строка, содержащая формулу расчета факториала и результат
     *                - "неверный ввод данных", если введено отрицательное число или число больше 20
     */
    public String findFactorial(byte num) {
        String result=""; // Создание пустой строки для вывода результата
        long factorial=1; // Создание переменной для расчета факториала

        if (num==0){
            return "0!=1";
        }

        if (num<0||num>20){
            return "неверный ввод данных";
        }

        for (int i=1; i<=num; i++) {
            factorial=factorial*i;
            if (i==num) {
                result=result+i+"="+factorial;
            } else {
                result=result+i+"*";
            }
        }

        return result;
    }
}
