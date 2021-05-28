package day08_Casting_Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CastingExamples {
    public static void main(String[] args) {
        // all this steps right cause from smaller to bigger
        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        int num4 = 1000;
        int num5 = num4;
        float num6 = 124.4f;
        double num7 = num6;
        System.out.println("=================================");
        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);// 3456
        System.out.println("num9 = " + num9);
        System.out.println("++++++++++++++++++++++++++++");
        int num10 = 22;
        byte num11 = (byte)num10;
        short num12 = (short)num11;
        System.out.println("num10 =" + num10);
        System.out.println("num11 =" + num11);
        System.out.println("num12 =" + num12);
        System.out.println("============================");
        double num13 = 55.3;
        float num14 =(float) num13;
        System.out.println("num13 =" + num13);
        System.out.println("num14 =" + num14);
        System.out.println("===============================");
        double num15 = 1234.5;
        int num16 = (int)num15;
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);// 1234 print without change ,cause add (int)num15;
        System.out.println("========================================");

        int num17 = 200;
        byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);
        System.out.println("=====================================");
        char letter = 'M';
        int numLetter = letter;
        System.out.println( "letter = " + letter);
        System.out.println("num letter = " + numLetter);// 77 = M in char
        char dis1 = 'k';
        int dis2 = dis1 ;
        System.out.println(dis1);
        System.out.println(dis2);// k = 107
        System.out.println("====================================");









    }
}
