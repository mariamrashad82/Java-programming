package mariam_practice;

public class AverageNumbersArray {
    public static void main(String[] args) {
      // Given an int array calculate the average number-> Make it flexible
        // so it will work with any array size
        // Examples:[1,2,3] ->average: 2
        // [10, 15, 5, 6] -> average: 9
        // [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10

        int[]number = {4, 5, 6, 7, 8, 10, 20, 30, 0};
        int num = 0;
        for(int i = 0 ; i < number.length; i ++ ){
            num+=number[i];

        }
        int ave = num/number.length;

        System.out.println(ave);


    }
}



//int [] number = {0, 125, 12, 85, 45, 10};
//        int n = 0;
//
//        for(int i = 0; i < number.length; i++){
//           n += number[i];
//
//        }
//        int average = n / number.length;
//        System.out.println(average);
//    }
//}