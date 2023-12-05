package home_work_6.searches;

import home_work_6.api.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    private ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer (ISearchEngine searchEngine){
        this.searchEngine=searchEngine;
    }

    /**
     * Метод, который ищет переданное слово в тексте, игнорируя регистр
     * @param text - текст для поиска слова
     * @param word - слово для поиска
     * @return
     */
    @Override
    public long search(String text, String word) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        return searchEngine.search(text, word);
    }
}
