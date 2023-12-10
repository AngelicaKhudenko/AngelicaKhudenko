package home_work_6.searchers;

import home_work_6.api.ISearchEngine;
import home_work_6.searches.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SearcherTest {

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void findFrequencyOfWord1 (ISearchEngine searchEngine){
        Searcher searcher=new Searcher(searchEngine);
        long result=searcher.findFrequencyOfWord("привет, как дела!","привет");
        Assertions.assertEquals(1,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void findFrequencyOfWord2 (ISearchEngine searchEngine){
        Searcher searcher=new Searcher(searchEngine);
        long result=searcher.findFrequencyOfWord("теплыйВесенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void findFrequencyOfWord3 (ISearchEngine searchEngine){
        Searcher searcher=new Searcher(searchEngine);
        long result=searcher.findFrequencyOfWord("теплыйN Весенний вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void findFrequencyOfWord4 (ISearchEngine searchEngine){
        Searcher searcher=new Searcher(searchEngine);
        long result=searcher.findFrequencyOfWord("Теплый Весенний Вечер","теплый");
        Assertions.assertEquals(0,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void findFrequencyOfWord5 (ISearchEngine searchEngine){
        Searcher searcher=new Searcher(searchEngine);
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

    public static Stream<ISearchEngine> searchEngineProvider(){
        return Stream.of(
                new EasySearch(),
                new RegExSearch()
        );
    }
}
