package day33_arrays;
import java.util.*;
public class MultiDArrayExample6 {
    public static void main(String[] args) {
        String[][]users= new String[3][2];
        users[0][0]= "Mariam Rashad";
        users[0][1]= "Mariam@2021";
        users[1][0]= "Nancy Atef";
        users[1][1]= "Nancy@5676";
        users[2][0]= "Aghaby Elkomos";
        users[2][1]= "Aghaby@5690";

        String[][] userData = {{"Mariam Rashad","Mariam@2021" } ,
                {"Nancy Atef","Nancy@5676"},
                {"Aghaby Elkomos","Aghaby@5690"}};
        System.out.println("userData 1  = " + userData[0][0]);
        System.out.println("userData 2  = " + userData[1][0]);
        System.out.println("userData 3  = " + userData[2][0]);

        System.out.println("userData Password 1   = " + userData[0][1]);
        System.out.println("userData Password 2  = " + userData[1][1]);
        System.out.println("userData Password 3  = " + userData[2][1]);

        System.out.println("\n ************************** \n");
        System.out.println(Arrays.deepToString(userData));

    }
}
