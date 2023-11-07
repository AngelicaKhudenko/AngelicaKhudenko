package home_work_1;

import java.util.Objects;

public class Task6_1 implements ICommunicationPrinter {
    public String welcom(String name) {
        String vasiliy="Вася";
        String nastya="Анастасия";

        if (Objects.equals(name,vasiliy)) {
            return "Привет!\nЯ тебя так долго ждал";
        } else {
            if (Objects.equals(name,nastya)) {
                return "Я тебя так долго ждал";
            } else {
                return "Добрый день, а вы кто?";
            }
        }
    }
}