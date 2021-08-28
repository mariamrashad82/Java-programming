package interview_coding;

import com.sun.deploy.util.StringUtils;
import day38_methods.StringUtilsV3;

public class ReverseEachWord {

    public static void main(String[] args) {
        System.out.println(reverseEachWord("Java is fun"));
    }

    public static String reverseEachWord(String str) {

        String reverse = "";

        for(String each : str.split(" ")){

            reverse += StringUtilsV3.reverse(each) + " ";

        }

        return reverse.trim();

    }

}

