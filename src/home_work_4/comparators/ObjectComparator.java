package home_work_4.comparators;

import java.util.Comparator;

public class ObjectComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }

        if (o1 == null) {
            return -1;
        }

        if (o2 == null) {
            return 1;
        }

        if (o1.hashCode()<o2.hashCode()) {
            return -1;
        }

        if (o1.hashCode()>o2.hashCode()) {
            return 1;
        }

        return 0;
    }
}
