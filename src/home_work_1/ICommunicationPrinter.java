package home_work_1;

public interface ICommunicationPrinter {
    /**
     * Метод, который создает строку для приветствия пользователя в зависимости от его имени
     * @param name - имя, которое предоставляет пользователь
     * @return welcom "Привет!" на одной строке, а на второй "Я тебя так долго ждал" - если имя "Вася"
     *         welcom "Я тебя так долго ждал", если имя "Анастасия"
     *         welcom "Добрый день, а вы кто?", если введено другое имя
     */
    String welcom(String name);
}
