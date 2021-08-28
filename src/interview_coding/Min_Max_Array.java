package interview_coding;

public class Min_Max_Array {


        public static void main(String[] args) {

            int[] arr = {3, 1, 500, -3, -10, 4, 3};
            int min = arr[0];
            int max = arr[0];

            for (int each : arr) {
                // each -> every element | for loop: arr[i]

                if (each < min) {
                    min = each;
                }

                if (each > max) {
                    max = each;
                }

            }

            System.out.println("MIN: " + min);
            System.out.println("MAX: " + max);
        }
        }
