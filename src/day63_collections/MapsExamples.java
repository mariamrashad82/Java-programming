package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        //    id     name  (the key has to be unique it can not be duplicate)
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Samir");
        map.put(2,"Mariam");
        map.put(2,"Marvi");
        map.put(100,"koko");
        map.put(101,"koko");

        System.out.println(map);
        System.out.println(map.get(100));
        System.out.println(map.get(50));
        System.out.println("*******************************");

        map.remove(1);
        System.out.println(map);
        System.out.println("*******************************");

        map.put(1,"Many");
        System.out.println(map);
        System.out.println("*******************************");

        map.remove("Marvi");
        System.out.println(map);
        System.out.println("*******************************");

        System.out.println( map.remove("Marvi"));
        System.out.println("*******************************");

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("koko"));
        System.out.println("*******************************");


        for (Integer key : map.keySet()) {
          //  System.out.println(key);
            System.out.println(key + " _ " + map.get(key));

            if(map.get(key).equals("Marvi")){
                System.out.println( "this is our key " + key);
            }

        }


    }
}
