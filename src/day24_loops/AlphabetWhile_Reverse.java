package day24_loops;

public class AlphabetWhile_Reverse {
    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z') {
            // System.out.println("letter = " + letter++);
            System.out.println("letter ( " + letter++ + " )");
        }
        System.out.println();
            char letter2 = 'Z';
            while (letter2 >= 'A') {
                // System.out.println("letter = " + letter++);
                System.out.print("(" + letter2-- + ")");

            }
        }
    }
