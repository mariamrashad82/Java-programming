package Practice04_13_2021;
import java.util.*;
public class GradeBookArrays {
    public static void main(String[] args) {
        String[] names = {"Aghaby", "Nancy","Roma"};
        int[]scores = {90,95,99};
        char[]grades = new char[names.length];
        for(int i=0; i < scores.length; i++){
            int eachScore = scores[i];

            if(eachScore >= 85) {
                grades[i] = 'A';
            } else if(eachScore >= 75){
                grades[i] = 'B';
            } else if(eachScore >= 65){
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }

        System.out.println("GRADEBOOK");

        for(int i=0; i < names.length; i++) {
            System.out.println(names[i] + " | " + scores[i] + " | " + grades[i]);
        }

    }
}
