package mariam_practice;

import java.util.Locale;

public class BookValueLoop {
    public static void main(String[] args) {
        String []woodenSpoonBook = {"ch1 : Intro java ", "ch2 : Variable", "ch3 : Scanner", "ch4 : Operator ", "ch5 : Switch", "ch6: Ternary"};
        int value = 0;
        int chPrice = 10;
        for (int i = 0; i < woodenSpoonBook.length; i++) {
            int chaptersCount = 0;
            chaptersCount = woodenSpoonBook.length;
            value = chaptersCount * chPrice;
            chaptersCount++;
        }
        System.out.println("wooden Spoon Book value = $" + value);
    }
}


