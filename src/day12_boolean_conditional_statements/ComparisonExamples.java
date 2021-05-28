package day12_boolean_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed= 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(currentSpeed < speedLimit);
        System.out.println(speedLimit == currentSpeed);
        System.out.println("isSpeeding ? " + isSpeeding);
        System.out.println("\n");
        //45 + 20 = 65
        currentSpeed +=20;
        isSpeeding  = currentSpeed > speedLimit;
        System.out.println(currentSpeed > speedLimit);
        System.out.println("speed limit : "+speedLimit);
        System.out.println( "currentSpeed :" + currentSpeed);
        System.out.println("isSpeeding ? " + isSpeeding);
        System.out.println("\n");
        // new example
        double accBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("can i afford? _" + (accBalance >= itemPrice));
        boolean canAfford = accBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);
        //decrease balance by item price
       // accBalance = accBalance - itemPrice
        accBalance -= itemPrice;
        boolean isBroke = accBalance<=0;
        System.out.println("Am i broke?_ " + isBroke);
    }
}
