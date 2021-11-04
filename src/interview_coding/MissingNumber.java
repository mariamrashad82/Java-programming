package interview_coding;
import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr={7,5,6,1,4,2};

     //   System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int missNum = 0;

        Arrays.sort(arr);
        int value = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != value){
                missNum = value;
                break;
            }
            value++;
        }
        return missNum;
    }

}
