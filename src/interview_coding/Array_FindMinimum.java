package interview_coding;

public class Array_FindMinimum {
    public static void main(String[] args) {


    /*
     /*
    Write a function that can find the maximum number from an int Array

    public int maxValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

     */

       // public int maxValue ( int[] n){
            int[] maxValue = {2653, 4367, 31231, 8766};
            int min = Integer.MAX_VALUE;
            for (int each : maxValue) {
                if (each > min) {
                    min = each;
                }
            }
        System.out.println("Minimum value = " + min);
        //    return min;

        }
    }
