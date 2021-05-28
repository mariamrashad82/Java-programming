package day15_logicallops_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false= " + (true || false));
        System.out.println("false ||true = " + (false || true));
        System.out.println("false || false = " + (false || false));
        System.out.println("\n");
        int apples = 5;
        int oranges = 7;
        System.out.println(apples > 3 || oranges > 4);
        if(apples > 3 || oranges > 4){
            System.out.println(" no need to buy fruits today");
        }else {
            System.out.println("need to got some fruit");
        }
        System.out.println(apples > 2 || oranges > 10);
        if(apples> 2 || oranges > 10){
            System.out.println(" we look like good with fruits today");
        }else {
            System.out.println("need to got some fruit");
        }
       if(apples == 0 || oranges == 0){
           System.out.println(" we need to buy fruits today");
       }else {
           System.out.println("no need to got some fruit");

       }




    }
}
