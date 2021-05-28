package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "githubb";
        char letter = 't';
        int index = -1;

        for (int i = 0; i <word.length() ; i++) {
            //System.out.println(i + " = " +word.charAt(i) );
            if (word.charAt(i)==letter){
               index = i;
                System.out.println(letter + " is found at index " + index);
                break; // stop loop
            }
            }

        if(index == -1){
         System.out.println(" it is not found");
}


    }
    }
