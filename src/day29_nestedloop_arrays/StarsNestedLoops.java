package day29_nestedloop_arrays;

public class StarsNestedLoops {
    public static void main(String[] args) {
        for (int stars = 1; stars <= 5; stars++) {

            for (int Star2 = 1; Star2 <= 10; Star2++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        for (int stars = 1; stars <= 5; stars++) {

            for (int Star2 = 1; Star2 <= stars; Star2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int stars = 1; stars <= 5; stars++) {

            for (int Star2 = 5; Star2 >= stars; Star2--) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}