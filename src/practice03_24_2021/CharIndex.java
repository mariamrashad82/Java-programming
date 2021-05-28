package practice03_24_2021;

import java.util.Locale;

public class CharIndex {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(s.charAt(s.length()-1));// a
        System.out.println(s.charAt(0) + s.charAt(1) + s.charAt(2) + s.charAt(3));// 418
        System.out.println(s.charAt(0)+ "" + s.charAt(1) + "" + s.charAt(2) +  "" + s.charAt(3));// java
        System.out.println(s.charAt(0)  + s.charAt(3));// 203
        System.out.println(s.charAt(0) + "" + s.charAt(3));// ja
        System.out.println(s.length());// 4
        System.out.println("\n");
        // "" space make condition string not char

        //String upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3);// JA

        String upper =s.toUpperCase();
        System.out.println(upper);// JAVA

        System.out.println(s.indexOf('a'));//1
        System.out.println(s.indexOf('b'));// -1

        System.out.println(s.contains("j"));// true
        System.out.println(s.indexOf('j') >= 0 ? "contains" : "not contains");// contains
        System.out.println(s.indexOf('g') >= 0 ? "contains" : "not contains");// not contains

        System.out.println(s.toLowerCase().contains("a"));// true
        System.out.println(s.toLowerCase().startsWith("a"));// false
        // boolean string method
        System.out.println(s.toLowerCase().replace("s" ,"b").startsWith("a"));// false
    }

}
