package home_work_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        boolean work=true;
        boolean chill;

        String days="Понедельник Вторник Среда Четверг Пятница / понедельник вторник среда четверг пятница";
        String relax="Суббота Воскресенье / суббота воскресенье";

        System.out.println("Введите день недели: ");
        String day=reader.nextLine();
        if (days.contains(day)){ // Проверка дня недели
            work=true;
        } else if (relax.contains(day)) {
            work=false;
        } else {
            System.out.println("Неверно введен день недели. Конец программы");
            System.exit(0);
        }

        System.out.println("У вас сейчас отпуск (да или нет)?");
        String holidays=reader.nextLine();
        if (holidays.equals("да")||holidays.equals("Да")){ // Проверка отпуска
            chill=true;
        } else chill=false;

        boolean result=sleepIn(work,chill); // Вызов метода

        if (result==true){
            System.out.println("Выключайте будильник! Вы можете спать дальше!");
        } else System.out.println("Пора идти на работу!");

    }
       public static boolean sleepIn(boolean weekday, boolean vacation){
       if (weekday==false||vacation==true) {
           return true;
       } return false;
   }
}
