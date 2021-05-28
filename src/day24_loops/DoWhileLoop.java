package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.print("counter = " + (counter+=10) + " , ");
        }while (counter <= 100);
        System.out.println("\n");

        int counte = 10;
        do {
            System.out.print("counte = " + counte-- + " , ");
        }while (counte >= 1);





    }
}
