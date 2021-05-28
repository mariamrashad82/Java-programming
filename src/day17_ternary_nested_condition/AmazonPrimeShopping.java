package day17_ternary_nested_condition;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 40.0;
        boolean isPrimeMember = true;
        if(itemPrice >= 25.0){
            System.out.println("Eligible for free 2 days shipping ");
        }else{
            if(isPrimeMember){
            System.out.println("Eligible for free regular shipping ");
        }else{
            System.out.println(" Not Eligible for free shipping" );

        }
    }
    }
}
