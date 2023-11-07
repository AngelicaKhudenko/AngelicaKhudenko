package home_work_1;

public class Task4_1 {
    public static void main(String[] args) {
        int first = (int) (Math.random() * 100); // Получение первого случайного числа
        int second = (int) (Math.random() * 100); // Получение второго случайного числа
        System.out.println("Первое число равно: " + first);
        System.out.println("Второе число равно: " + second);

        byte checkResult=checkIfOdd(first,second);
        if (checkResult==0){
            System.out.println("Оба числа являтся четными");
        } else if (checkResult==1){
            System.out.println("Нечетное число: "+first);
        } else if (checkResult==2){
            System.out.println("Нечетное число: "+second);
        } else {
            System.out.println("Оба числа являются нечетными");
        }
    }

    /**
     * Метод, который проверяет, какое из переданных чисел является нечетным
     * @param first  - первое число
     * @param second - второе число
     * @return 1 - если первое число является нечетным
     *         2 - если второе число является нечетным
     *         0 - если оба числа являются четными
     *         12 - если оба числа являются нечетными
     */
    public static byte checkIfOdd(int first, int second) {
        int sum = first + second;
        byte result; // Переменная для записи результата
        if (sum % 2 == 0&&first % 2 != 0) {
            result = 12;
        } else if (sum%2==0) {
            result = 0;
        } else if (first%2==1){
            result = 1;
        } else result=2;
        return result;
    }
}
