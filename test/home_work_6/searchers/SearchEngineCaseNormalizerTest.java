package home_work_6.searchers;

import home_work_6.searches.EasySearch;
import home_work_6.searches.SearchEngineCaseNormalizer;
import home_work_6.searches.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineCaseNormalizerTest {
    @Test
    public void search1 () {
        SearchEngineCaseNormalizer mySearch=new SearchEngineCaseNormalizer(new EasySearch());
        long result=mySearch.search("привет, как дела!", "привет");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void search2 () {
        SearchEngineCaseNormalizer mySearch=new SearchEngineCaseNormalizer(new EasySearch());
        long result=mySearch.search("дела .дела Дела. -дела дела-дела Дела!", "Дела");
        Assertions.assertEquals(3,result);
    }

    @Test
    public void search3 () {
        SearchEngineCaseNormalizer mySearch=new SearchEngineCaseNormalizer(new EasySearch());
        long result=mySearch.search("привет, как дела!", "дел");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search4() {
        SearchEngineCaseNormalizer mySearch=new SearchEngineCaseNormalizer(new EasySearch());
        long result=mySearch.search("привет-привет!", "привет");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search5() {
        SearchEngineCaseNormalizer mySearch=new SearchEngineCaseNormalizer(new EasySearch());
        long result=mySearch.search("Мама мыла раму", "мыл");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search6() {
        SearchEngineCaseNormalizer mySearch=new SearchEngineCaseNormalizer(new EasySearch());
        long result=mySearch.search("как дела!.Что делаешь?", "Как");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void search7() {
        SearchEngineCaseNormalizer mySearch=new SearchEngineCaseNormalizer(new EasySearch());
        long result=mySearch.search("Привет привет", "Привет");
        Assertions.assertEquals(2,result);
    }

    @Test
    public void search8() {
        SearchEngineCaseNormalizer mySearch=new SearchEngineCaseNormalizer(new EasySearch());
        long result=mySearch.search("Зимой часто идет снег. Снег делает город красивее", "снег");
        Assertions.assertEquals(2,result);
    }
}
