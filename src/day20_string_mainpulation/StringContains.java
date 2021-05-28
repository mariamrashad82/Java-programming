package day20_string_mainpulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Amazon prime";
        System.out.println(company.contains("z"));// true
        System.out.println(company.contains("zon"));// true
        System.out.println(company.contains("n p"));// true
        System.out.println(company.contains(" R"));// false

        if(company.contains(" ")){
            System.out.println("multiple words company name");
        }else{
            System.out.println("single word company name");
        }
        String etsyTitle = "Wooden spoon | Etsy";
        if(etsyTitle.contains("|")){
            System.out.println("pass - title check passed");
        }else{
            System.out.println("fail - title check failed");

        }

        String firstName = "Mariam";
        if(firstName.contains("m") && firstName.contains("r")){
            System.out.println(" both m & r present");
        }else{
            System.out.println("both m || r not present");
        }
        firstName = "Emmanuel";
        if(firstName.contains("a") || firstName.contains ("u")){
            System.out.println("a or u is present" );
        }else{
            System.out.println("a or u is not present ");
        }
        String email = "mariam.rashad@yahoo.com";
        if(email.contains(".") && email.contains("@")){
            System.out.println("valid  email ");
        }else{
            System.out.println("invalid email ");
        }
        if(email.toLowerCase().contains("m")){
            System.out.println("m is present");
        }else{
            System.out.println(" m is not present");
        }


    }
}
