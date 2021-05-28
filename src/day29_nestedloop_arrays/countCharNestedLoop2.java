package day29_nestedloop_arrays;

public class countCharNestedLoop2 {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            char outer = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                char inner = word.charAt(j);
                if (outer == inner) {
                    count++;
                }
            }
                System.out.print( "(" +outer + " = " + count + " )");
            }

        }
    }
