package home_work_5;

import home_work_5.comparators.AnimalComparatorByAge;
import home_work_5.comparators.AnimalComparatorByAgeAndNicks;
import home_work_5.comparators.PersonComparatorByPassword;
import home_work_5.comparators.PersonComparatorByPasswordAndNicks;
import home_work_5.info_on_objects.Animal;
import home_work_5.info_on_objects.Person;

import java.util.*;

public class MainUsual {
    public static void main(String[] args) {
        // Создание коллекций
        LinkedList<Person> personLinkedList = new LinkedList<Person>();
        LinkedList<Animal> animalLinkedList = new LinkedList<Animal>();
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
        HashSet<Person> personHashSet=new HashSet<Person>();
        HashSet <Animal> animalHashSet=new HashSet<Animal>();
        TreeSet<Person> personTreeSet=new TreeSet<Person>(new PersonComparatorByPasswordAndNicks());
        TreeSet <Animal> animalTreeSet=new TreeSet<Animal>(new AnimalComparatorByAgeAndNicks());
        int size=1_000_000;

        // Заполнение коллекций данными
        System.out.println(AutoMethods.fillInACollection(personLinkedList,new Person(),size));
        System.out.println(AutoMethods.fillInACollection(animalLinkedList,new Animal(),size));
        System.out.println(AutoMethods.fillInACollection(personArrayList,new Person(),size));
        System.out.println(AutoMethods.fillInACollection(animalArrayList,new Animal(),size));
        System.out.println(AutoMethods.fillInACollection(personHashSet,new Person(),size));
        System.out.println(AutoMethods.fillInACollection(animalHashSet,new Animal(),size));
        System.out.println(AutoMethods.fillInACollection(personTreeSet,new Person(),size));
        System.out.println(AutoMethods.fillInACollection(animalTreeSet,new Animal(),size));

        // Сортировка встроенными средствами jdk
        personLinkedList.sort(new PersonComparatorByPassword());
        personLinkedList.sort(new PersonComparatorByPasswordAndNicks());
        animalLinkedList.sort(new AnimalComparatorByAge());
        animalLinkedList.sort(new AnimalComparatorByAgeAndNicks());
        personArrayList.sort(new PersonComparatorByPassword());
        personArrayList.sort(new PersonComparatorByPasswordAndNicks());
        animalArrayList.sort(new AnimalComparatorByAge());
        animalArrayList.sort(new AnimalComparatorByAgeAndNicks());

        // HashSet нельзя отсортировать напрямую, как LinkedList или ArrayList, так как HashSet не запоминает порядок вставки элементов.
        // Преобразование в ArrayList, сортировка новой коллекции
        AutoMethods.sortHashSet(personHashSet,new PersonComparatorByPassword());
        AutoMethods.sortHashSet(personHashSet,new PersonComparatorByPasswordAndNicks());
        AutoMethods.sortHashSet(animalHashSet,new AnimalComparatorByAge());
        AutoMethods.sortHashSet(animalHashSet,new AnimalComparatorByAgeAndNicks());

        // TreeSet сортируется при его создании, поэтому дополнительной сортировке напрямую подвергаться не может
        // Создание новой коллекции с новым методом сортировки
        AutoMethods.sortTreeSet(personTreeSet,new PersonComparatorByPassword());
        AutoMethods.sortTreeSet(personTreeSet,new PersonComparatorByPasswordAndNicks());
        AutoMethods.sortTreeSet(animalTreeSet,new AnimalComparatorByAge());
        AutoMethods.sortTreeSet(animalTreeSet,new AnimalComparatorByAgeAndNicks());

        // Сортировка собственным методом
        AutoMethods.myVariantOfSort(personLinkedList,new PersonComparatorByPasswordAndNicks());
        AutoMethods.myVariantOfSort(personArrayList,new PersonComparatorByPasswordAndNicks());
        AutoMethods.myVariantOfSort(personHashSet,new PersonComparatorByPasswordAndNicks());
        AutoMethods.myVariantOfSort(personTreeSet,new PersonComparatorByPasswordAndNicks());
        AutoMethods.myVariantOfSort(animalLinkedList,new AnimalComparatorByAgeAndNicks());
        AutoMethods.myVariantOfSort(animalArrayList,new AnimalComparatorByAgeAndNicks());
        AutoMethods.myVariantOfSort(animalHashSet,new AnimalComparatorByAgeAndNicks());
        AutoMethods.myVariantOfSort(animalTreeSet,new AnimalComparatorByAgeAndNicks());

        // Итерирование коллекций с помощью итераторов
        System.out.println(AutoMethods.makeIterationWithIterator(personLinkedList));
        System.out.println(AutoMethods.makeIterationWithIterator(animalLinkedList));
        System.out.println(AutoMethods.makeIterationWithIterator(personArrayList));
        System.out.println(AutoMethods.makeIterationWithIterator(animalArrayList));
        System.out.println(AutoMethods.makeIterationWithIterator(personHashSet));
        System.out.println(AutoMethods.makeIterationWithIterator(animalHashSet));
        System.out.println(AutoMethods.makeIterationWithIterator(personTreeSet));
        System.out.println(AutoMethods.makeIterationWithIterator(animalTreeSet));

        // Итерирование коллекций с помощью цикла for
        System.out.println(AutoMethods.makeIterationWithFor(personLinkedList));
        System.out.println(AutoMethods.makeIterationWithFor(animalLinkedList));
        System.out.println(AutoMethods.makeIterationWithFor(personArrayList));
        System.out.println(AutoMethods.makeIterationWithFor(animalArrayList));
        System.out.println(AutoMethods.makeIterationWithFor(personHashSet));
        System.out.println(AutoMethods.makeIterationWithFor(animalHashSet));
        System.out.println(AutoMethods.makeIterationWithFor(personTreeSet));
        System.out.println(AutoMethods.makeIterationWithFor(animalTreeSet));

        // Удаление коллекций с помощью clear
        System.out.println(AutoMethods.deleteAllElementsWithClear(personLinkedList));
        System.out.println(AutoMethods.deleteAllElementsWithClear(animalLinkedList));
        System.out.println(AutoMethods.deleteAllElementsWithClear(personArrayList));
        System.out.println(AutoMethods.deleteAllElementsWithClear(animalArrayList));

        // Удаление коллекций с помощью итератора
        System.out.println(AutoMethods.deleteAllElementsWithIterator(personHashSet));
        System.out.println(AutoMethods.deleteAllElementsWithIterator(animalHashSet));
        System.out.println(AutoMethods.deleteAllElementsWithIterator(personTreeSet));
        System.out.println(AutoMethods.deleteAllElementsWithIterator(animalTreeSet));
    }
}
