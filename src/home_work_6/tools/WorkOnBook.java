package home_work_6.tools;

import java.io.*;
import java.util.*;

public class WorkOnBook {
    /**
     * Метод, который считывает переданный файл и формирует из него строку
     * @param myFile - файл для считывания
     * @return возвращает сформированную строку
     */
    public String readABook (File myFile) {
        StringBuilder builder=new StringBuilder();
        try (BufferedReader reader=new BufferedReader(new FileReader(myFile))){
            while (reader.ready()){
                builder.append(reader.readLine()); // Добавление строк текста в общую строку
            }
            reader.close();
            return builder.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Ошибка работы с файлом. Проверьте адрес и имя файла"+e);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при вводе-выводе данных"+e);
        }
    }

    /**
     * Метод, который разделяет переданную строку на слова
     * @param bookInString - строка для разделения на слова
     * @return возвращает массив строк, содержащих слова из переданной строки
     */
    public String [] splitInWords (String bookInString) {
        String regex = "\\s-\\s|\\s?[,.!?:)(;\"]+\\s?|\\s-|-\\s|\\s+"; // Регулярное выражение, обозначающее символы для разделения строки
        String [] wordsInString=bookInString.split(regex);
        ArrayList <String> wordsList = new ArrayList<>();
        for (String word : wordsInString) {
            if (!word.isEmpty() && word.matches("[a-zA-Zа-яА-Я]+|[a-zA-Zа-яА-Я]+-[a-zA-Zа-яА-Я]+")) {
                wordsList.add(word);
            }
        }

        return wordsList.toArray(new String[0]);
    }

    /**
     * Метод, который создает коллекцию hashSet из переданного массива строк
     * @param words - массив строк
     * @return wordsSet - возвращает коллекцию hashSet
     */
    public HashSet <String> makeSetCollection (String [] words) {
        HashSet<String> wordsSet=new HashSet<>(); // Создание сета HashSet

        for (String word:words) { // Итерация массива строк
            wordsSet.add(word); // Добавление слов из массива в коллекцию
        }

        return wordsSet;
    }

    /**
     * Метод, который принимает массив строк и возвращает мапу HashMap, храняющу топ-элементов по частоте встречаемости
     * @param words - массив строк
     * @param topNumber - число, обозначающего значение топ-рейтинга
     * @return mapResult - возвращает мапу, содержащую топ слов по частоте встречаемости
     */
    public LinkedHashMap<String, Integer> findTopWords (String [] words, int topNumber) {
        if (words == null||topNumber<=0) {
            throw new IllegalArgumentException("Передан неверный аргумент");
        }

        HashMap<String, Integer> fruquency = new HashMap<>(); // Создание первоначальной мапы
        LinkedHashMap<String, Integer> mapResult = new LinkedHashMap<>(); // Создание мапы для вывода результата

        for (String word : words) { // Итерация массива строк
            if (fruquency.containsKey(word)){ // Проверка на наличие слова в коллекции
                int fruquencyCount = fruquency.get(word); // Получение его значения, обозначающего частоту "встречаемости" в тексте
                fruquency.remove(word); // Удаление элемента
                fruquency.put(word, fruquencyCount + 1); // Запись нового элемента с увеличенным значением
            } else {
                fruquency.put(word, 1); // В ином случае добавление слова в коллекцию
            }
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(fruquency.entrySet()); // Создание списка с элементами из коллекции
        sortedList.sort(Map.Entry.<String, Integer>comparingByValue().reversed()); // Сортировка списка по значениям в порядке убывания


        for (int i = 0; i < topNumber; i++) {
            Map.Entry<String, Integer> mapTemp=sortedList.get(i);
            mapResult.put(mapTemp.getKey(), mapTemp.getValue());
        }

        return mapResult;
    }

    /**
     * Метод, который проверяет расширение переданного файла на соответствие формату txt
     * @param item - переданный файл
     * @return true - если расширение файла равно .txt
     *         false - если передан файл с другим расширением
     */
    public boolean checkExtension (File item){
        String name=item.getName(); // Имя файла
        int pointInfo=name.lastIndexOf("."); // Поиск точки
        String extension=name.substring(pointInfo+1); // Создание подстроки с расширением
        // Проверка расширение на формат txt
        return "txt".equals(extension);
    }
}
