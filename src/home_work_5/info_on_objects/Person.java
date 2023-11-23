package home_work_5.info_on_objects;

import home_work_5.comparators.PersonComparatorByPasswordAndNicks;

public class Person implements Comparable<Person> {
    private String nick; // Псевдоним пользователя
    private String password; // Пароль (от 5 до 10 символов)
    private String name; // Имя пользователя

    public Person() { // Конструктор без параметра с дефолтными значениями
        this.nick="Псевдоним";
        this.password="Пароль";
        this.name="Имя";
    }
    public Person(String nick, String password, String name) { // Конструктор класса с указанными параметрами
        this.nick=nick;
        this.password=password;
        this.name=name;
    }

    /**
     * Метод - сеттер псевдонима пользователя
     * @param nick - псевдоним пользователя
     */
    public void setNick (String nick) { // Сеттер для псевдонима
        this.nick=nick;
    }

    /**
     * Метод - сеттер пароля пользователя
     * @param password - пароль пользователя
     */
    public void setPassword (String password) { // Сеттер для пароля
        this.password=password;
    }

    /**
     * Метод - сеттер имени пользователя
     * @param name - имя пользователя
     */
    public void setName (String name) { // Сеттер для имени
        this.name=name;
    }

    /**
     * Метод - геттер псевдонима пользователя
     * @return nick - возвращает псевдоним пользователя
     */
    public String getNick() { // Геттер для псевдонима
        return nick;
    }

    /**
     * Метод - геттер пароля пользователя
     * @return password - возвращает пароль пользователя
     */
    public String getPassword() { // Геттер для пароля
        return password;
    }

    /**
     * Метод - геттер имени пользователя
     * @return name - возвращает имя пользователя
     */
    public String getName() { // Геттер для имени
        return name;
    }

    /**
     * Переопределенный метод toString для вывода информации о пользователе
     * @return result - строка, содержащая информацию о пользователе
     */
    @Override
    public String toString (){
        StringBuilder result = new StringBuilder();
        result.append("name: ");
        result.append("\"");
        result.append(getName());
        result.append("\"");
        result.append(", ");
        result.append("nick: ");
        result.append("\"");
        result.append(getNick());
        result.append("\"");
        result.append(", ");
        result.append("password: ");
        result.append(getPassword());

        return result.toString();
    }

    /**
     * Реализация метода compareTo с помощью компаратора PersonComparatorByPasswordAndNicks
     * @param person2 - объект для сравнения
     * @return 0, если объект, вызывающий метод, равен person2
     *        -1, если объект, вызывающий метод, меньше person2
     *         1, если объект, вызывающий метод, больше person2
     */
    @Override
    public int compareTo(Person person2) {
        PersonComparatorByPasswordAndNicks myComparator=new PersonComparatorByPasswordAndNicks();
        return myComparator.compare(this,person2);
    }
}
