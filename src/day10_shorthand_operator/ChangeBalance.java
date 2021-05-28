package day10_shorthand_operator;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);
        double baklava = 25.5;
        System.out.println("baklava = " + baklava);
        // decrease balance  baklava price
         balance = balance -  baklava;
        System.out.println("balance after baklava = " + balance);
        double kenafa = 45.99;
        System.out.println("kenafa = " + kenafa);
         balance = balance - kenafa;
        System.out.println("balance after kenafa = " +balance);
        //decrease kenafa price
        kenafa = kenafa / 2 ;
        System.out.println("kenafa = " + kenafa);
        // buy it and decrease kenafa price
        balance = balance - kenafa;
        System.out.println("balane after kenafa = " + balance);
         double nuts = 7.99;
        System.out.println("nuts = " + nuts);
         balance = balance - nuts ;
        System.out.println("balance after nuts = " + balance);
        // buy 4 ice tea and decrease balance
        double iceTea = 2;
        System.out.println("iceTea = " + iceTea);
        balance = balance - iceTea * 4;
        System.out.println("balance after iceTea = " + balance);
        // return baklava
        System.out.println("returning baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after baklava " + balance);



    }
}
