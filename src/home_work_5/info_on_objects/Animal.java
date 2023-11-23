package home_work_5.info_on_objects;

import home_work_5.comparators.AnimalComparatorByAgeAndNicks;

public class Animal implements Comparable <Animal>{
    private int age; // Возраст (от 1 до 15 лет)
    private String nick; // Кличка

    public Animal() { // Конструктор без параметра с дефолтными значениями
        this.age=1;
        this.nick="Кличка";
    }
    public Animal (int age, String nick) { // Конструктор класса
        this.age=age;
        this.nick=nick;
    }

    /**
     * Метод - сеттер возраста животного
     * @param age - возраст животного
     */
    public void setAge (int age) { // Сеттер для возраста животного
        this.age=age;
    }

    /**
     * Метод - сеттер клички животного
     * @param nick - кличка животного
     */
    public void setNick (String nick) { // Сеттер для клички животного
        this.nick=nick;
    }

    /**
     * Метод - геттер возраста животного
     * @return age - возвращает возраст животного
     */
    public int getAge () { // Геттер для возраста животного
        return age;
    }

    /**
     * Метод - геттер клички животного
     * @return nick - возвращает кличку животного
     */
    public String getNick () { // Геттер для клички животного
        return nick;
    }

    /**
     * Переопределенный метод toString для вывода информацию о животном
     * @return result - строка, содержащая информацию о животном
     */
    public String toString (){
        StringBuilder result = new StringBuilder();
        result.append("age: ");
        result.append("\"");
        result.append(getAge());
        result.append("\"");
        result.append(", ");
        result.append("nick: ");
        result.append("\"");
        result.append(getNick());
        result.append("\"");

        return result.toString();
    }

    /**
     * Реализация метода compareTo с помощью компаратора AnimalComparatorByAgeAndNicks
     * @param animal2 - объект для сравнения
     * @return 0, если объект, вызывающий метод, равен animal2
     *         -1, если объект, вызывающий метод, меньше animal2
     *         1, если объект, вызывающий метод, больше animal2
     */
    @Override
    public int compareTo(Animal animal2) {
        AnimalComparatorByAgeAndNicks myComparator=new AnimalComparatorByAgeAndNicks();
        return myComparator.compare(this,animal2);
    }
}
