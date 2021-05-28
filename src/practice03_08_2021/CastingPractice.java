package practice03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {
        // byte,short,int,long,float,double
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;
        double d = 5.3;
       // int i = (float)d; wrong
         int i = (short)d;

        // float f = 3.54;
         float f = 3.54f;


    }
}
