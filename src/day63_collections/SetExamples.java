package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //list -->ArrayList
        set.add(100);
        set.add(1);
        set.add(2);
        set.add(50);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(100);

        System.out.println(set);



        Set<String> words = new HashSet<>();
        words.add("jesus");
        words.add("good");
        words.add("all");
        words.add("jesus");
        words.add("the");
        words.add("time");
        System.out.println(words);
        words.remove("the");
        System.out.println(words);


        for(String word : words){

        }

        //convert your set to list
        List<String> wordsList = new ArrayList<>(words);
        wordsList.add("God");
        wordsList.add("is");
        wordsList.add("good");
        System.out.println(wordsList);
        System.out.println(wordsList.get(0));




        //LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("apple");
        linkedHashSet.add("53");
        linkedHashSet.add("cucumber");
        System.out.println(linkedHashSet);


       // Tree Set
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("jeva");
        treeSet.add("Apple");
        treeSet.add("apple");
        treeSet.add("53");
        treeSet.add("Cucumber");
        System.out.println(treeSet);
    //   ( (TreeSet)treeSet).


    }
}
