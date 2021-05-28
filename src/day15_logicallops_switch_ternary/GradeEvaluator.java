package day15_logicallops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("You Passed With grade " + grade);
        } else if (grade == 'D'){
            System.out.println("You Qualify for Retake " + grade);
        } else if(grade == 'E'){
            System.out.println("fail.Grade _ " + grade);

        }else{
            System.out.println("INVALID GRADE");
        }
    }
}