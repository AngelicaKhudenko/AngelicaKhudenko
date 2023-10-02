package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int [] firstSort={1,2,3,4,5,6};
        int [] secondSort={1,1,1,1};
        int [] thirdSort={9,1,5,99,9,9};
        int [] fourthSort={};
        int [] fifthSort={6,5,4,3,2,1};

        System.out.println("Сортировка методом пузырьковой сортировки");

        System.out.println("Массив до сортировки: "+ Arrays.toString(firstSort));
        SortsUtils.sort(firstSort);
        System.out.println("Массив после сортировки: "+ Arrays.toString(firstSort));

        System.out.println("Массив до сортировки: "+ Arrays.toString(secondSort));
        SortsUtils.sort(secondSort);
        System.out.println("Массив после сортировки: "+ Arrays.toString(secondSort));

        System.out.println("Массив до сортировки: "+ Arrays.toString(thirdSort));
        SortsUtils.sort(thirdSort);
        System.out.println("Массив после сортировки: "+ Arrays.toString(thirdSort));

        System.out.println("Массив до сортировки: "+ Arrays.toString(fourthSort));
        SortsUtils.sort(fourthSort);
        System.out.println("Массив после сортировки: "+ Arrays.toString(fourthSort));

        System.out.println("Массив до сортировки: "+ Arrays.toString(fifthSort));
        SortsUtils.sort(fifthSort);
        System.out.println("Массив после сортировки: "+ Arrays.toString(fifthSort));

        System.out.println();

        int [] firstShake={1,2,3,4,5,6};
        int [] secondShake={1,1,1,1};
        int [] thirdShake={9,1,5,99,9,9};
        int [] fourthShake={};
        int [] fifthShake={6,5,4,3,2,1};

        System.out.println("Сортировка методом шейкерной сортировки");

        System.out.println("Массив до сортировки: "+ Arrays.toString(firstShake));
        SortsUtils.shake(firstShake);
        System.out.println("Массив после сортировки: "+ Arrays.toString(firstShake));

        System.out.println("Массив до сортировки: "+ Arrays.toString(secondShake));
        SortsUtils.shake(secondShake);
        System.out.println("Массив после сортировки: "+ Arrays.toString(secondShake));

        System.out.println("Массив до сортировки: "+ Arrays.toString(thirdShake));
        SortsUtils.shake(thirdShake);
        System.out.println("Массив после сортировки: "+ Arrays.toString(thirdShake));

        System.out.println("Массив до сортировки: "+ Arrays.toString(fourthShake));
        SortsUtils.shake(fourthShake);
        System.out.println("Массив после сортировки: "+ Arrays.toString(fourthShake));

        System.out.println("Массив до сортировки: "+ Arrays.toString(fifthShake));
        SortsUtils.shake(fifthShake);
        System.out.println("Массив после сортировки: "+ Arrays.toString(fifthShake));

        System.out.println();

        int []containerRandomSort= ArraysUtils.arrayRandom(50,100);
        System.out.println("Сортировка методом пузырьковой сортировки");
        System.out.println("Массив до сортировки: "+ Arrays.toString(containerRandomSort));
        SortsUtils.sort(containerRandomSort);
        System.out.println("Массив после сортировки: "+ Arrays.toString(containerRandomSort));
        int []containerRandomShake=ArraysUtils.arrayRandom(50,100);
        System.out.println("Сортировка методом шейкерной сортировки");
        System.out.println("Массив до сортировки: "+ Arrays.toString(containerRandomShake));
        SortsUtils.shake(containerRandomShake);
        System.out.println("Массив после сортировки: "+ Arrays.toString(containerRandomShake));

        System.out.println();

        int []containerConsoleSort=ArraysUtils.arrayFromConsole();
        System.out.println("Сортировка методом пузырьковой сортировки");
        System.out.println("Массив до сортировки: "+ Arrays.toString(containerConsoleSort));
        SortsUtils.sort(containerConsoleSort);
        System.out.println("Массив после сортировки: "+ Arrays.toString(containerConsoleSort));
        int []containerConsoleShake=ArraysUtils.arrayFromConsole();
        System.out.println("Сортировка методом шейкерной сортировки");
        System.out.println("Массив до сортировки: "+ Arrays.toString(containerConsoleShake));
        SortsUtils.shake(containerConsoleShake);
        System.out.println("Массив после сортировки: "+ Arrays.toString(containerConsoleShake));
    }
}
