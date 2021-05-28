package mariam_practice;

import java.util.Scanner;

public class passWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ENTER YOUR password");
        double password= scan.nextInt();

        if (password == 8640) {
            System.out.println("Menu : \n1- Withdraw \n2- Deposit \n3- Check Balance \n4-Other");
        }else{
            System.out.println("Wrong password.Please try again!");
        }

    }
}




