package MockInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
    
    public static void main(String[] args) {
        ArrayList<Integer> reverse = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 9, 6, 8));
        System.out.println(revList(reverse));

    }
       public static  ArrayList<Integer>revList (ArrayList<Integer> list){

           ArrayList<Integer> rev = new ArrayList<>(list.size());


            for (int i = list.size() - 1; i >= 0; i-=2 ) {

                rev.add(list.get(i));

            }
            return rev;

        }


    }
