package MockInterview;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        int [] a =  {5,7,3,8,20,14};
        for(int i =0; i<a.length;i++){
          //  a[i] = input.nextInt();
        }
        method8(a);
    }
    public static void method8(int [] arr) {
        for(int n :arr){
            if(n%2==0){
                continue;
            }
            System.out.println(n);
        }
    }
}
