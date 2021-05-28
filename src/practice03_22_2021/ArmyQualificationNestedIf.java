package practice03_22_2021;

public class ArmyQualificationNestedIf {
    public static void main(String[] args) {



        String citizenship = "USA";
        boolean resident = true;
        if (citizenship.equalsIgnoreCase("USA") || resident ){

            int age = 20;
            if(age >= 18 && age <= 35){

            boolean hasDiploma = true;
            if(hasDiploma) {

                System.out.println("your qualified for usa army");
            }else {
                System.out.println(" you must have usa diploma");
            }

            }else{
                System.out.println("you age mut be between 18 ;35");
            }

        }else{
            System.out.println("You must be a USA citizen or resident");
        }

        }
    }

