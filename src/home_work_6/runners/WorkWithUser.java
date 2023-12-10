package home_work_6.runners;

import home_work_6.tools.WorkOnBook;
import home_work_6.searches.EasySearch;
import home_work_6.searches.Searcher;

import java.io.*;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WorkWithUser {
    public static void main(String[] args) {
        Searcher searcher=new Searcher(new EasySearch());
        WorkOnBook worker=new WorkOnBook();
        Scanner myScanner=new Scanner(System.in);
        System.out.println("Введите адрес папки для работы программы");

        try {
            String link=myScanner.nextLine();

            File dir=new File (link); // Создание директории
            LinkedList <File> files=new LinkedList<>(); // Создание списка файлов

            for (File item: dir.listFiles()) {
                boolean checkExtensionOnFile=worker.checkExtension(item);
                if (checkExtensionOnFile) {
                    files.add(item);
                }
            }

            FileWriter writer = new FileWriter("HomeWork/src/home_work_6/files/result.txt");

            int i=1;
            for (File file:files) { // Вывод файлов в консоль
                System.out.println(i);
                System.out.println(file.getName());
                i++;
            }

            boolean fileChange=true; // Маркер необходимости выбора номера файла
            String bookInAString="";

            // "Старт" программы для поиска
            while (true) {
                String name="";
                if (fileChange) {
                    System.out.println("Выберите номер файла из перечисленных");
                    int numberOfFile=myScanner.nextInt();
                    if (numberOfFile<=0) {
                        break;
                    } else {
                        numberOfFile--;
                    }
                    myScanner.nextLine();

                    name=files.get(numberOfFile).getName();
                    bookInAString=worker.readABook(files.get(numberOfFile)); // Получение строки из выбранного файла
                    fileChange=false;
                }

                System.out.println("Введите слово для поиска");
                String word=myScanner.nextLine();

                long quantity=searcher.findFrequencyOfWord(bookInAString, word);
                System.out.println("Частота встречаемости данного слова в выбранном файле составила: "+quantity);

                writer.write(name+"\n"+" - "+word+" - "+quantity+"\n");

                // Меню для дальнейших действий программы
                System.out.println("Если вы хотите продолжить поиск слов, введите: 1");
                System.out.println("Если вы хотите выбрать другой файл для работы, введите: 2");
                System.out.println("Если вы хотите завершить работу с программой, введите: 3");
                int programCode=myScanner.nextInt();
                myScanner.nextLine();

                if (programCode==3){
                    writer.close();
                    break;
                }

                if (programCode==2){
                    fileChange=true;
                }
            }
        } catch(InputMismatchException e) {
            throw new RuntimeException("Неверный тип данных"+e);
        } catch(NoSuchElementException e) {
            throw new RuntimeException("Отсутствуют введенные данные"+e);
        } catch(NullPointerException e) {
            throw new RuntimeException ("Ошибка при работе с директорией. Проверьте корректность введенного адреса. Проверьте наличие файлов"+e);
        } catch (StringIndexOutOfBoundsException e) {
            throw new RuntimeException("Неверный формат имени файла"+e);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при вводе-выводе данных"+e);
        }
    }
}
