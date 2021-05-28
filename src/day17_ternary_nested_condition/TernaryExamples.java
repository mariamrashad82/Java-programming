package day17_ternary_nested_condition;

public class TernaryExamples {
    public static void main(String[] args) {
        // String result = (score>60) ?" pass ": " fail ";
        int score1 = 75;
        String result1;
        if(score1>60){
            result1= "pass";
        }else{
            result1 = "fail";
        }
        System.out.println("result1 = " + result1);
       
        //int X = ( quality .equals ( " good ") )? 100 : 0 ;
        //char grade = ( score > 90 )? 'A' : 'B';
        //String evenOdd = ( score %2==0) ? " even ":" odd ";
        
        // with ternary
        int score = 88;
        String result = (score<60)? "pass" : "fail";
        System.out.println("result = " + result);
        
        //int X = ( quality .equals ( " good ") )? 100 : 0 ;
        String quality = "good";
        System.out.println( quality .equals ( "good") ? 100 : 0 );
        int rating = quality .equals ( "good") ? 100 : 0 ;
        System.out.println("rating = " + rating);

        // if(score > 90){
        //  grade = 'A';
        //}else{
        //   grade = 'B';
        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

        }
    }

