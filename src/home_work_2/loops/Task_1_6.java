package home_work_2.loops;

public class Task_1_6 {
    public static void main(String[] args) {
        byte result;
        System.out.println("ТАБЛИЦА УМНОЖЕНИЯ");
        for (byte i=1; i<=10; i++) {
            for (byte j=2; j<=5; j++) {
                result=(byte)(i*j);
                System.out.format("%d ✕ %2d = %2d \t",j,i,result);
            }
            System.out.println();
        }

        System.out.println();

        for (byte i=1; i<=10; i++) {
            for (byte j=6; j<10; j++) {
                result=(byte)(i*j);
                System.out.format("%d ✕ %2d = %2d \t",j,i,result);
            }
            System.out.println();
        }

        System.out.println("ЭТО НУЖНО ЗНАТЬ!");
    }
}
