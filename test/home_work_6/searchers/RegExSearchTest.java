package home_work_6.searchers;

import home_work_6.searches.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExSearchTest {
    @Test
    public void search1 () {
        RegExSearch mySearch=new RegExSearch();
        long result=mySearch.search("привет, как дела!", "привет");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void search2 () {
        RegExSearch mySearch=new RegExSearch();
        long result=mySearch.search("привет, как дела!", "как");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void search3 () {
        RegExSearch mySearch=new RegExSearch();
        long result=mySearch.search("привет, как дела!", "дел");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search4() {
        RegExSearch mySearch=new RegExSearch();
        long result=mySearch.search("привет-привет!", "привет");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search5() {
        RegExSearch mySearch=new RegExSearch();
        long result=mySearch.search("Мама мыла раму", "мыл");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search6() {
        RegExSearch mySearch=new RegExSearch();
        long result=mySearch.search("как дела!.Что делаешь?", "Как");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void search7() {
        RegExSearch mySearch=new RegExSearch();
        long result=mySearch.search("Привет -привет", "Привет");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void search8() {
        RegExSearch mySearch=new RegExSearch();
        long result=mySearch.search("Зимой часто идет снег. Снег делает город красивее", "снег");
        Assertions.assertEquals(1,result);
    }
}
