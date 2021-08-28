package interview_coding;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates2_Arrays {
    public static void main(String[] args) {

        System.out.println("remove Duplicate=" + removeDup("AAABBBCC"));
    }

    public static String removeDup(String str) {
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
     //   str = str.replace(",", "").replace("[","").replace("]","");
        str = str.replace(",", "").replace("_","").replace("_","");

        return str;

    }
}