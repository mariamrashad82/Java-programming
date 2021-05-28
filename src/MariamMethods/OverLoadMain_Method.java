package MariamMethods;

import java.util.Arrays;

public class OverLoadMain_Method {
    public static void main(String[] args) {
        System.out.println("Hello from main methods");
        main(10);
        System.out.println(Arrays.toString(args));
    }

    public static void main(int num){
        System.out.println("num = " + num);
    }
}
