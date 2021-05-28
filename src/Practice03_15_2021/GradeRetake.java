package Practice03_15_2021;

public class GradeRetake {
    public static void main(String[] args) {
        int baseGrade = 90;
        int numOfAttempts = 1;
        int retakePenalty = 0;
        if (numOfAttempts == 1) {
            retakePenalty = (int) (baseGrade * 0.10);
        }
        if (numOfAttempts == 2) {
            retakePenalty = (int) (baseGrade * 0.20);
        }
        if (numOfAttempts == 3) {
            retakePenalty = (int) (baseGrade * 0.35);
        }
        System.out.println("Grade after retake attempt " + numOfAttempts + " Was: " + (baseGrade - retakePenalty ));
    }
}