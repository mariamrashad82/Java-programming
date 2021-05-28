package day18_condition_practice_string_intro;

public class ScoreRangeWithIf {
    public static void main(String[] args) {
        int score=110;
        if(score >=1 && score<= 40) {
            System.out.println("Grade : D");
        }else if(score >=40 && score<= 60){
            System.out.println("Grade : C");
        }else if(score >=60 && score<= 90){
            System.out.println("Grade : B");
        }else if(score >=90 && score<= 100) {
            System.out.println("Grade : A");
        }else if(score <=0 || score > 100) {
            System.out.println("Invalid score " + score);

        }
    }
}
