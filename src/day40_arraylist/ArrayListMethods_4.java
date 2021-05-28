package day40_arraylist;
import java.util.*;
public class ArrayListMethods_4 {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList);
        System.out.println("is Empty ? = " + shoppingList);
        if (shoppingList.isEmpty()) {
            System.out.println("List is Empty , keep coding java");
        } else {
            System.out.println("list is not empty , go to ROSS " + "\n");
        }
        shoppingList.add("dress");
        shoppingList.add("shoes");
        shoppingList.add("mask");
        shoppingList.add("food");
        shoppingList.add("wooden spoon");
        shoppingList.add("victoria secret");
        shoppingList.add("Accessories");

        if (shoppingList.isEmpty()) {
            System.out.println("List is Empty , keep coding java" + shoppingList);
        } else {
            System.out.println("list is not empty , go to ROSS " + shoppingList + " , ");
        }
        int count = shoppingList.size();
        System.out.println(" items to buy = " + count);

        System.out.println(" is mask on list :? " + shoppingList.contains("mask"));
        if (shoppingList.contains("mask")) {
            System.out.println("mask in the list");


        } else {
            System.out.println("mask is not in list !");

        }
        System.out.println("buying mask... $5.00");
        System.out.println(shoppingList.remove(2) );
        System.out.println(shoppingList.remove("mask") );
        System.out.println("NEW LIST : " + shoppingList + " , ");
        System.out.println("Done shopping :)");
        shoppingList.clear();//clear list , remove all list
        System.out.println(shoppingList);
    }
}