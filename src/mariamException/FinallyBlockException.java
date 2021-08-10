package mariamException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {


            System.out.println("Enter number");
            int num = scan.nextInt();
            System.out.println(num / 0);
            System.exit(0);

        }catch (InputMismatchException e){
            System.out.println("invalid ");
        }finally {
            scan.close();// close and clean up scanner
            System.out.println("finally block always run");
            {

            }
        }
    }
}