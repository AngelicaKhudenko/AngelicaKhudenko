package home_work_6.searchers;

import home_work_6.searches.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearcherTest {
    @Test
    public void findFrequencyOfWord1 (){
        Searcher searcher=new Searcher(new EasySearch());
        long result=searcher.findFrequencyOfWord("привет, как дела!","привет");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void findFrequencyOfWord2 (){
        Searcher searcher=new Searcher(new EasySearch());
        long result=searcher.findFrequencyOfWord("теплыйВесенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord3 (){
        Searcher searcher=new Searcher(new EasySearch());
        long result=searcher.findFrequencyOfWord("теплыйN Весенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord4 (){
        Searcher searcher=new Searcher(new EasySearch());
        long result=searcher.findFrequencyOfWord("Теплый Весенний Вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord5 (){
        Searcher searcher=new Searcher(new EasySearch());
        long result=searcher.findFrequencyOfWord("Теплый весенний вечер!","вечер");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void findFrequencyOfWord6 (){
        Searcher searcher=new Searcher(new RegExSearch());
        long result=searcher.findFrequencyOfWord("привет, как дела!","привет");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void findFrequencyOfWord7 (){
        Searcher searcher=new Searcher(new RegExSearch());
        long result=searcher.findFrequencyOfWord("теплыйВесенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord8 (){
        Searcher searcher=new Searcher(new RegExSearch());
        long result=searcher.findFrequencyOfWord("теплыйN Весенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord9 (){
        Searcher searcher=new Searcher(new RegExSearch());
        long result=searcher.findFrequencyOfWord("Теплый Весенний Вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord10 (){
        Searcher searcher=new Searcher(new RegExSearch());
        long result=searcher.findFrequencyOfWord("Теплый весенний вечер!","вечер");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void findFrequencyOfWord11 (){
        Searcher searcher=new Searcher(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        long result=searcher.findFrequencyOfWord("привет, как дела!","привет");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void findFrequencyOfWord12 (){
        Searcher searcher=new Searcher(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        long result=searcher.findFrequencyOfWord("теплыйВесенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord13 (){
        Searcher searcher=new Searcher(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        long result=searcher.findFrequencyOfWord("теплыйN Весенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord14 (){
        Searcher searcher=new Searcher(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        long result=searcher.findFrequencyOfWord("Теплый Весенний Вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord15 (){
        Searcher searcher=new Searcher(new SearchEnginePunctuationNormalizer(new RegExSearch()));
        long result=searcher.findFrequencyOfWord("Теплый весенний вечер!","вечер");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void findFrequencyOfWord16 (){
        Searcher searcher=new Searcher(new SearchEngineCaseNormalizer(new EasySearch()));
        long result=searcher.findFrequencyOfWord("привет, как дела!","привет");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void findFrequencyOfWord17 (){
        Searcher searcher=new Searcher(new SearchEngineCaseNormalizer(new EasySearch()));
        long result=searcher.findFrequencyOfWord("теплыйВесенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord18 (){
        Searcher searcher=new Searcher(new SearchEngineCaseNormalizer(new EasySearch()));
        long result=searcher.findFrequencyOfWord("теплыйN Весенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @Test
    public void findFrequencyOfWord19 (){
        Searcher searcher=new Searcher(new SearchEngineCaseNormalizer(new EasySearch()));
        long result=searcher.findFrequencyOfWord("Теплый Весенний Вечер","теплый");
        Assertions.assertEquals(1,result);
    }

    @Test
    public void findFrequencyOfWord20 (){
        Searcher searcher=new Searcher(new SearchEngineCaseNormalizer(new EasySearch()));
        long result=searcher.findFrequencyOfWord("Теплый весенний вечер!","вечер");
        Assertions.assertEquals(1,result);
    }
}
