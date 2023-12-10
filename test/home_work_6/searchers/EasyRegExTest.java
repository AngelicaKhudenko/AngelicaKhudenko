package home_work_6.searchers;

import home_work_6.api.ISearchEngine;
import home_work_6.searches.EasySearch;
import home_work_6.searches.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EasyRegExTest {

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void search1 (ISearchEngine searchEngine) {
        long result=searchEngine.search("привет, как дела!", "привет");
        Assertions.assertEquals(1,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void search2 (ISearchEngine searchEngine) {
        long result=searchEngine.search("привет, как дела!", "как");
        Assertions.assertEquals(1,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void search3 (ISearchEngine searchEngine) {
        long result=searchEngine.search("привет, как дела!", "дел");
        Assertions.assertEquals(0,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void search4(ISearchEngine searchEngine) {
        long result=searchEngine.search("привет-привет!", "привет");
        Assertions.assertEquals(0,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void search5(ISearchEngine searchEngine) {
        long result=searchEngine.search("Мама мыла раму", "мыл");
        Assertions.assertEquals(0,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void search6(ISearchEngine searchEngine) {
        long result=searchEngine.search("как дела!.Что делаешь?", "Как");
        Assertions.assertEquals(0,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void search7(ISearchEngine searchEngine) {
        long result=searchEngine.search("Привет -привет", "Привет");
        Assertions.assertEquals(1,result);
    }

    @ParameterizedTest
    @MethodSource("searchEngineProvider")
    public void search8(ISearchEngine searchEngine) {
        long result=searchEngine.search("Зимой часто идет снег. Снег делает город красивее", "снег");
        Assertions.assertEquals(1,result);
    }


    public static Stream<ISearchEngine> searchEngineProvider(){
        return Stream.of(
                new EasySearch(),
                new RegExSearch()
        );
    }
}
