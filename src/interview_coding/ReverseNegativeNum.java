package interview_coding;

public class ReverseNegativeNum {
    public static void main(String[] args) {
        int num = -22324;
        System.out.println("reverseNum(num) = " + reverseNum(num));
    }

    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }

        return Integer.valueOf(str);

    }
}
