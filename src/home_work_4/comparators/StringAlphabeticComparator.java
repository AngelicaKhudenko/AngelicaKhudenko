package home_work_4.comparators;

import java.util.Comparator;

public class StringAlphabeticComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }

        if (o1 == null) {
            return -1;
        }

        if (o2 == null) {
            return 1;
        }

        if (o1.compareToIgnoreCase(o2)<0){
            return -1;
        }

        if (o1.compareToIgnoreCase(o2)>0){
            return 1;
        }

        return 0;
    }
}
