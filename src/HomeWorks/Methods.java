package HomeWorks;


public class Methods {


    /**
     * Выводит число в квадрат
     *
     * @param intSquare int с переменными для возведения в квадрат
     * @return сумма параметра int
     */
    static int square(int intSquare) {
        return intSquare * intSquare;
    }

    /**
     * Выводит число в квадрат
     *
     * @param doubleSquare double с переменными для возведения в квадрат
     * @return сумма параметра double
     */
    static double square(double doubleSquare) {
        return doubleSquare * doubleSquare;
    }

    /**
     * Выводит число в квадрат
     *
     * @param longSquare long с переменными для возведения в квадрат
     * @return сумма параметра long
     */
    static long square(long longSquare) {
        return longSquare * longSquare;
    }


    /**
     * Принимает два параметра типа String
     *
     * @param name    name
     * @param surname String с переменными для вывода имени и фамилии
     * @return Строка и сумма параметров String
     */
    static String printFullName(String name, String surname) {
        String fullName;
        fullName = "Full name: " + name + " " + surname;
        return fullName;
    }

//  0. В методах из прошлого ДЗ, где надо было находить минимальные и максимальные значения (строк, интов и чаров),
//  ввести проверку массива на пустоту, а также добавить несколько вызовов этих методов с разными параметрами,
//  чтобы проверить корнер-кейсы (т.е. проверить функциональность методов для разных данных, в т.ч. с пустым массивом)

    /**
     * Принимает массив строк, сравнивает и выявляет самую длинную и самую короткую строку
     *
     * @param strings Массив типа String с переменной
     * @return Возвращает переменную типа String - самую короткую и самую длинную строку
     */
    static String[] cornerValuesArray(String[] strings) {
        if (strings.length == 0) {
            return new String[0];
        }

        String[] stringNumbersArray = new String[]{strings[0], strings[0]};

        for (String stringNumber : strings) {
            if (stringNumber.length() < stringNumbersArray[0].length()) {
                stringNumbersArray[0] = stringNumber;
            } else if (stringNumber.length() > stringNumbersArray[1].length()) {
                stringNumbersArray[1] = stringNumber;
            }
        }
        return stringNumbersArray;
    }


    /**
     * Сравнивает и выявляет минимальное и максимальное число
     *
     * @param intNumbers varargs с переменной типа int
     * @return Возвращает две переменные типа int - самое маленькое и самое большое число
     */
    static int[] cornerValuesArray(int... intNumbers) {
        if (intNumbers.length == 0) {
            return new int[0];
        }

        int[] intNumbersArray = new int[]{intNumbers[0], intNumbers[0]};

        for (int number : intNumbers) {
            if (number < intNumbersArray[0]) {
                intNumbersArray[0] = number;
            } else if (number > intNumbersArray[1]) {
                intNumbersArray[1] = number;
            }
        }
        return intNumbersArray;

    }

    /**
     * Сравнивает и выявляет самый большой и самый маленький символ
     *
     * @param charSymbol varargs с переменной типа char
     * @return Возвращает две переменные типа char - самый большой и самый маленький символ
     */
    static char[] cornerValuesArray(char... charSymbol) {
        if (charSymbol.length == 0) {
            return new char[0];
        }

        char[] charSymbolArray = new char[]{charSymbol[0], charSymbol[0]};

        for (char symbol : charSymbol) {
            if (symbol < charSymbolArray[0]) {
                charSymbolArray[0] = symbol;
            } else if (symbol > charSymbolArray[1]) {
                charSymbolArray[1] = symbol;
            }

        }
        return charSymbolArray;
    }

//    1. Написать в том же классе новый метод - нахождение факториала с помощью рекурсивного вызова метода,
//    не забыв про базовый случай в рекурсии
//    (+ дополнительно для себя поэкспериментировать - сымитировать переполнение стека в том случае,
//    если базовый случай не определен или определен неверно)

    static int factorial(int number) {
        // Базовый случай
        if (number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
