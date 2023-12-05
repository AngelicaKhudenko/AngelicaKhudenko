package home_work_6.runners;

import home_work_6.tools.WorkOnBook;
import home_work_6.searches.*;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        WorkOnBook worker = new WorkOnBook();
        File myFile = new File("HomeWork/src/home_work_6/files/book.txt"); // Сохранение файла
        String bookInString = worker.readABook(myFile); // Вызов метода для чтения файла и создания строки
        String[] words = worker.splitInWords(bookInString); // Вызов метода для создания массива слов из строки текста
        Set<String> wordsSet = worker.makeSetCollection(words); // Вызов метода для заполнения коллекции set словами из массива
        System.out.println(wordsSet.size()); // Печать размера коллекции set

        HashMap<String, Integer> topTenWords = worker.findTopWords(words, 10); // Вызов метода для создания коллекции HashMap, содержащей топ-10 элементов по частоте встречаемости в массиве
        for (Map.Entry<String, Integer> entry : topTenWords.entrySet()) { // Итерация мапы
            System.out.println(entry.getKey() + " - " + entry.getValue() + " раз"); // Печать элементов мапы
        }

        // Создание слов для поиска в тексте
        String wordWar = "война";
        String wordPeace = "мир";
        String wordAnd = "и";

        Searcher firstSearcher = new Searcher(new EasySearch()); // Создание объекта, выполняющего поиск слова
        System.out.println("Поиск элементов с помощью EasySearch");
        System.out.println("Слово война встречается " + firstSearcher.findFrequencyOfWord(bookInString, wordWar) + " раз");
        System.out.println("Союз и встречается " + firstSearcher.findFrequencyOfWord(bookInString, wordAnd) + " раз");
        System.out.println("Слово мир встречается " + firstSearcher.findFrequencyOfWord(bookInString, wordPeace) + " раз");
        System.out.println("______________________________________________________________");

        Searcher secondSearcher = new Searcher(new RegExSearch()); // Создание объекта, выполняющего поиск слова
        System.out.println("Поиск элементов с помощью RegExSearch");
        System.out.println("Слово война встречается " + secondSearcher.findFrequencyOfWord(bookInString, wordWar) + " раз");
        System.out.println("Союз и встречается " + secondSearcher.findFrequencyOfWord(bookInString, wordAnd) + " раз");
        System.out.println("Слово мир встречается " + secondSearcher.findFrequencyOfWord(bookInString, wordPeace) + " раз");

        System.out.println("______________________________________________________________");

        Searcher thirdSearcher = new Searcher(new SearchEnginePunctuationNormalizer(new RegExSearch())); // Создание объекта, выполняющего поиск слова
        System.out.println("Поиск элементов с помощью SearchEnginePunctuationNormalizer");
        System.out.println("Слово война встречается " + thirdSearcher.findFrequencyOfWord(bookInString, wordWar) + " раз");
        System.out.println("Союз и встречается " + thirdSearcher.findFrequencyOfWord(bookInString, wordAnd) + " раз");
        System.out.println("Слово мир встречается " + thirdSearcher.findFrequencyOfWord(bookInString, wordPeace) + " раз");

        System.out.println("______________________________________________________________");

        Searcher fourthSearcher = new Searcher(new SearchEngineCaseNormalizer(new RegExSearch())); // Создание объекта, выполняющего поиск слова
        System.out.println("Поиск элементов с помощью SearchEngineCaseNormalizer (вне зависимости от регистра)");
        System.out.println("Слово война встречается " + fourthSearcher.findFrequencyOfWord(bookInString, wordWar) + " раз");
        System.out.println("Союз и встречается " + fourthSearcher.findFrequencyOfWord(bookInString, wordAnd) + " раз");
        System.out.println("Слово мир встречается " + fourthSearcher.findFrequencyOfWord(bookInString, wordPeace) + " раз");
    }
}
