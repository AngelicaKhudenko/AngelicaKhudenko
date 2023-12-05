package home_work_6.searchers;

import home_work_6.searches.EasySearch;
import home_work_6.searches.RegExSearch;
import home_work_6.searches.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEnginePunctuationNormalizerTest {
    @Test
    public void search1 () {
        SearchEnginePunctuationNormalizer mySearch=new SearchEnginePunctuationNormalizer(new EasySearch());
        long result=mySearch.search("привет,    как    дела!", "привет");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void search2 () {
        SearchEnginePunctuationNormalizer mySearch=new SearchEnginePunctuationNormalizer(new EasySearch());
        long result=mySearch.search("привет, как\n дела!", "как");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void search3 () {
        SearchEnginePunctuationNormalizer mySearch=new SearchEnginePunctuationNormalizer(new EasySearch());
        long result=mySearch.search("привет,\n как    дела!", "дел");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search4() {
        SearchEnginePunctuationNormalizer mySearch=new SearchEnginePunctuationNormalizer(new EasySearch());
        long result=mySearch.search("привет-привет   !", "привет");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search5() {
        SearchEnginePunctuationNormalizer mySearch=new SearchEnginePunctuationNormalizer(new EasySearch());
        long result=mySearch.search("Мама мыла    раму", "мыл");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search6() {
        SearchEnginePunctuationNormalizer mySearch=new SearchEnginePunctuationNormalizer(new EasySearch());
        long result=mySearch.search("как    дела!.Что делаешь?", "Как");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search7() {
        SearchEnginePunctuationNormalizer mySearch=new SearchEnginePunctuationNormalizer(new EasySearch());
        long result=mySearch.search("Привет    -привет", "Привет");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void search8() {
        SearchEnginePunctuationNormalizer mySearch=new SearchEnginePunctuationNormalizer(new EasySearch());
        long result=mySearch.search("Зимой часто идет снег.    Снег делает город красивее", "снег");
        Assertions.assertEquals(1,result);
    }
}
