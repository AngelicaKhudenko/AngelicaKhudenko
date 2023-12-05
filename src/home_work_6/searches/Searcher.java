package home_work_6.searches;

import home_work_6.api.ISearchEngine;

public class Searcher {
    private ISearchEngine searcher; // Поле, хранящее объект типа ISearchEngine
    public Searcher(ISearchEngine searcher) { // конструктор, принимающий объект типа ICalculator
        this.searcher = searcher;
    } // Конструктор

    /**
     * Метод, который возвращает частоту встречаемости слова в тексте, переданном в строке
     * @param bookInString - текст
     * @param word - слово для поиска
     * @return - возвращает число раз, которое слово встречается в тексте
     */
    public long findFrequencyOfWord(String bookInString, String word) {
        long result=0;
        try{
            result=searcher.search(bookInString,word);
        } catch (IllegalArgumentException e) {
            System.out.println("Передан неверный аргумент"+e);
        }
        return result;
    }
}
