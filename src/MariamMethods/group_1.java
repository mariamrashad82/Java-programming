package MariamMethods;
//Integer num = new Integer();
public class group_1 {
    public static void main(String[] args) {

        String num = String.valueOf(2.5);
        int num1 = 2;
        num += num1;
        float num2 = Float.parseFloat(num);
        System.out.println(num2);
        System.out.println(2.5);
    }

    public static int a(int a) {
        return 1;

    }

    public static int a(double a) {
        return 2;
    }

    public static int a(String a) {
        return 3;
    }
}