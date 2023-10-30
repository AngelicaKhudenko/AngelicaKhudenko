package home_work_4;

import home_work_4.comparators.StringAlphabeticComparator;
import home_work_4.comparators.StringLengthComparator;

public class MainExample {
    public static void main(String[] args) {
        String []data=new String[4];
        DataContainer <String> container=new DataContainer<>(data);

        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        System.out.println(container);

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);

        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом

        container.delete(text1);
        System.out.println(container.get(index1)); //Как дела

        container.sort(new StringLengthComparator()); //Сортируется по длине
        System.out.println(container); // ["Работаю", "Как дела", "Давай потом"]

        container.sort(new StringAlphabeticComparator()); //Сортируется по алфавиту
        System.out.println(container); // ["Давай потом", "Как дела", "Работаю"]
    }
}
