package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println(fullName());
       // System.out.println("Name is = " + name);
        System.out.println("Name is : " + fullName());
        System.out.println(" Is Marred : " + IsMarred());
        System.out.println("Age is : " + getAge());
        System.out.println("Birth Year : " + getRandomYear());

        String name = fullName();
        boolean marred = IsMarred();
        int age = getAge();
        int randomYear = getRandomYear();

        System.out.println("Name is : " + name);
        System.out.println(" Is Marred : " + marred);
        System.out.println("Age is : " + age);
        System.out.println("Birth Year : " + randomYear);
        if(marred){
            System.out.println("is marred");
        }else{
            System.out.println("Single");
        }




    }

    public static String fullName() {
        // fullName();
        // System.out.println(fullName());
        return "Mike Smith";
    }

    public static boolean IsMarred() {
        return false;

    }

    public static int getAge() {
        return 39;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}