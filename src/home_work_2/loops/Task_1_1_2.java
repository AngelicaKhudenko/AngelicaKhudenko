package home_work_2.loops;

public class Task_1_1_2 {
    /**
     * Метод получения факториала от заданного числа
     * @param num - заданное число (не больше 20)
     * @return - факториал заданного числа
     *         - -1, если если введено отрицательное число или число больше 20
     */
    public long findFactorial (byte num) {
        if (num==0){
            return 1;
        }

        if (num<0||num>20){
            return -1;
        }

        if (num==1) {
            return 1;
        } else {
            return num*findFactorial((byte) (num-1));
        }
    }

    /**
     * Метод, который вовзращает факториал заданного числа в виде строки
     * @param num -  число для расчета факториала (не больше 20)
     * @return result - строка, содержащая формулу расчета факториала и результат
     *                - "неверный ввод данных", если введено отрицательное число или число больше 20
     */
    public String findFactorialString(byte num) {
        String result=""; // Создание пустой строки для вывода результата
        long factorial=findFactorial(num);

        if (num==0){
            return "0!=1";
        }

        if (num<0||num>20){
            return "неверный ввод данных";
        }

        for (int i=1; i<=num; i++) {
            if (i==num) {
                result=result+i+"="+factorial;
            } else {
                result=result+i+"*";
            }
        }

        return result;
    }
}
