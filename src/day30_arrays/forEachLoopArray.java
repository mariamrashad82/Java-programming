package day30_arrays;

public class forEachLoopArray {
    public static void main(String[] args) {
        int[] data = {187, 27, 356, 46, 776, 940, 88};
        for (int eachNum : data) {
            System.out.print("Each Num = " + eachNum);
            System.out.println();


            // if (eachNum % 2 == 0) {
            //    System.out.println("even num = " + eachNum);

        }
        System.out.println("\n");
        // change data variable to n variable
        for (int n : data) {
            System.out.print(n + " ");

        }
        System.out.println("\n");
        // with for loop
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + "  = " + data[i]);
        }

        // print last number
        System.out.println("\n");
        System.out.println("last value " + data[data.length - 1]);
        System.out.println("last value " + data[6]);

        System.out.println("\n");
        // print all number backward in the same line
        int[] data0 = {187, 27, 356, 46, 776, 940, 88};
        for (int k = data.length - 1; k > 0; k--) {
            System.out.print( data0[k] + " " );

            // //print all number backwards in same line
            //        for(int idx = data.length - 1; idx >= 0; idx--) {
            //            System.out.print(data[idx] + " ");
        }


    }


    }
