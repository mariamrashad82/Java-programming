package Practice04_12_2021;

public class ArrayMinMax2 {
    public static void main(String[] args) {
        int [] arr = {3,1,500,-3,-10,4,3};
        int min = arr[0];
       int max = arr[0];

      for(int i =0; i < arr.length; i++) {
           // each -> every element | for loop: arr[i]

           if(arr[i] < min) {
               min = arr[i];
           }
           if(arr[i] > max) {
               max = arr[i];
            }

       }

        System.out.println("MIN: " + min);
       System.out.println("MAX: " + max);


    }
}
