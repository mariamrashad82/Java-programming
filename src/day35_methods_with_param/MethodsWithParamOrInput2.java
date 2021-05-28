package day35_methods_with_param;

public class MethodsWithParamOrInput2 {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        int count = 55;
        displayValue(count);// num = count;
        nameWeek("Holy Week \uD83D\uDE4F");
        Aida(" Aida will Leave and will have big Party \uD83D\uDE00 \uD83D\uDE00 \uD83D\uDE00");


    }

    public static void displayValue(int num) {

        System.out.println("Value is " + num);
    }

    public static void nameWeek(String name) {
        System.out.println("Week Name  : " + name);
    }

    public static void Aida(String message) {
        System.out.println(" \n This Thursday  : " + message);
    }
}