package day39_wrapper_classes;

public class WrapperClasses_1 {
    public static void main(String[] args) {
        int num = 1000;
        System.out.println("num = " + num);
        num+=10;
        System.out.println(num + "\n");

        Integer n = new Integer(500);
        System.out.println("Is n 500? = " +  n.equals(500));
        System.out.println(n + 300);

        Integer intObject = 1000;
        System.out.println(intObject/50);

        Integer n2 = 1000;
        System.out.println(n2/50);

        String str = "java";
        String numStr = n2 +" ";
        String numSt = n2.toString();

        System.out.println("str : " + str);
        System.out.println("numStr : " + numStr);
        System.out.println("numStr : " + numSt);

        //
        Byte b1 = new Byte((byte) 5);
        Byte b2 = 10;
        System.out.println(b1+b2);


        Short sh1 = new Short ((short)40);
        Short sh2 = 50;

        Integer i1 = new Integer(100);
        Integer i2 = 200;

        Long l1 = new Long(300L);
        Long l2 = 3455L;

        Float f1 = new Float(5.2F);
        Float f2 = 45.5F;

        Double d1 = new Double(345.5D);
        Double d2 = 456.5;

        Character ch1 = new Character('Q');
        Character ch2 = 'V';

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;

        //




    }
}
