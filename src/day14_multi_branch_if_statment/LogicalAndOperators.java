package day14_multi_branch_if_statment;

public class LogicalAndOperators {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println("\n");
        System.out.println(10 > 5 && 1 == 1);
        System.out.println(99 < 100 && 22 > 25);
        System.out.println(3 < 2 && 5 > 2);
        System.out.println(10 > 15 && 2 > 10);
        System.out.println("\n");

        int apples = 10, orange = 5;
        boolean check = apples > 5 && orange > 3;
        System.out.println("check = " + check);

        if(apples > 6 && orange > 2 ){
            System.out.println(" i have enough apples and orange");
        }else{
            System.out.println(" i need to go shopping");
        }
    }
}




