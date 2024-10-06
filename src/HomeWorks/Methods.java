package HomeWorks;

//  0. Создайте новый класс Methods и все методы делайте в нём (методы должны быть статическими),
//  а вызывать их надо из метода main, как обычно (как мы делали с Calculator на занятии).
//  Т.е. нужно каждый метод вызвать с разными параметрами, чтобы проверить их работу

public class Methods {

//  1. Создайте метод square, который принимает одно целое число и возвращает его квадрат,
//  затем вызовите его с разными значениями и выведите результат

    /** Выводит число в квадрат
     *
     * @param intSquare int с переменными для возведения в квадрат
     * @return сумма параметра int
     */
    static int square(int intSquare) {
        return intSquare * intSquare;
    }

    /** Выводит число в квадрат
     *
     * @param doubleSquare double с переменными для возведения в квадрат
     * @return сумма параметра double
     */
    static double square(double doubleSquare) {
        return doubleSquare * doubleSquare;
    }

    /** Выводит число в квадрат
     *
     * @param longSquare long с переменными для возведения в квадрат
     * @return сумма параметра long
     */
    static long square(long longSquare) {
        return longSquare * longSquare;
    }

//  2. Создайте метод printFullName, который принимает два параметра типа String — имя и фамилию —
//  и выводит полное имя в формате: "Full name: Имя Фамилия"

    /** Принимает два параметра типа String
     *
     * @param name name
     * @param surname String с переменными для вывода имени и фамилии
     * @return Строка и сумма параметров String
     */
    static String printFullName(String name, String surname) {
        String fullName;
        fullName = "Full name: " + name + " " + surname;
        return fullName;
    }

//  3. Создайте метод cornerValuesArray, который принимает массив строк,
//  а возвращает массив строк из двух элементов – самая короткая и самая длинная строка в исходном массиве

    /** Принимает массив строк, сравнивает и выявляет самую длинную и самую короткую строку
     *
     * @param strings Массив типа String с переменной
     * @return Возвращает переменную типа String - самую короткую и самую длинную строку
     */
    static String[] cornerValuesArray(String[] strings) {
        String min = strings[0];
        String max = strings[0];

        for (String string : strings) {
            if (string.length() < min.length()) {
                min = string;
            } else if (string.length() > max.length()) {
                max = string;
            }
        }
        return new String[]{min, max};
    }

//  0.	Продолжаем писать код в прошлом ДЗ (не в новых файлах, а дополняем уже написанный код). Требования по вызову методов, названиям и форматированию те же
//  1.	Пункт 3 из прошлого ДЗ дополнить перегруженными методами (там принимался массив строк, а возвращался массив с самой короткой и самой длинной строкой)
//  – теперь надо добавить еще два метода с таким же названием, но другими параметрами - не массив строк,
//  а массив int и массив char (и находить, соответственно, минимальное и максимальное число int, самый маленький и самый большой символ –
//  (помним что у каждого символа есть код в юникоде, поэтому их можно сравнивать)
//  2.	В этих методах заменить параметры – вместо массивов строк, интов и даблов применить varargs (String… strings и т.д.)
//  3.	Для всех методов из этой и предыдущей домашки написать Javadocs с описанием работы метода, описанием параметра и возвращаемого результата

    /** Сравнивает и выявляет минимальное и максимальное число
     *
     * @param intNumbers varargs с переменной типа int
     * @return Возвращает две переменные типа int - самое маленькое и самое большое число
     */
    static int[] cornerValuesArray(int... intNumbers) {
        int min = intNumbers[0];
        int max = intNumbers[0];

        for (int number : intNumbers) {
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        return new int[]{min, max};

    }

    /** Сравнивает и выявляет самый большой и самый маленький символ
     *
     * @param charSymbol varargs с переменной типа char
     * @return Возвращает две переменные типа char - самый большой и самый маленький символ
     */
    static char[] cornerValuesArray(char... charSymbol) {
        char min = charSymbol[0];
        char max = charSymbol[0];

        for (char symbol : charSymbol) {
            if (symbol < min) {
                min = symbol;
            } else if (symbol > max) {
                max = symbol;
            }

        }
        return new char[]{min, max};
    }
}
