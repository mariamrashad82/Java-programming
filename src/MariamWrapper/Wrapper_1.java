package MariamWrapper;

public class Wrapper_1 {
    public static void main(String[] args) {
        int num = 200;
        System.out.println("num = " + num);
        num+=10;
        System.out.println(num + "\n");

        Integer n = new Integer(100);
        System.out.println("Is n 100? = " + n.equals(100));
        System.out.println(n+300);

        Integer n2 = 1000;
        System.out.println(n2/50);
        
        String str = "java";
        String numStr = n2 + " ";
        String numSt = n2.toString();
        System.out.println("Str = " + str);
        System.out.println("numStr = " + numStr);
        System.out.println("numSt = " + numSt);


        

    }
}
