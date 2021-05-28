package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int minutes = 1; minutes <= 5; minutes++) {
            for (int second = 1; second <= 60; second++) {

                System.out.print( " minutes = " + minutes  +"second =" + second );
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int minutes = 0; minutes <=2; minutes++) {
            for (int seconds = 0; seconds <= 59; seconds++) {
                System.out.print(" (" +minutes + ":" + seconds + ") ");
            }
            System.out.println();
        }
    }
}