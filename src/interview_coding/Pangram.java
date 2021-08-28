package interview_coding;

public class Pangram {
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog.";
//        char [] a= s.replace(" ", "").toLowerCase().toCharArray();
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));

        System.out.println(isPangram(s));
    }

    public static boolean isPangram (String str ){
        str = str.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i < str.length(); i++ ){

            if(Character.isLetter(str.charAt(i))){
                alp = alp.replace("" + str.charAt(i), "");
                // System.out.println(str.charAt(i) + " " + alp);
            }

            if(alp.isEmpty()){
                break;
            }

        }

        return alp.isEmpty();
    }


}
