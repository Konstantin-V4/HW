package HomeWorks;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int intSquare = 5;
        double doubleSquare = 1.5;
        long longSquare = 2000L;

        System.out.println(Methods.square(intSquare));
        System.out.println(Methods.square(doubleSquare));
        System.out.println(Methods.square(longSquare));

        String name = "Konstantin";
        String surname = "Vavilin";

        System.out.println(Methods.printFullName(name, surname));

        //String[] strings = {"One", "Two", "Three", "Four", "Five"};
        //String[] strings = {"One", "Two", "For", "Yes", "Box"}; // (Corner case String) Строки одинаковые
        //String[] strings = {"", "", "", "", ""}; // (Corner case String) Строки пустые
        String[] strings = {}; // (Corner case String) Пустой массив
        //int[] intNumbers = {1, 2, 3, 4, 5};
        //int[] intNumbers = {-1, -2, -3, -4, -5}; // (Corner case Int) Отрицательное значение
        //int[] intNumbers = {-1, -2, 3, -4, 5}; // (Corner case Int) Отрицательные и положительные значения
        //int[] intNumbers = {0, 0, 0, 0, 0}; // (Corner case Int) Одинаковые числа
        int[] intNumbers = {}; // (Corner case Int) Пустой массив
        //char[] charSymbol = {'A', 'b', 'C', 'd', 'E', 'f'};
        //char[] charSymbol = {'9', 'A'}; // (Corner case Char) Цифра с буквой
        //char[] charSymbol = {'A', 'A', 'A', 'A', 'A', 'A'}; // (Corner case Char) Одинаковые символы
        //char[] charSymbol = {'A'}; // (Corner case Char) Один символ
        char[] charSymbol = {}; // (Corner case Char) Пустой массив
        System.out.println(Arrays.toString(Methods.cornerValuesArray(strings)));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(intNumbers)));
        System.out.println(Arrays.toString(Methods.cornerValuesArray(charSymbol)));


        System.out.println(Methods.factorial(5));







    }

}
