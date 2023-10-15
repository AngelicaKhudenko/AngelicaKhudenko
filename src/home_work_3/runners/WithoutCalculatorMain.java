package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {

        double divide=28/5.0; // 5.6
        int degree=2;

        double result=4.1+15*7+Math.pow(divide, degree); // 140.45999999999998

        System.out.format("Результат выражения равен: %.3f",result); // вывод результата с 3-мя знаками после запятой
    }
}
