package home_work_5.comparators;

import home_work_5.info_on_objects.Person;
import java.util.Comparator;

public class PersonComparatorByPassword implements Comparator<Person> {
    /**
     * Реализация метода compare для класса Person по длине пароля
     * @param person1 the first object to be compared.
     * @param person2 the second object to be compared.
     * @return 0, если person1=person2
     *         -1, если person1<person2
     *         1, если person1>person2
     */
    @Override
    public int compare(Person person1, Person person2) {
        if (person1==null&&person2==null){
            return 0;
        }

        if (person1==null){
            return -1;
        }

        if (person2==null){
            return 1;
        }

        String password1=person1.getPassword();
        String password2=person2.getPassword();

        if (password1.length()>password2.length()) {
            return 1;
        }

        if (password1.length()<password2.length()) {
            return -1;
        }

        return 0;
    }
}
