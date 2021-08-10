package interview_coding;

import java.util.Arrays;
import java.util.TreeSet;

public class sameLetterBoolean2Map {
    public static void main(String[] args) {
        System.out.println(same("abc", "abc"));

    }
    public static boolean same(String str1 ,String str2) {
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);
    }

}
