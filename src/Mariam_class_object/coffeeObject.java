package Mariam_class_object;

public class coffeeObject {
    public static void main(String[] args) {


        coffee myCoffee = new coffee();
        System.out.println("myCoffee.getAmount() = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("myCoffee after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("myCoffee after 10  = " + myCoffee.getAmount());
        myCoffee.setType("latte");
        System.out.println("myCoffee type = " + myCoffee.getType());
        System.out.println("myCoffee.toString() = " + myCoffee.toString());

    }
}