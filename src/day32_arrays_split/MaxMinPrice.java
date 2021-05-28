package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.print(Arrays.toString(items)+ "\n");
        System.out.print(Arrays.toString(prices) + "\n");
        System.out.print(Arrays.toString(itemIDs) + "\n");


        System.out.println("\n ");
        System.out.println(" *********** Most expensive items *********");
        double maxPrice = prices[0] ;
        int indexOfMaxPrice = 0;

        for (int i = 0; i < items.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice= i ;
            }
            }
            System.out.println(  "Max Price = " +  maxPrice );
        System.out.println("index Of MaxPrice : " + indexOfMaxPrice);
        System.out.println( " ( " + items[indexOfMaxPrice] + " - $ " + prices[indexOfMaxPrice] + " - #" +itemIDs[indexOfMaxPrice] + " ) ");

        System.out.println("\n");
        System.out.println(" *********** Most chepest items *********");
        double minPrice =prices[0];
        int indexOfMinPrice=0;
        for (int i = 0; i < items.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                indexOfMinPrice=i;
            }
        }
        System.out.println( " Min Price = "+ minPrice);
        System.out.println("Index Of Min Price = " + indexOfMinPrice);
        System.out.println(" ( " + items[indexOfMinPrice] + " _$" + prices[indexOfMinPrice] + " _#" + itemIDs[indexOfMinPrice] + " ) ");






    }
}








