package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10 ; // single variable
        // array variable
        int[] nums = new int[3] ;
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 7;
       // nums[3] = 100;//ArrayIndexOutOfBoundsException: 3 because we store only 3   int[3]
        //print arrays
        System.out.println("value of index 0 = " +  nums[0]);
        System.out.println("value of index 1 = " +  nums[1]);
        System.out.println("value of index 2 = " +  nums[2]);
       // System.out.println("value of index 3 = " +  nums[3]);

        int i = 0;
        System.out.println(nums[i]); // 5
        i++;
        System.out.println(nums[i]);//10
        //how to find the size of array.
        System.out.println("number of elements = " + nums.length);// 3
        // store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);//3
        // change value in the array
        nums[0]= 100;
        nums[1]=300;
        //  read the value of index 1 and assign same to index 2
        nums[2]=nums[1];
        System.out.println("nums[0]=" +nums[0]);
        System.out.println("nums[1] =" +nums[1]);
        System.out.println(" nums[2] =" +nums[2]);

    }
}
