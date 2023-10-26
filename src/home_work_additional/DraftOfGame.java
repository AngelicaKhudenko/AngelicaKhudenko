package home_work_additional;
import java.util.Scanner;

public class DraftOfGame {
    public static void main (String []args) {
        Scanner reader=new Scanner(System.in);

        String check="";
        boolean checkInfo=true; // Создание переменной для записи результатов проверки на корректность ввода данных

        do { // Выбор режима игры
            System.out.println("Выберите режим игры: 1-ручной, 2-автоматический");
            check=reader.nextLine();
            checkInfo=checkIfTheNumberIsRight(check,'1','2');
            if (!checkInfo) {
                System.out.println("Введено некорректное значение");
            }
        } while (!checkInfo);

        byte regime=Byte.parseByte(check); // Запись в переменную режима игры

        do { // Выбора размера игры
            System.out.println("Выберите размер игры от 3 до 8");
            check=reader.nextLine();
            checkInfo=checkIfTheNumberIsRight(check,'3','8');
            if (!checkInfo) {
                System.out.println("Введено некорректное значение");
            }
        } while (!checkInfo);

        byte size=Byte.parseByte(check); // Запись в переменную размера игры

        int [][]gameField=new int[size][3]; // Создание двумерного массива, хранящего игровое поле
        for (int i=0; i<size; i++) { // Запись начальных значений в массив
            for (int z=0; z<3; z++) {
                if (z==0) {
                    gameField[i][z]=i+1; // Запись цифр в левый ряд
                } else {
                    gameField[i][z]=0; // Запись нуля во второй и третий ряды
                }
            }
        }

        String [][]gameFieldConsole=new String[size][3]; // Создание массива строк для вывода игры в консоль
        for (int i=1; i<=size; i++) { // Запись начальных значений в массив. Вывод массива в консоль
            for (int z=1; z<=3; z++) {
                if (z==1) {
                    gameFieldConsole[i-1][z-1]=""+i; // Запись цифр в левый ряд
                    System.out.print(gameFieldConsole[i-1][z-1]);
                } else {
                    gameFieldConsole[i-1][z-1]="*"; // Запись * во второй и третий ряды
                    System.out.print(gameFieldConsole[i-1][z-1]);
                }
            }
            System.out.println();
        }

        int middle=0; // Создание переменной для метода трех стаканов в массиве чисел игрового поля
        String middleS=""; // Создание переменной для метода трех стаканов в массиве строк игрового поля

        int compareFrom=size-1; // Переменная для поиска верхнего кольца в столбике, с которого будет перемещение
        int compareTo=size-1; // Переменная для поиска верхнего кольца в столбике, на который будет перемещение
        int counter=0; // Переменная-счетчик для количества ходов

        System.out.println("______________________________");
        System.out.println("Старт"); // Начало игры
        while(gameField[0][2]!=1) {
            // Выбор столбиков
            do { // Выбор пользователем столбика, с которого будет перемещение
                System.out.println("Введите столбик, кольцо с которого вы хотите переместить");
                check=reader.nextLine();
                checkInfo=checkIfTheNumberIsRight(check,'1','3'); // Проверка на корректность ввода
                if (!checkInfo) {
                    System.out.println("Введено некорректное значение");
                }
            } while (!checkInfo);
            int from=Integer.parseInt(check)-1; // Запись в переменную столбика, с которого будет перемещение

            do { // Выбор пользователем столбика, на который будет перемещение
                System.out.println("Введите столбик, на который вы хотите переместить кольцо");
                check=reader.nextLine();
                checkInfo=checkIfTheNumberIsRight(check,'1','3'); // Проверка на корректность ввода
                if (!checkInfo) {
                    System.out.println("Введено некорректное значение");
                }
            } while (!checkInfo);
            int to=Integer.parseInt(check)-1; // Запись в переменную столбика, на который будет перемещение

            // Выбор строк
            for (int i=0; i<size; i++) { // Поиск строки, где находится верхнее кольцо
                if (gameField[i][from]!=0) {
                    compareFrom=i;
                    break;
                }
            }

            for (int i=0; i<size; i++) { // Поиск строки, где находится верхнее кольцо
                if (gameField[i][to]!=0) {
                    compareTo=i;
                    break;
                }
            }

            // Замена элементов в памяти игры
            if(gameField[compareFrom][from]<gameField[compareTo][to]&&(compareTo-1)>=0) {
                middle=gameField[compareFrom][from];
                middleS=gameFieldConsole[compareFrom][from];

                gameField[compareFrom][from]=gameField[compareTo-1][to];
                gameFieldConsole[compareFrom][from]=gameFieldConsole[compareTo-1][to];

                gameField[compareTo-1][to]=middle;
                gameFieldConsole[compareTo-1][to]=middleS;

                counter++; // Увеличение счетчика игры
            } else if (gameField[compareTo][to]==0) {
                middle=gameField[compareFrom][from];
                middleS=gameFieldConsole[compareFrom][from];

                gameField[compareFrom][from]=gameField[compareTo][to];
                gameFieldConsole[compareFrom][from]=gameFieldConsole[compareTo][to];

                gameField[compareTo][to]=middle;
                gameFieldConsole[compareTo][to]=middleS;
                counter++;
            } else { // Увеличение счетчика игры
                System.out.println("К сожалению данный ход не возможен правилами игры, выберите другой ход");
                continue;
            }

            // Вывод обновленного поля в консоль
            for (int i=0; i<size; i++) {
                for (int z=0; z<3; z++) {
                    System.out.print(gameFieldConsole[i][z]);
                }
                System.out.println();
            }
        }

        System.out.println("______________________________");
        System.out.println("Победа! Общее количество ходов составило: "+counter); // Информация о победе, количество общих ходов
    }

    /**
     * Проверяет число, переданное в строке, на корректность введенных данных (целое число, соответствующее диапазону, переданному через параметры метода)
     * @param check - строка для проверки
     * @param left - левая граница диапазона
     * @param right - правая граница диапазона
     * @return checkResult - возвращает true, если число соответствует заданным условиям
     * 					   - возвращает false, если число не соответствует заданным условиям
     */
    public static boolean checkIfTheNumberIsRight(String check,char left,char right) {
        boolean checkResult=true;
        int problems = 0; // Создание переменной для подсчета нестандартных символов в строке
        for (int i = 0; i < check.length(); i++) {
            if (check.charAt(i) > right||check.charAt(i)<left||check.length()>1) {
                problems++;
            }
        }

        if (problems!=0) {
            checkResult=false;
        }

        return checkResult;
    }
}

