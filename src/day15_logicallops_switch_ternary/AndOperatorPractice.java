package day15_logicallops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {

        boolean onSale = true;
        boolean freeShipping = true;
        String item1= "wooden spoon";

        if (onSale && freeShipping && item1.equals("wooden spoon") ) {
            System.out.println(" add " +item1 + " to my cart");
        } else {
            System.out.println(" do not buy it");
        }
    }
}