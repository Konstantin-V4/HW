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

        String[] strings = {"One", "Two", "Three", "Four", "Five"};
        System.out.println(Arrays.toString(Methods.cornerValuesArray(strings)));


    }
}
