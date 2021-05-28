package day17_ternary_nested_condition;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drink = "tea";
        String snack = "chips";

        if (selection.equals("drink")) {
            System.out.println("drink option is selected ");
            if (drink.equals("tea")) {
                System.out.println("tea option is selected ");
            } else {
                System.out.println("coke is selected");
            }

        } else if (selection.equals("snack")) {
            System.out.println(" snack option is selected");
            if (snack.equals("chips")) {
                System.out.println("chips option selected");
            } else {
                System.out.println("candy option selected");
            }
        }
    }
}
