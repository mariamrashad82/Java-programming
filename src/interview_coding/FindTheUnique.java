package interview_coding;

public class FindTheUnique {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCDEF"));
    }

    public static String unique(String str) {
        String[] array = str.split("");

        String unique1 = "";
        for (int i = 0; i < array.length; i++) {

            int num = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j].equals(array[i])) {
                    num++;
                }
                if (num == 1) ;
                unique1 += array[i];


            }


        }


        return unique1;


    }

}


