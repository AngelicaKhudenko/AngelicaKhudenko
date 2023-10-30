package home_work_4.comparators;

import java.util.Comparator;

public class StringAlphabeticComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
