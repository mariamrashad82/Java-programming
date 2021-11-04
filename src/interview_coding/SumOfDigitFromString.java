package interview_coding;
// gfdf78665564bh768;

public class SumOfDigitFromString {
    public static void main(String[] args) {

        System.out.println( sumOfDigit("gfdf78665564bh768") );
    }
    public static int sumOfDigit(String s){
        int total =0;
        char[]ch = s.toCharArray();
        for(char each : ch){
            if(Character.isDigit(each)){
                total +=Integer.valueOf(""+each);
            }
        }
        return total;
    }
}
