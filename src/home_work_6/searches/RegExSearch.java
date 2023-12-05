package home_work_6.searches;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        if (text != null && word != null && !text.isEmpty() && !word.isEmpty()) {
            Pattern pattern = Pattern.compile("(?<!-)\\b"+word+"[),.:;?!\\s]");
            Matcher matcher = pattern.matcher(text);
            long result=0;
            while (matcher.find()) {
            result++;
            }
            return result;
        } else {
            throw new IllegalArgumentException("Переданы некорректные аргументы");
        }
    }
}
