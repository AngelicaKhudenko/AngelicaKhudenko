package home_work_6.api;

public interface ISearchEngine {

    /**
     * Метод, который возвращает информации о количестве раз, которое встречается слово в тексте
     * @param text - текст для поиска слова
     * @param word - слово для поиска
     * @return search - количество раз, которое встречается слово в тексте
     */
    long search(String text, String word);
}
