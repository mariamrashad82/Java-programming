package day36_methods_with_return;

public class CreditScore_1 {
    public static void main(String[] args) {
        CheckEligible(750);
        CheckEligible(800);
        CheckEligible(600);
        System.out.println(getCreditScore());
        System.out.println(  "Credit score : " + getCreditScore());
        int score = getCreditScore();
        System.out.println("Score = " + score);



    }

    public static void CheckEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("Eligible to buy new car");
        } else {
            System.out.println("sorry, you are not Eligible for leasing this car");
        }
    }
        public static int getCreditScore() {
            return 800;

        }

    }







