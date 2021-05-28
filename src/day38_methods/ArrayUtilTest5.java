package day38_methods;

public class ArrayUtilTest5 {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};
        ArrayUtils5.printArray(nums);
        //the same all steps we have mention new int
        ArrayUtils5.printArray(new int[]{5, 23, 1, 543, 90, 65, 54, 34});

        System.out.println("Sum = " + ArrayUtils5.sum(nums));
        System.out.println("Sum =  " + ArrayUtils5.sum(new int[]{5, 23, 1, 543, 90, 65, 54, 34}));

        int[] nums2 = {4, 1, 5, 8};
        //int num = 5;
        //boolean found = false;
       // for (int each : nums2) {
         //   if (each == num) {
          //      found = true;
          //      break;
         //   }

      //  }
        System.out.println("5 is found = " + ArrayUtils5.contains(nums2,5));
        System.out.println("10 is found = " + ArrayUtils5.contains(nums2,10));
    }

}
