package interview_coding;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String word = "aaabbbbcczdff";
        System.out.println("(frequency(word)) = " + (frequency(word)));
    }




    public static String frequency(String word){
        // Collections.frequency ==> only use with collection framework

        // we use map because it will remove duplicate key and also
        // count the value
        // we use LinkedHashMap because insertion order is Matter.

        // aaaabbcdd ==> a4b2c1d2
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1); // b1 ==> b2
            }else{ // else means the character is already exist inside my map
                map.put(c , map.get(c) +1); // add 1 to the value of that specific key
            }
        }
        String frequency = "";

        // what is the best way to print map<k,v> as a string
        // Map.Entry<Character,Integer>
        for (Map.Entry<Character,Integer> each : map.entrySet()) {
            frequency += ""+each.getKey()+each.getValue(); // a4b3
        }
        return frequency;
    }
}


