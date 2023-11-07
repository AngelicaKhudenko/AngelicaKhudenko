package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> { // Создание класса с дженериком
    private T[]data; // Создание поля для получения массива
    public DataContainer(T[]data) { // Конструктор для получения массива с выбранным типом данных
        this.data=data;
    }

    /**
     * Метод, который добавляет данные во внутреннее поле data и возвращает номер позиции, в которую были вставлены данные, начиная с 0
     * @param item - данные для добавления
     * @return - возвращает номер позиции в которую были вставлены данные, начиная с 0
     */
    public int add(T item) {
        if (item == null) { // Проверка элемента на "пустоту"
            return -1;
        }

        for (int i=0; i<data.length; i++) { // Цикл для проверки массива на наличие свободных мест
            if (data[i] == null) {
                data[i] = item; // Добавление данных во внутреннее поле data
                return i; // Возврат номера позиции, в которую были вставлены данные
            }
        }

        int length= data.length; // Длина старого массива
        data=Arrays.copyOf(data,length+1); // "Расширение" нового массива в том случае, если нет места в массиве
        data[length]=item; // Запись элемента в новый массив
        return length; // Возврат номера позиции, в которую были добавлены данные
    }

    /**
     * Метод,который получает из DataContainer, из поля data, предварительно сохранённый объект который мы передали на предыдущем шаге через метод add
     * @param index - индекс элемента, который нужно возвратить
     * @return - объект массива, соответствующий заданному индексу
     */
    public T get(int index) {
        if (index<0||index>=data.length) { // Проверка на корректность введенного индекса (индекс не может быть отрицательным, а также индекс не может быть равен длине массива и превышать ее)
            return null;
        }
        return data[index];
    }

    /**
     * Метод, который возвращает массив из поля data
     * @return - массив из поля data
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод,который удаляет элемент из поля data по индексу
     * @param index - индекс элемента, который нужно удалить
     * @return - возвращает true, если удаление прошло успешно
     *         - возвращает false, если удаление не прошло успешно
     */
    public boolean delete(int index) {
        if (index<0||index>=data.length) { // Проверка на ввод корректного значения индекса
            return false;
        }

        if (index==0&&data.length==1) { // Проверка на удаление единственного элемента в массиве длиной 1
            T[] smallerData = (T[]) new Object[0]; // Создание пустого массива
            data=smallerData; // Перезапись ссылки на новый уменьшенный массив
            return true;
        }

        if (index==0) {
            T[] smallerData = (T[]) new Object[data.length - 1]; // Создание временного массива с уменьшенным количеством элементов
            for (int i=1; i<data.length; i++) {
                smallerData[i-1]=data[i];
            }
            data=smallerData; // Перезапись ссылки на новый уменьшенный массив
            return true;
        }

        T[] smallerData = (T[]) new Object[data.length - 1]; // Создание временного массива с уменьшенным количеством элементов
        for (int i=0; i<index; i++) {
            smallerData[i]=data[i];
        }
        for (int i=index+1; i<data.length; i++) {
            smallerData[i-1]=data[i];
        }

        data=smallerData; // Перезапись ссылки на новый уменьшенный массив
        return true;
    }

    /**
     * Метод, который удаляет заданный элемент из поля data (первый встречающийся слева направо)
     * @param item - элемент, который нужно удалить
     * @return - возвращает true, если удаление прошло успешно
     *         - возвращает false, если удаление не прошло успешно
     */
    public boolean delete(T item) {
        if (item==null) {
            return false;
        }

        for (int i=0; i<data.length; i++) {
            if (item.equals(data[i])) {
                return delete(i);
            }
        }
        return false;
    }

    /**
     * Метод, который занимается сортировкой данных, записанных в поле data, используя реализацию сравнения из переданного объекта comparator
     * @param comparator - механизм сортировки в зависимости от типа данных поля (Integer,Double,String,Object)
     */
    public void sort(Comparator<T> comparator) {
        int length=data.length;
        T temporary;
        for (int i=0; i<length-1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (comparator.compare(data[j - 1],data[j])>0) {
                    temporary=data[j-1];
                    data[j-1]=data[j];
                    data[j]=temporary;
                }
            }
        }
    }

    /**
     * Переопределенный метод toString, который позволяет выводить содержимое data без ячеек, в которых хранится null
     * @return result - массив data, преобразованный в строку
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        boolean needComma = false;

        builder.append("[");

        for(int i=0; i<data.length; i++) {
            if (this.data[i]!=null){
                if (needComma){
                    builder.append(", ");
                } else {
                    needComma = true;
                }
                builder.append(this.data[i]);
            }
        }

        builder.append("]");
        return builder.toString();
    }
}

