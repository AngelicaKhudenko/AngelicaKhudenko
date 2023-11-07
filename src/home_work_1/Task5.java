package home_work_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean work=true;
        boolean chill=true;

        String []days=new String[]{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "понедельник", "вторник", "среда", "четверг", "пятница"};
        String []relax=new String[] {"Суббота", "Воскресенье", "суббота", "воскресенье"};

        boolean checkInfo=false;
        do { // Проверка на корректность ввода
            System.out.println("Введите день недели: ");
            String day = reader.nextLine();
            for (int i=0; i<10; i++) { // Проверка дня недели на рабочий день
                if (days[i].equals(day)) {
                    work = true;
                    checkInfo = true;
                    break;
                }
            }
            if (!checkInfo) {
                for (int i=0; i<4; i++) { // Проверка дня недели на выходной
                    if (relax[i].equals(day)) {
                        work = false;
                        checkInfo = true;
                        break;
                    }
                }
            }

            if (!checkInfo){
                    System.out.println("Неверно введен день недели");
            }
        } while (!checkInfo);

        checkInfo=false; // Присвоение нового значение переменной checkInfo
        String holidays;
        do { // Проверка на корректность ввода
            System.out.println("У вас сейчас отпуск (да или нет)?");
            holidays=reader.nextLine();
            if (holidays.equals("да")||holidays.equals("Да")){
                checkInfo=true;
                chill=true;
            } else if (holidays.equals("нет")||holidays.equals("Нет")){
                chill=false;
                checkInfo=true;
            }
        } while (!checkInfo);

        boolean result=sleepIn(work,chill); // Вызов метода

        if (result) {
            System.out.println("Выключайте будильник! Вы можете спать дальше!");
        } else {
            System.out.println("Пора идти на работу!");
        }
    }

    /**
     * Метод, который отвечает на вопрос спать ли дальше (да\нет)
     * @param weekday - день недели (true - рабочий день / false - выходной день)
     * @param vacation - отпуск (true - да / false -нет)
     * @return true - если можно спать дальше
     *         false - если пора на работу
     */
    public static boolean sleepIn(boolean weekday , boolean vacation ){
        if (!weekday||vacation) {
            return true;
        } return false;
    }
}
