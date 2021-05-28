package mariam_practice;

public class shortestAndLongestArray {
    public static void main(String[] args) {
        //•Write a program that can return the shortest string element
        // from a String array•Write a program that can return the
        // longest string element from a String array
        String[] words = {"jesus", "is", "love", "and", "life"};
        String shortest = words[0];
        String longest = words[0];
        for (String each : words) {
            if (each.length() > longest.length() ) {
                 longest = each;

            }
            if (each.length() < shortest.length()) {
                shortest = each;

            }


        }
        System.out.println("longest = " + longest);
        System.out.println("Shotrest = " + shortest);
    }

}

