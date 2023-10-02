package home_work_2.loops;

public class Task_1_4_1 {
    public static void main(String[] args) {
        long a=1;

        long resultBefore=a;
        long resultAfter=1;

        boolean check=true;

        while (check) {
            resultBefore=resultBefore*3;
            if (resultBefore*3/3!=resultBefore){
                check=false;
            }
        }
        /*Если после умножения и деления на одно и то же число не получится первоначальное значение,
        то это значит, что число в результате переполнения попадает в отрицательные значения
         */

        resultAfter=resultBefore*3; // Поиск значения после переполнения
        System.out.println("Значение умножения до переполнения: "+resultBefore);
        System.out.println("Значение умножения после переполнения: "+resultAfter);
    }
}