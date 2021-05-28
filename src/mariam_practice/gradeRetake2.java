package mariam_practice;

import java.util.Scanner;

public class gradeRetake2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ENTER YOUR ATTEMPT");
        double attempt =  scan.nextInt();
        double score = 100;
        if (attempt == 1) {
        System.out.println("your grade is:" + (score - (score * 10 / 100)));
        }else if(attempt == 2) {
         System.out.println("your grade is:" + (score - (score * 20 / 100)));
        }else if (attempt == 3){
        System.out.println("your grade is:" + (score - (score * 35/100)));
        }else{
         System.out.println("please try again");
                }
            }
        }
