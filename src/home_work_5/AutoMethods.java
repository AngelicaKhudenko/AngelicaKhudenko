package home_work_5;

import home_work_5.generation_of_strings.GeneratingForNames;
import home_work_5.generation_of_strings.GeneratingForNicks;
import home_work_5.generation_of_strings.GeneratingForNicksOfAnimals;
import home_work_5.info_on_objects.Animal;
import home_work_5.info_on_objects.Person;

import java.util.*;

public class AutoMethods {
    /**
     * Метод, который генерирует объект класса Person или Animal с помощью рандомайзера
     * @param objectType - тип объекта класса для генерирования (Animal/Person)
     * @return - сгенерированный объект типа T
     * @param <T> - тип возвращаемого значения
     */
    public static <T> T createAnObject (String objectType) {
        Random myRandom=new Random();
        switch (objectType) {
            case "Person":
                String nick= GeneratingForNicks.generateRandomName();
                int length=myRandom.nextInt(10)+1; // Длина пароля
                String password=GeneratingForNicks.RandomStringWithPrintableCharacters(length);
                String name= GeneratingForNames.generateRandomName();
                Person generatedPerson=new Person(nick,password,name); // Сгенерированный объект типа Person
                return (T) generatedPerson;
            case "Animal":
                int age=myRandom.nextInt(15)+1; // Возраст животного
                String nickOfAnimal= GeneratingForNicksOfAnimals.generateRandomName();
                Animal generatedAnimal=new Animal(age,nickOfAnimal); // Сгенерирвоанный объект типа Animal
                return (T) generatedAnimal;
            default:
                throw new IllegalArgumentException("Неверный тип: " + objectType);
        }
    }

