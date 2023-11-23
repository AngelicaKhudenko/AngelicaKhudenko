package home_work_5.generation_of_strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GeneratingForNicksOfAnimals {

    /**
     * Метод, который генерирует рандомную строку заданной длины с печатными символами из таблицы ASCII (с 33 по 126 символ)
     * @param length - длина строки
     * @return result - сгенерированная строка
     */
    public static String RandomStringWithPrintableCharacters (int length) {
        Random myRandom=new Random();
        StringBuilder result=new StringBuilder();
        char resultOfRandom; // Создание переменной для создания символов строки
        for (int i=0; i<length; i++){
            resultOfRandom= (char) (myRandom.nextInt(94)+33);
            result.append(resultOfRandom);
        }
        return result.toString();
    }


    /**
     * Метод, который генерирует строку рандомной длины с русскими буквами в верхнем и нижнем регистре
     * @param length - длина строки
     * @return result - сгенерированная строка
     */
    public static String RandomStringRussianLetters (int length) {
        String acceptedLetters="ЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮЁйцукенгшщзхъфывапролджэячсмитьбюё"; // Строка, содержащая допустимые буквы для генерации
        Random myRandom=new Random();
        StringBuilder result=new StringBuilder();
        for (int i=0; i<length; i++){
            result.append(acceptedLetters.charAt(myRandom.nextInt(length)));
        }
        return result.toString();
    }

    /**
     * Метод, который генерирует рандомную кличку из кличек, содержащихся в поле nicksForGeneration
     * @return возвращает сгенерированную кличку
     */
    public static String generateRandomName() {
        String[] nicksForGeneration =new String[]{"Шарик", "Матроскин", "Том", "Джерри", "Дуся", "Барсик", "Снежок", "Чапа", "Мурзик"};
        Random myRandom=new Random();
        int lengthOfNames=nicksForGeneration.length;
        return nicksForGeneration[myRandom.nextInt(lengthOfNames)];
    }

    /**
     * Метод, который генерирует кличку из кличек, содержащихся в файле nicksForAnimals.txt
     * @return - возвращает сгенерированную кличку
     * @throws IOException
     */
    public static String generateNameFromFile() throws IOException {
        ArrayList<String> listOfNames = new ArrayList<String>();
        File myFile = new File("HomeWork/src/home_work_5/nicksForAnimals.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            while (reader.ready()) {
                listOfNames.add(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла", e);
        }

        int length = listOfNames.size();
        Random myRandom = new Random();
        return listOfNames.get(myRandom.nextInt(length));
    }
}
