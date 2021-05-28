package day16_swich_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        System.out.println("Cappuccino Please");
        String size = "venti";
        double price = 0.0;
        double calories = 0.0;

        switch (size) {
            case "tall":
                price = 3.69;
                calories = 90;
                System.out.println(" Tall cappuccino please");
            break;

            case "grande":
                price = 4.69;
                calories = 110;
                System.out.println(" grande cappuccino please");
            break;

            case "venti":
                price = 5.69;
                calories = 190;
                System.out.println(" venti cappuccino please");
             break;

            default:
                System.out.println("we sold out"+ size);
            break;

        }
        System.out.println("Total price : $" + price);
        System.out.println("you will consume " + calories + " calories");
    }
}
