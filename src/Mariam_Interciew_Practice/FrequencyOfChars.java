package Mariam_Interciew_Practice;

import java.util.Arrays;
import java.util.Collections;

//Write a return method that can find the frequency of characters
//
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
public class FrequencyOfChars {
    public static void main(String[] args) {
        frequency("AAABBCDD");


    }
        public static String frequency(String str) {

            String nonDup="", result="";

            for(int i=0; i < str.length(); i++)

                if(! nonDup.contains(""+str.charAt(i)))

                    nonDup += ""+str.charAt(i);



            for(int i=0; i < nonDup.length(); i++) {

                int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

                result += ""+nonDup.charAt(i) + num;

            }



            return result;

    }


}
