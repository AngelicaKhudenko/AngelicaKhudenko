package home_work_1;

public class Task4_1 {
    public static void main(String[] args) {
        int first=(int)(Math.random()*100); // Получение первого случайного числа
        int second=(int)(Math.random()*100); // Получение второго случайного числа
        System.out.println("Первое число равно: "+first);
        System.out.println("Второе число равно: "+second);

        int sum=first+second;
        if (sum%2==0) {
            if (first%2==0) {
                System.out.println("Оба числа являтся четными");
            } else System.out.println("Оба числа являются нечетными");
        } else if (first%2==0) {
            System.out.println("Нечетное число: "+second);
        } else {System.out.println("Нечетное число: "+first);}
    }
}
