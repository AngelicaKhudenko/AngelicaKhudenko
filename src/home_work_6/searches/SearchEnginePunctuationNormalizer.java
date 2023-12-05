package home_work_6.searches;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;
    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
            this.searchEngine = searchEngine;
    }

    /**
     * Метод, который ищет слово в тексте, предварительно удалив нежелательные символы
     * @param text - текст для поиска слова
     * @param word - слово для поиска
     * @return
     */
    @Override
    public long search(String text, String word) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9\\s]", ""); // Удаление нежелательных символов
        cleanedText = text.replaceAll("\\s+", " "); // Замена лишних пробелов на один пробел
        cleanedText = text.replaceAll("\\p{C}", ""); // Удаление переводов строк и других управляющих символов
        return searchEngine.search(cleanedText, word);
    }
}
