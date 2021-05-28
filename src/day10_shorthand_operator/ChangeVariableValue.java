package day10_shorthand_operator;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
        //increase 2 more count
        count = count + 5;
        System.out.println("count = " + count);
        int apples = 2;
        apples = apples + 10;
        System.out.println("apples = " + apples );
       // System.out.println("apple = " +( apples + 10));
        apples = apples - 3;
        System.out.println("apples = " + apples);
        // System.out.println("apple = " +( apples - 3));
        int pizzaSlice = 8;
        System.out.println("pizzaSlice = " + pizzaSlice);
        pizzaSlice = pizzaSlice / 2;
        System.out.println("pizzaSlice = " + pizzaSlice);
        // System.out.println("pizzaSlice  = " +( pizzaSlice / 2));
        //** get small pizza for u //
        pizzaSlice = pizzaSlice + 6;
        System.out.println("pizzaSlice = " + pizzaSlice);
        //double players in mach//
        int players = 10 ;
        System.out.println("players = " + players);
        players = players * 2 ;
        System.out.println("players = " + players);
        // keep only dollars // rev
        int cents = 244;
        System.out.println("cents = " + cents);
        cents = cents % 100;
        System.out.println("cents = " + cents);
                

    }
}