    /**
     * Метод, который заполняет переданную коллекцию сгенерированными рандомно объекта, тип объекта передается через параметр
     * @param collection - коллекция для заполнения
     * @param objectType - тип объекта
     * @param size - размер коллекции
     * @return - строка, содержащая информацию о времени выполнения операции в мс
     * @param <T> - тип передаваемого объекта
     */
    public static <T> String  fillInACollection(Collection <T> collection, T objectType, int size) {
        long start=0;
        long end=0;
        long timeResult=0;
        if (objectType instanceof Person) {
            start=System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                collection.add(createAnObject("Person"));
            }
            end=System.currentTimeMillis();
            timeResult=end-start;
            return "Операция: заполнение коллекции. Заняла "+timeResult+" мс";
        } else if (objectType instanceof Animal) {
            start=System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                collection.add(createAnObject("Animal"));
            }
            end=System.currentTimeMillis();
            timeResult=end-start;
            return "Операция: заполнение коллекции. Заняла "+timeResult+" мс";
        }
        return "Ошибка";
    }

    /**
     * Метод, который выполняет сортировку коллекций HashSet переданным компаратором
     * @param hashSetForSort - коллекция HashSet для сортировки
     * @param comparator - компаратор для сравнения
     * @param <T> - тип объектов в коллекции
     */
    public static <T> void sortHashSet (HashSet <T> hashSetForSort, Comparator<? super T> comparator) {
        if (!hashSetForSort.isEmpty()) {
            LinkedList<T> collectionInArray = new LinkedList<>(hashSetForSort); // Преобразование в ArrayList
            collectionInArray.sort(comparator);
        } else {
            throw new IllegalArgumentException("Коллекция пуста. Сортировку выполнить невозможно.");
        }
    }

    /**
     * Метод, который выполняет сортировку коллекций TreeSet
     * @param collectionForSort - коллекция для сортировки
     * @param comparator - компаратор для сравнения
     * @param <T> - тип объектов в коллекции
     */
    public static <T> void sortTreeSet (TreeSet <T> collectionForSort, Comparator<? super T> comparator) {
        if (!collectionForSort.isEmpty()) {
            TreeSet<T> personTreeSetUpdated=new TreeSet<T>(comparator); // Создание новой коллекции с новым методом сортировки
            personTreeSetUpdated.addAll(collectionForSort); // Добавление элементов в новую коллекцию
            collectionForSort.clear(); // Очищение старой коллекции
            collectionForSort.addAll(personTreeSetUpdated); // Запись новых элементов в коллекцию
        } else {
            throw new IllegalArgumentException("Коллекция пуста. Сортировку выполнить невозможно.");
        }
    }

    /**
     * Метод, который занимается сортировкой данных, записанных в поле data, используя реализацию сравнения из переданного объекта comparator
     * @param comparator - механизм сортировки в зависимости от типа данных поля (Integer,Double,String,Object)
     */
    public static <T>void myVariantOfSort(Collection <T> collection, Comparator<T> comparator) {
        T []arrayFromCollection= (T[]) collection.toArray();
        int length=collection.size();
        T temporary;
        for (int i=0; i<length-1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (comparator.compare(arrayFromCollection[j - 1],arrayFromCollection[j])>0) {
                    temporary=arrayFromCollection[j-1];
                    arrayFromCollection[j-1]=arrayFromCollection[j];
                    arrayFromCollection[j]=temporary;
                }
            }
        }
        deleteAllElementsWithClear(collection);
        fillInACollection(collection,arrayFromCollection[0],length);
    }

    /**
     * Метод, который выполняет итерирование коллекции с помощью итератора
     * @param collection - коллекция для итерирования
     * @return - возвращает строку, содержащую время на выполнение итерации
     * @param <T> - тип объектов
     */
    public static <T> String makeIterationWithIterator(Collection <T> collection) {
        if (!collection.isEmpty()){
            long start=System.currentTimeMillis();
            Iterator<T> iterator=collection.iterator();
            while (iterator.hasNext()) {
                T objectIterated = iterator.next();
            }
            long end=System.currentTimeMillis();
            long timeResult=end-start;
            return "Операция: итерирование коллекции с помощью итератора. Заняла "+timeResult+" мс";
        } else {
            throw new IllegalArgumentException("Коллекция пуста");
        }
    }

    /**
     * Метод, выполняющий итерирование с помощью цикла for
     * @param collection - коллекция для итерирования
     * @return - возвращает строку, содержащую информацию о времени выполнения операции
     * @param <T> - тип объектов коллекции
     */
    public static <T> String makeIterationWithFor(Collection <T> collection) {
        long start=0;
        long end=0;
        long timeResult=0;
        if (!collection.isEmpty()){
            if (collection instanceof ArrayList||collection instanceof LinkedList) {
                start=System.currentTimeMillis();
                int length=collection.size();
                for (int i=0; i<length; i++) {
                    T objectIterated=((AbstractList<T>) collection).get(i);
                }
                end=System.currentTimeMillis();
                timeResult=end-start;
            } else if (collection instanceof HashSet||collection instanceof TreeSet) {
                // Итерирование hashSet возможно напрямую с помощью итераторов и с помощью foreach
                // Преобразование в массив, чтобы проитерировать другим способом
                start=System.currentTimeMillis();
                int length=collection.size();
                Object [] objectsArray = collection.toArray();
                for (int i=0; i<length; i++) {
                    T objectIterated=(T)objectsArray[i];
                }
                end=System.currentTimeMillis();
                timeResult=end-start;
            }
        } else {
            throw new IllegalArgumentException("Коллекция пуста");
        }
        return "Операция: итерирование коллекции с помощью цикла for. Заняла "+timeResult+" мс";
    }

    /**
     * Метод, который удаляет все элементы коллекции с помощью итератора
     * @param collection - коллекция для удаления
     * @return - возвращает строку, содержащую информацию о времени выполнения операции
     * @param <T> - тип объектов коллекции
     */
    public static <T> String deleteAllElementsWithIterator(Collection <T> collection) {
        if (!collection.isEmpty()){
            long start=System.currentTimeMillis();
            Iterator<T> iterator=collection.iterator();
            while (iterator.hasNext()) { // Удаление personTreeSet
                iterator.next();
                iterator.remove();
            }
            long end=System.currentTimeMillis();
            long timeResult=end-start;
            return "Операция: удаление коллекции с помощью итератора. Заняла "+timeResult+" мс";
        } else {
            throw new IllegalArgumentException("Коллекция пуста. Удаление невозможно");
        }
    }

    /**
     * Метод, который удаляет все элементы коллекции с помощью clear
     * @param collection - коллекция для удаления
     * @return - возвращает строку, содержащую информацию о времени выполнения операции
     * @param <T> - тип объектов коллекции
     */
    public static <T>String deleteAllElementsWithClear(Collection <T> collection){
        if (!collection.isEmpty()){
            long start=System.currentTimeMillis();
            collection.clear();
            long end=System.currentTimeMillis();
            long timeResult=end-start;
            return "Операция: удаление коллекции с помощью итератора. Заняла "+timeResult+" мс";
        } else {
            throw new IllegalArgumentException("Коллекция пуста");
        }
    }

    /**
     * Метод, выполняющий сортировку, итерирование и удаление коллекций для коллекции ArrayList
     * @param collection - коллекция для выполнения указанных операций
     * @param first - первый применяемый компаратор для передаваемого объекта в коллекции
     * @param second - второй применяемый компаратор для передаваемого объекта в коллекции
     * @return - возвращает строку, содержащую информацию о времени выполнения данных операций
     * @param <T> - тип объектов коллекции
     */
    public static <T> String manager (ArrayList<T> collection, Comparator <T> first, Comparator <T> second) {
        // Сортировка
        collection.sort(first);
        collection.sort(second);
        myVariantOfSort(collection,first);
        myVariantOfSort(collection,second);

        // Итерирование
        String resultIterationWithFor = makeIterationWithFor(collection);
        String resultIterationWithIterator = makeIterationWithIterator(collection);

        // Удаление
        //String resultDelete=deleteAllElementsWithIterator(collection);
        String resultDelete = deleteAllElementsWithClear(collection);
        StringBuilder result=new StringBuilder();
        result.append(resultIterationWithFor+"\n");
        result.append(resultIterationWithIterator+"\n");
        result.append(resultDelete+"\n");
        return result.toString();
    }

    /**
     * Метод, выполняющий сортировку, итерирование и удаление коллекций для коллекции LinkedList
     * @param collection - коллекция для выполнения указанных операций
     * @param first - первый применяемый компаратор для передаваемого объекта в коллекции
     * @param second - второй применяемый компаратор для передаваемого объекта в коллекции
     * @return - возвращает строку, содержащую информацию о времени выполнения данных операций
     * @param <T> - тип объектов коллекции
     */
    public static <T> String manager (LinkedList<T> collection, Comparator <T> first, Comparator <T> second) {
        // Сортировка
        collection.sort(first);
        collection.sort(second);
        myVariantOfSort(collection,first);
        myVariantOfSort(collection,second);

        // Итерирование
        String resultIterationWithFor = makeIterationWithFor(collection);
        String resultIterationWithIterator = makeIterationWithIterator(collection);

        // Удаление
        //String resultDelete=deleteAllElementsWithIterator(collection);
        String resultDelete = deleteAllElementsWithClear(collection);
        StringBuilder result=new StringBuilder();
        result.append(resultIterationWithFor+"\n");
        result.append(resultIterationWithIterator+"\n");
        result.append(resultDelete+"\n");
        return result.toString();
    }

    /**
     * Метод, выполняющий сортировку, итерирование и удаление коллекций для коллекции TreeSet
     * @param collection - коллекция для выполнения указанных операций
     * @param first - первый применяемый компаратор для передаваемого объекта в коллекции
     * @param second - второй применяемый компаратор для передаваемого объекта в коллекции
     * @return - возвращает строку, содержащую информацию о времени выполнения данных операций
     * @param <T> - тип объектов коллекции
     */
    public static <T> String manager (TreeSet<T> collection, Comparator <T> first, Comparator <T> second) {
        // Сортировка
        sortTreeSet(collection, first);
        sortTreeSet(collection, second);
        myVariantOfSort(collection,first);
        myVariantOfSort(collection,second);

        // Итерирование
        String resultIterationWithFor = makeIterationWithFor(collection);
        String resultIterationWithIterator = makeIterationWithIterator(collection);

        // Удаление
        String resultDelete=deleteAllElementsWithIterator(collection);
        StringBuilder result=new StringBuilder();
        result.append(resultIterationWithFor+"\n");
        result.append(resultIterationWithIterator+"\n");
        result.append(resultDelete+"\n");
        return result.toString();
    }

    /**
     * Метод, выполняющий сортировку, итерирование и удаление коллекций для коллекции HashSet
     * @param collection - коллекция для выполнения указанных операций
     * @param first - первый применяемый компаратор для передаваемого объекта в коллекции
     * @param second - второй применяемый компаратор для передаваемого объекта в коллекции
     * @return - возвращает строку, содержащую информацию о времени выполнения данных операций
     * @param <T> - тип объектов коллекции
     */
    public static <T> String manager (HashSet<T> collection, Comparator <T> first, Comparator <T> second) {
        // Сортировка
        sortHashSet(collection, first);
        sortHashSet(collection, second);
        myVariantOfSort(collection,first);
        myVariantOfSort(collection,second);

        // Итерирование
        String resultIterationWithFor = makeIterationWithFor(collection);
        String resultIterationWithIterator = makeIterationWithIterator(collection);

        // Удаление
        String resultDelete=deleteAllElementsWithIterator(collection);
        StringBuilder result=new StringBuilder();
        result.append(resultIterationWithFor+"\n");
        result.append(resultIterationWithIterator+"\n");
        result.append(resultDelete+"\n");
        return result.toString();
    }
}