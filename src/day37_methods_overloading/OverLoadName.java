package day37_methods_overloading;

import java.util.Arrays;

public class OverLoadName {
    public static void main(String[] args) {
        System.out.println("Hello From Real Main Methods");
        main(10);
        System.out.println(Arrays.toString(args));
    }

    public static void main(int num) {

        System.out.println("num = " + num);
    }



    }

