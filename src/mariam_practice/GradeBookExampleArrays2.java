package mariam_practice;

import java.util.Arrays;

public class GradeBookExampleArrays2 {
    public static void main(String[] args) {
        String[] Names = {"Mike", "joe", "Ana", "Ali", "Jonna"};
        int [] Score = {80, 54, 100, 66, 94};
        char [] Grades = {'B', 'D', 'A', 'C', 'A'};
        System.out.print(Arrays.toString(Names)+ "\n");
        System.out.print(Arrays.toString(Score) + "\n");
        System.out.print(Arrays.toString(Grades) + "\n");

        System.out.println("------ Print a report of each Student ------");
        for (int i = 0; i < Names.length; i++) {
            System.out.println( Names[i] + " | " + Score[i] + " | " + Grades[i] );
        }

    }
}
