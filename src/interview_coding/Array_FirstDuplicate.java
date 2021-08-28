package interview_coding;

public class Array_FirstDuplicate {
    public static void main(String[] args) {
        int[] array = {9, 1, 500, -3,1,500, -10, 4, 3};
        System.out.println(" first Duplicate=" + firstDup(array));
    }
    public static int firstDup(int[] array) {
        int firstDuplicated =array[0] ;
        int count = 0;

        for(int i = 0 ; i < array.length;i++){

            for(int J = 0 ; J < array.length;J++){
                if(array[i] == array[J]){
                    count++;
                }
            }
            if(count>1){
                firstDuplicated = array[i];
                break;

            }
        }

         return firstDuplicated;

    }



}
