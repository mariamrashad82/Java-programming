package day41_arrayList;


import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
    // cars list
        List<String> myCar = new ArrayList<>();
        myCar.add("Kia");
        myCar.add("Toyota");
        myCar.add("Ford");
        myCar.add("mazda");
        myCar.add("Tesla");
        myCar.add(0,"Jeep");
        myCar.add(1,"lada");
        myCar.add(2,"BMW");

        // jeep , lada,BMW,kia,toyota,ford,mazda,tesla
        System.out.println("MY CARS = " + myCar);
        System.out.println("MY CARS = " + myCar.toString());
        String allCarsIn1String = myCar.toString();
        System.out.println(" all my car in 1 string = " + allCarsIn1String);
        // change index 0 to Audi
        myCar.set(0,"Audi");
        System.out.println("After set Audi = "+ myCar.toString());
        // change 4 t0 Honda
        myCar.set(4,"Honda");
        System.out.println("After set Honda = "+ myCar.toString());
        System.out.println("After set Honda = "+ myCar);
        // find index number of ford
        System.out.println(" Index of ford = " + myCar.indexOf("Ford"));
        int mazdaIndex = myCar.indexOf("mazda");
        System.out.println("mazda Index = " + mazdaIndex);
        // change mazda to jugar
        myCar.set(6,"Jugar");
        System.out.println(" cars after Jugar = " + myCar);
        // replace ford with trabant using single statement
        myCar.set(myCar.indexOf("Ford"),"Trabant");
        System.out.println("my cars after replace ford with Trabantn = "+ myCar);


        if(myCar.contains("lada")) {
            myCar.set(myCar.indexOf("lada"), "bugatti");
        }else{
            System.out.println("lada is not found");
        }
        System.out.println("after set bugatti = " + myCar.toString() );
        /**
         * change audi to prius
         * lada to lexus
         *
         */



        for(int i = 0 ; i < myCar.size(); i ++){
            if(myCar.get(i).equalsIgnoreCase("Audi")){
                myCar.set(i,"prius");
            }else if(myCar.get(i).equals("lada")) {
                myCar.set(i,"Lexus");

            }else if(myCar.get(i).equals("Tarbant")){
                myCar.set(i,"cruiser");
            }
        }
        System.out.println("After loop  : " + myCar );



    }
}
