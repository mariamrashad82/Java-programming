package day13_conditional_statments;

public class StringComparison {
    public static void main(String[] args) {
        String city = "fair fax";
        if(city.equals("fair fax") ){
            System.out.println("It is VA");
        }else{
            System.out.println("NOT VA");
        }


        System.out.println("\n");
        String weather = "sunny";
       //  if (weather == "sunny"){// its working but avoid
        if (weather.equals( "sunny")){
            System.out.println("lets go out " );
        }else{
            System.out.println("lets stay in door");
        }

    }
}
