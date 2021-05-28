package day05_primitives_concatanation;

import com.sun.tools.corba.se.idl.constExpr.BooleanNot;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "APPLE";
        String model = "I phone 12";
        String color = "gold";
        Boolean isColorGold = true;
        int price = 1100;
        int storage = 128;
        Boolean hasCamera = true;
        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(isColorGold);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasCamera);
        // with massage//
        System.out.println("Brand is " + brand );
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("price is $ " + price);
        System.out.println("storage is " + storage + " GB ");
        System.out.println("has camera ? _ " + hasCamera );




    }
}
