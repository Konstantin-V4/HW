package HomeWorks;

//  0. Создайте новый класс Methods и все методы делайте в нём (методы должны быть статическими),
//  а вызывать их надо из метода main, как обычно (как мы делали с Calculator на занятии).
//  Т.е. нужно каждый метод вызвать с разными параметрами, чтобы проверить их работу

public class Methods {

//  1. Создайте метод square, который принимает одно целое число и возвращает его квадрат,
//  затем вызовите его с разными значениями и выведите результат

    static int square(int intSquare) {
        return intSquare * intSquare;
    }

    static double square(double doubleSquare) {
        return doubleSquare * doubleSquare;
    }

    static long square(long longSquare) {
        return longSquare * longSquare;
    }

//  2. Создайте метод printFullName, который принимает два параметра типа String — имя и фамилию —
//  и выводит полное имя в формате: "Full name: Имя Фамилия"

    static String printFullName(String name, String surname) {
        String fullName = "Full name: " + name + " " + surname;
        return fullName;
    }

//  3. Создайте метод cornerValuesArray, который принимает массив строк,
//  а возвращает массив строк из двух элементов – самая короткая и самая длинная строка в исходном массиве

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
        return new String[] {min, max};
    }



}
