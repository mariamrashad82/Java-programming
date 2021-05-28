package Practice03_16_2021;

import java.util.Scanner;

public class BakingContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int judge = 1;
        System.out.println("judge = " + judge++ + "score") ;
        int scoreOne = input.nextInt();
        System.out.println("judge = " + judge++ + "score") ;
        int scoreTwo = input.nextInt();
        System.out.println("judge = " + judge++ + "score") ;
        int scoreThree = input.nextInt();
        System.out.println("Enter other person 1's score") ;
        int OtherPerson1 = input.nextInt();
        System.out.println("Enter other person 2's score") ;
        int OtherPerson2 = input.nextInt();
        int OurAverageScore = (scoreOne + scoreTwo + scoreThree)/ 3 ;
        if(OurAverageScore > OtherPerson1 && OurAverageScore > OtherPerson2){
            System.out.println(" First place");

        }else if ((OurAverageScore < OtherPerson1 && OurAverageScore < OtherPerson2) || (OurAverageScore < OtherPerson1 && OurAverageScore < OtherPerson2)){
            System.out.println(" Second place");
        }else{
            System.out.println(" Third Place");
        }
    }
}
