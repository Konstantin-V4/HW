package HomeWorks;

import java.util.Arrays;

public class HomeWork_27_28 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        fillArray(numbers);
        printArray(numbers);
        findSumLines(numbers);
        findSumColumns(numbers);

        int[] num = new int[]{4, 9, 5, 8, 1, 4, 2};
        System.out.println("Исходный массив: " + Arrays.toString(num));
        changeArray(num);
        System.out.println("После изменения исходного массива: " + Arrays.toString(num));
        changeCopyArray(num);
        System.out.println("После изменения копии: " + Arrays.toString(num));


    }

    /**
     * Заполняет числами по порядку, начиная с 1
     *
     * @param numbers Двумерный массив для заполнения
     */
    static void fillArray(int[][] numbers) {
        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = count;
                count++;
            }
        }
    }

    /**
     * Выводит массив на печать в консоль
     *
     * @param numbers Двумерный массив для печати
     */
    static void printArray(int[][] numbers) {
        for (int[] inboxNumbers : numbers) {
            for (int number : inboxNumbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Находит сумму элементов в каждой строке двумерного массива
     * и выводит её в консоль
     *
     * @param numbers Двумерный массив для подсчёта сумм
     * @return Массив с суммами элементов по строкам
     */
    static int[] sumLines(int[][] numbers) {
        int[] result = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                result[i] += numbers[i][j];
            }
        }
        return result;
    }

    static void findSumLines(int[][] numbers) {
        System.out.println("Сумма уэлемнтов по строкам");
        int[] sumLinesResult = sumLines(numbers);
        for (int i : sumLinesResult) {
            System.out.println("Сумма строки: " + i);
        }
        System.out.println();
    }

    /**
     * Находит сумму элементов в каждом столбце двумерного массива
     * и выводит её в консоль
     *
     * @param numbers Двумерный массив для подсчёта сумм столбцов
     * @return Массив с суммами элементов по столбцам
     */
    static int[] sumColumns(int[][] numbers) {
        int[] result = new int[numbers[0].length];

        for (int i = 0; i < numbers[0].length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                result[i] += numbers[j][i];
            }
        }
        return result;
    }

    static void findSumColumns(int[][] numbers) {
        System.out.println("Сумма элемнтов по столбцам");
        int[] sumColumnsResult = sumColumns(numbers);
        for (int i : sumColumnsResult) {
            System.out.println("Сумма столбца: " + i);
        }
        System.out.println();
    }

    /** Сортировка массива и вывод в консоль
     *
     * @param num Массив с сортированием значений
     */
    static void changeArray(int[] num) {
        Arrays.sort(num);
    }

    /** Заполнение массива одним значением, затем копирование массива с сортировкой
     *
     * @param num Массив заполнения и копирования
     */
    static void changeCopyArray(int[] num) {
        int[] numsCopy = Arrays.copyOf(num, num.length);

        Arrays.fill(numsCopy, -1);
        System.out.println(Arrays.toString(numsCopy));
    }

}
