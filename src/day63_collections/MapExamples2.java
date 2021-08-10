package day63_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples2 {
    public static void main(String[] args) {
        // id , person
        Map<Integer , Person> map = new HashMap<>();

        map.put(39 , new Person("MR" , 39));
        map.put(null , new Person("" , 0));
        map.put(12 , new Person("zek" , 10));

        System.out.println(map.get(39));
        System.out.println(map.get(null));
        System.out.println(map.get(12));
        System.out.println(map);
        System.out.println("***************************************");


        Map<Integer , Person> map2 = new LinkedHashMap<>();
        map2.put(39 , new Person("MR" , 39));
        map2.put(null , new Person("" , 0));
        map2.put(12 , new Person("zek" , 10));
        System.out.println(map2);
        System.out.println("*****************************************");


        Map<Integer , Person> map3 = new TreeMap<>();
        map3.put(39 , new Person("MR" , 39));
        map3.put(0 , new Person("" , 0));
        map3.put(-12 , new Person("zek" , 10));
        System.out.println(map3);



    }
}
