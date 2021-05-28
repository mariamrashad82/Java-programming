package mariam_practice;

public class OddNumber24 {
    public static void main(String[] args) {
   //• Write a program that can print all the ODD numbers between 0 ~ 100
        //that can be divisible by 3 & 5
        //• Write a program that can print all the EVEN numbers between 0 ~
        //100 that can be divisible by 3 & 5

        int oddNumber = 1;
        int count = 1;

        while(oddNumber < 101){
            if(oddNumber % 3 == 0 && oddNumber % 5 ==0 && oddNumber % 2 !=0){
                count += oddNumber ;

            }
            oddNumber++;

        }
        System.out.println("Sum of odd number :" +count);




    }
}
