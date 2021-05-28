package day09_Scanner_Practice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CentsToDollarsV1 {
    public static void main(String[] args) {
        int cents= 255;
        int dollars = cents / 100;
        int remainingCent = cents % 100 ;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println( "Remaining Cent = "+ remainingCent  );
        System.out.println("in " + cents + " cents : " + dollars + " dollars " + remainingCent + " cents");
    }
}
