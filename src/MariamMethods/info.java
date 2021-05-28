package MariamMethods;

import java.util.Random;

public class info {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(IsMarred());
        System.out.println(age());
        System.out.println(getRandomYear());

    }
    public static String fullName(){
        return "Mariam";
    }
    public static boolean IsMarred(){
        return true;
    }
    public static int age(){
        return 39;

    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }




}
