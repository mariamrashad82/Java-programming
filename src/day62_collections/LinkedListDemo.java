package day62_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <String> friends = new LinkedList<>();

        friends.add("Mariam");
        friends.add("Samir");
        friends.add("Marvi");
        friends.addFirst("Koko");
        System.out.println(friends);
        System.out.println(friends.getLast());


        //polymorphism
        List<Integer> score = new ArrayList<>();
        score.add(5);
        score.add(42);
        score.add(23);
        score.add(42);
        System.out.println(score);
        System.out.println("0 = " + score.get(0));
        System.out.println("1 = " + score.get(1));




    }
}
