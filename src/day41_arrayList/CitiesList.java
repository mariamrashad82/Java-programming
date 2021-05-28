package day41_arrayList;


import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist. alt/option +enter
        ArrayList<String> Cities = new ArrayList<>();
        //add cities to arraylist ->add methods
        Cities.add("Washington DC");//0
        Cities.add("Gainesville");//1
        Cities.add("vienna");//2
        Cities.add("Adana");//3
        Cities.add("LA");//4
        //add Ashgabat to 0 index
        Cities.add(0, "Ashgabat");
        //print all values in same line
        System.out.println(Cities);
        //print first and last city
        System.out.println("First city = " + Cities.get(0));
        System.out.println("last city = " + Cities.get(5));
        // find last index using size()-1
        System.out.println("last city = " + Cities.get(Cities.size() - 1));
        //print count of items in arraylist
        System.out.println("count of size = " + Cities.size());
        int size = Cities.size();
        System.out.println("There are " + size + " Cities in the list");
        // for loop and print all values in the same line
        for (int i = 0; i < Cities.size(); i++) {
            System.out.print(Cities.get(i) + " ");

        }
        System.out.println();
        // sor each loop
        for (String city : Cities) {
            System.out.print(city + " ");
        }
        System.out.println();
        for (int i = 0; i < Cities.size() / 2; i++) {
            System.out.print(Cities.get(i) + " ");
        }
        System.out.println();
        // delete item from arraylist
        // 1 way using index. delete value in index 3
        Cities.remove(3);
        // 2 way remove using object/ value
        Cities.remove("Gainesville");
        System.out.println("After remove = " + Cities);

        // delete oe remove all values from the list
        Cities.clear();
        //1-  make sure it is clear , printed( spit ) out
        System.out.println(" Cities =  " + Cities);
        //2- using isEmpty
        //2) using isEmpty

        if (Cities.isEmpty()) {
            System.out.println("list is empty :" + Cities.isEmpty());
        }

        //3) check size() == 0
        if (Cities.size() == 0) {
            System.out.println("list is empty ");
        }
    }
}