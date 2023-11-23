package home_work_5.comparators;

import home_work_5.info_on_objects.Animal;

import java.util.Comparator;

public class AnimalComparatorByAge implements Comparator<Animal> {

    /**
     * Реализация метода compare для класса Animal по возрасту животного
     * @param animal1 the first object to be compared.
     * @param animal2 the second object to be compared.
     * @return 0, если animal1=animal2
     *         -1, если animal1<animal2
     *         1, если animal1>animal2
     */
    @Override
    public int compare(Animal animal1, Animal animal2) {
        if (animal1==null&&animal2==null) {
            return 0;
        }

        if (animal1==null){
            return -1;
        }

        if (animal2==null){
            return 1;
        }

        int age1=animal1.getAge();
        int age2=animal2.getAge();

        if (age1>age2) {
            return 1;
        }

        if (age1<age2) {
            return -1;
        }

        return 0;
    }
}
