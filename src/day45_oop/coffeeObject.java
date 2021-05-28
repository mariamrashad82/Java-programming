package day45_oop;

public class coffeeObject {
    public static void main(String[] args) {

              Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = "+ myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = "+ myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after refill 10 = "+ myCoffee.getAmount());
       // myCoffee.type="Latte"; not this way
        myCoffee.setType("Latte");
        System.out.println("My coffee type : " + myCoffee.getType());

        System.out.println("My "  + myCoffee.toString());


        Coffee coffee1 = new Coffee();
        coffee1.setType("coffee1");
        System.out.println("My coffee type : " + coffee1.getType());

        Coffee coffee2 = coffee1;
        System.out.println("coffee 2 type = " + coffee2.getType());
        coffee2.setType("Espresso");
        System.out.println("coffee 2 type = " + coffee2.getType());

        Coffee coffee3 = new Coffee();
        coffee3.setType("IceCoffee");
        //point the same object coffee2
        coffee3=coffee2;
        System.out.println("Coffee 3 type : "  + coffee3.getType());


        Coffee coffee4 = null;
        coffee4.setType("latte"); //null pointer exception




    }
}
