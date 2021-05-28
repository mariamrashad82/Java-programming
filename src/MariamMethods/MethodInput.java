package MariamMethods;

public class MethodInput {
    public static void main(String[] args) {
        displayValue(55);
        weekName("Holly Week");
        marvi("i will buy new cloth fo easter");

    }
    public static void displayValue(int num){
        System.out.println("Value is " + num);
    }
    public static void weekName(String name){
        System.out.println("name of week is : " +name );
    }
    public static void marvi(String message){
        System.out.println("Marvi is going to buy " + message);
    }
}
