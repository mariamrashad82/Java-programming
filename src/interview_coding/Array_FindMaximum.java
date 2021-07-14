package interview_coding;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class Array_FindMaximum {
    public static void main(String[] args) {

    /*
    write a function that can find the maximum number from an int Array


        public int maxValue ( int[] n){
            int max = Integer.MIN_VALUE;
            for (int each : n) {
                if (each > max) {
                    max = each;
                }
            }
            return max;
        }

*/


     int[] Value=  {2653,4367,31231,8766};
        int max = Integer.MIN_VALUE;
     for (int each : Value){
         if(each > max){
            max = each;

         }
     }
        System.out.println("Maximum number = "  + max);
    }

}