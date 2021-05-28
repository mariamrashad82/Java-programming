package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23,1,34,54,654);
        System.out.println("nums = "+ nums);
       // nums.add(100);  UnsupportedOperationException
        // nums.remove(0);  UnsupportedOperationException
        //nums.clear();  UnsupportedOperationException
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4,2,3,3433,44,100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("nums list after add = " + numsList);

        numsList.remove(new Integer(44));
        System.out.println("nums list after remove (44) = " + numsList);
        numsList.remove(0);
        System.out.println("nums list after remove (0) = " + numsList);


        List<String> drinkWithCaffeine = new ArrayList<>(Arrays.asList("Coffe", "Tea" , "Latte", "Coke" ,
                " red bull" , " monster", "mdew", "Pepsi"));
        System.out.println( "All drinks = " + drinkWithCaffeine);


        int caffeineAmount = 0;
        for(String eachDrink : drinkWithCaffeine){
            if(eachDrink.equals("monster") || eachDrink.equals("red bull")||eachDrink.equals("mdew")) {
                caffeineAmount = 150;
                System.out.println(eachDrink + " ---> " + caffeineAmount);
            }else if (eachDrink.equals("Coffe") || eachDrink.equals("Tea")) {
                caffeineAmount = 112;
                System.out.println(eachDrink + " ---> " + caffeineAmount);
            }else if (eachDrink.equals("Latte") || eachDrink.equals("Coke")||eachDrink.equals("Pepsi")){
                caffeineAmount= 25;
                System.out.println(eachDrink+ " ---> " + caffeineAmount);
            }

        }
        for(String drink : drinkWithCaffeine){
            switch (drink){
                case "monster":
                    case "red bull":
                        case "tea":
                    caffeineAmount = 150;
                    System.out.println(drink + " ---> "+ caffeineAmount);
                    break;
                case "Tea":
                    case "coke":
                        case "mdew":
                    caffeineAmount= 25;

                    System.out.println(drink+ " --> " + caffeineAmount);
                    break;
            }
        }
        System.out.println();
        drinkWithCaffeine.forEach(drink ->System.out.print(drink.toUpperCase() + " "));
        drinkWithCaffeine.forEach(each->{
            System.out.println();
            System.out.println("each = " + each);
            System.out.println("__________________");

        } );



    }
}
