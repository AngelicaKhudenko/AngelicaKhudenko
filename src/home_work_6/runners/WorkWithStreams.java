package home_work_6.runners;

import home_work_6.searches.SearchRun;
import home_work_6.tools.WorkOnBook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

public class WorkWithStreams {
    public static void main(String[] args) {
        WorkOnBook worker = new WorkOnBook();
        ArrayList<File> files = new ArrayList<>(); // Создание списка файлов
        String word = "";

        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Введите адрес папки для работы программы");
            String link = myScanner.nextLine();
            File dir = new File(link); // Создание директории

            for (File item : Objects.requireNonNull(dir.listFiles())) {
                boolean checkExtensionOnFile = worker.checkExtension(item);
                if (checkExtensionOnFile) {
                    files.add(item);
                }
            }

            int length = files.size();
            String[] booksInString = new String[length];
            int i = 0;
            for (File item : files) { // Создание массива книг, представленных в виде строки
                booksInString[i] = worker.readABook(item);
                i++;
            }

            try (FileWriter writer = new FileWriter("HomeWork/src/home_work_6/files/result.txt")) {
                while (true) {
                    System.out.println("Введите слово для поиска");
                    word = myScanner.nextLine();

                    ArrayList<Future<Long>> futureResult = new WorkWithStreams().makeWorkOnSearch(2, word, booksInString);
                    i = 0;
                    for (File file : files) {
                        String name = file.getName();
                        Future<Long> quantity = futureResult.get(i);

                        try {
                            Long count = quantity.get();
                            writer.write(name + "\n" + " - " + word + " - " + count + "\n");
                        } catch (Exception e) {
                            throw new RuntimeException("Ошибка в получении результата работы" + e);
                        }

                        i++;
                    }

                    // Меню для дальнейших действий программы
                    System.out.println("Если вы хотите продолжить поиск слов, введите: 1");
                    System.out.println("Если вы хотите завершить работу с программой, введите: 2");
                    int programCode = myScanner.nextInt();
                    myScanner.nextLine();

                    if (programCode == 2) {
                        writer.flush();
                        break;
                    }
                }
            }
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Отсутствуют введенные данные" + e + "\n");
        } catch (NullPointerException e) {
            throw new RuntimeException("Ошибка при работе с директорией. Проверьте корректность введенного адреса. Проверьте наличие файлов" + e + "\n");
        } catch (StringIndexOutOfBoundsException e) {
            throw new RuntimeException("Неверный формат имени файла" + e + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Error while writing to the file: " + e + "\n");
        }
    }

    /**
     * Метод, который многопоточно осуществляет поиск слова в массиве строк
     * @param quantityOfThreads - количество потоков
     * @param word - слово для поиска
     * @param booksInString - массив строк, в которых будет осуществляться поиск
     * @return futureResult - возвращает список элементов типа <Future<Long>>, содержащих информацию о частоте встречаемости слова в каждой из строк
     */
    public ArrayList<Future<Long>> makeWorkOnSearch (int quantityOfThreads, String word, String [] booksInString){
        ExecutorService executorService = Executors.newFixedThreadPool(quantityOfThreads);
        ArrayList<Future<Long>> futureResult = new ArrayList<>();
        for (String bookInAString : booksInString) {
            Callable<Long> task = new SearchRun(bookInAString, word);
            Future<Long> future = executorService.submit(task);
            futureResult.add(future);
        }
        executorService.shutdown();
        return futureResult;
    }
}
