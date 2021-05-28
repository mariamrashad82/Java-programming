package day29_nestedloop_arrays;

public class countCharNestedLoop {
    public static void main(String[] args) {
        String word = "java";

        for (int outter = 0; outter < word.length(); outter++) {
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++) {

                if (word.charAt(outter) == word.charAt(inner)) {
                    count++;
                }
            }
            System.out.print("[" +word.charAt(outter) + ":" + count + "]");


        }
            }
        }

