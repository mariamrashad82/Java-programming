package MockInterview;

import java.util.HashMap;
import java.util.Map;

public class convertStringArray {
    public static void main(String[] args) {
        Integer[] arrayKeys = {123, 124, 125, 126, 127};

//values array
        String[] arrayValues = {"test", "test1", "test2", "test3", "test5"};

        Map<Integer, String> hMapData = new HashMap<Integer, String>();

        /*
         * Assuming both the arrays are of the same size
         */
        for( int i = 0; i < arrayKeys.length; i++ ){

hMapData.put( arrayKeys[i], arrayValues[i] );
        }

        System.out.println("HashMap contains: " + hMapData);
    }
}
