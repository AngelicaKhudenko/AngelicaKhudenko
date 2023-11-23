package home_work_5;

import home_work_5.comparators.AnimalComparatorByAge;
import home_work_5.comparators.AnimalComparatorByAgeAndNicks;
import home_work_5.comparators.PersonComparatorByPassword;
import home_work_5.comparators.PersonComparatorByPasswordAndNicks;
import home_work_5.info_on_objects.Animal;
import home_work_5.info_on_objects.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MainWithManager {
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

        // Остальные действия над коллекцией
        System.out.println(AutoMethods.manager(personLinkedList,new PersonComparatorByPassword(), new PersonComparatorByPasswordAndNicks()));
        System.out.println(AutoMethods.manager(animalLinkedList,new AnimalComparatorByAge(), new AnimalComparatorByAgeAndNicks()));
        System.out.println(AutoMethods.manager(personArrayList,new PersonComparatorByPassword(), new PersonComparatorByPasswordAndNicks()));
        System.out.println(AutoMethods.manager(animalArrayList,new AnimalComparatorByAge(), new AnimalComparatorByAgeAndNicks()));
        System.out.println(AutoMethods.manager(personHashSet,new PersonComparatorByPassword(), new PersonComparatorByPasswordAndNicks()));
        System.out.println(AutoMethods.manager(animalHashSet,new AnimalComparatorByAge(), new AnimalComparatorByAgeAndNicks()));
        System.out.println(AutoMethods.manager(personTreeSet,new PersonComparatorByPassword(), new PersonComparatorByPasswordAndNicks()));
        System.out.println(AutoMethods.manager(animalTreeSet,new AnimalComparatorByAge(), new AnimalComparatorByAgeAndNicks()));
    }
}
