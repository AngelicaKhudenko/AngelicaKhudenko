package home_work_6.runners;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class WorkWithStreamsTest {
    @Test
    public void makeWorkOnSearch1() throws ExecutionException, InterruptedException {
        int quantityOfThreads = 2;
        String word = "и";
        String[] booksInString = {"Настал декабрь и пришла зима. Пришли морозы и выпал снег", "Мороз и солнце"};

        WorkWithStreams worker = new WorkWithStreams();
        ArrayList<Future<Long>> futureResult = worker.makeWorkOnSearch(quantityOfThreads, word, booksInString);

        ArrayList<Long> resultLong = new ArrayList<>();
        for (Future<Long> future : futureResult) {
            resultLong.add(future.get());
        }

        ArrayList<Long> check = new ArrayList<>();
        check.add(2L);
        check.add(1L);
        Assertions.assertEquals(check, resultLong);
    }

    @Test
    public void makeWorkOnSearch2() throws ExecutionException, InterruptedException {
        int quantityOfThreads = 2;
        String word = "Осень";
        String[] booksInString = {"Настал декабрь и пришла зима. Пришли морозы и выпал снег", "Мороз и солнце"};

        WorkWithStreams worker = new WorkWithStreams();
        ArrayList<Future<Long>> futureResult = worker.makeWorkOnSearch(quantityOfThreads, word, booksInString);

        ArrayList<Long> resultLong = new ArrayList<>();
        for (Future<Long> future : futureResult) {
            resultLong.add(future.get());
        }

        ArrayList<Long> check = new ArrayList<>();
        check.add(0L);
        check.add(0L);
        Assertions.assertEquals(check, resultLong);
    }

    @Test
    public void makeWorkOnSearch3() throws ExecutionException, InterruptedException {
        int quantityOfThreads = 2;
        String word = "Осень";
        String[] booksInString = {};

        WorkWithStreams worker = new WorkWithStreams();
        ArrayList<Future<Long>> futureResult = worker.makeWorkOnSearch(quantityOfThreads, word, booksInString);

        ArrayList<Long> resultLong = new ArrayList<>();
        for (Future<Long> future : futureResult) {
            resultLong.add(future.get());
        }

        ArrayList<Long> check = new ArrayList<>();
        Assertions.assertEquals(check, resultLong);
    }
}
