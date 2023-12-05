package home_work_6.searches;

import home_work_3.calcs.api.ICalculator;
import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        if (text!=null&&word!=null&&!text.isEmpty()&&!word.isEmpty()) {
            int lengthOfWord=word.length();
            long result=0;
            int indexOfWord=text.indexOf(word); // Индекс элемента
            while (indexOfWord!=-1) {
                if ((indexOfWord==0||text.charAt(indexOfWord-1)==32) &&( // Проверка на предыдущий и на последующий символы после слова
                        indexOfWord+lengthOfWord==text.length()||
                        text.charAt(indexOfWord+lengthOfWord)==32|| // Символ пробела
                        text.charAt(indexOfWord+lengthOfWord)==33|| // Символ восклицательного знака
                        text.charAt(indexOfWord+lengthOfWord)==40|| // Открывающаяся скобка
                        text.charAt(indexOfWord+lengthOfWord)==41|| // Закрывающаяся скобка
                        text.charAt(indexOfWord+lengthOfWord)==44|| // Запятая
                        text.charAt(indexOfWord+lengthOfWord)==46|| // Точка
                        text.charAt(indexOfWord+lengthOfWord)==58|| // Двоеточие
                        text.charAt(indexOfWord+lengthOfWord)==59)) { // Точка с запятой
                        result++;
                    }
                indexOfWord=text.indexOf(word, indexOfWord+lengthOfWord);
            }
            return result;
        } else {
            throw new IllegalArgumentException("Переданы некорректные аргументы");
        }
    }
}
