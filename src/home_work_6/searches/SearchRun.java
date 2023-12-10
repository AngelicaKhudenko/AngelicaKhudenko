package home_work_6.searches;

import java.util.concurrent.Callable;

public class SearchRun implements Callable<Long> {
    private String bookInString;
    private String searchWord;


    public SearchRun (String bookInString, String searchWord) {
        this.bookInString = bookInString;
        this.searchWord = searchWord;
    }

    @Override
    public Long call() {
        Searcher searcher=new Searcher(new RegExSearch());
        return searcher.findFrequencyOfWord(bookInString,searchWord);
    }
}
