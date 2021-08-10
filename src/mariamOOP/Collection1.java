package mariamOOP;

import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
        //Collection - Collection Framework - Collections
        //Iterable(i)
        //Collection(i)
        //List(i)

        //String[] group = new String[]{"Ahmet","Ali"};
        // System.out.println("Arrays.toString(group = " + Arrays.toString(group));
        //ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Aghabe");
        names.add("Aygun");
        names.add("Halide");
        names.add("Max");
        names.add("Mariam");
        names.add("Fikret");

        System.out.println("names = " + names);
        System.out.println("names.get() = " + names.get(3));
        names.remove(1);
        System.out.println("names.remove(\"Aby\") = " + names.remove("Aby"));
        System.out.println("names.remove(\"Mariam\") = " + names.remove("Mariam"));
        System.out.println("names = " + names);
        names.add("Aygun");
        System.out.println("names = " + names);
        names.removeIf(n -> n.equalsIgnoreCase("MAX"));
        System.out.println("names = " + names);
        System.out.println("names.get(names.size()-1) = " + names.get(names.size() - 1));//the last element
        names.add(2,"Aby");
        System.out.println("names = " + names);

        //insertion order >> adding order

        //LinkedList
        LinkedList<Integer> nums= new LinkedList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("nums = " + nums);
        nums.add(10);
        System.out.println("nums.get(5) = " + nums.get(5));
        System.out.println("nums.size() = " + nums.size());
        nums.replaceAll(n -> n*2);
        System.out.println("nums = " + nums);

        nums.addFirst(33);
        System.out.println("nums = " + nums);
        nums.addLast(55);
        System.out.println("nums = " + nums);
        System.out.println(nums.getFirst());
        nums.add(12);
        System.out.println("nums = " + nums);
        System.out.println("nums.getLast() = " + nums.getLast());
        System.out.println("nums.indexOf(12) = " + nums.indexOf(12));
        System.out.println("nums.lastIndexOf(12) = " + nums.lastIndexOf(12));

        System.out.println("nums.peek() = " + nums.peek());
        System.out.println("nums = " + nums);
        System.out.println("nums.poll() = " + nums.poll());
        System.out.println("nums = " + nums);
        System.out.println("nums.pop() = " + nums.pop());
        System.out.println("nums = " + nums);
        System.out.println("nums.pop() = " + nums.pop());
        System.out.println("nums = " + nums);
        ///FIFO
        System.out.println(nums.get(5));
        nums.add(6,99);
        System.out.println(nums);

        //Vector

        Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("banana");
        vector.add("apple");
        vector.add("plum");

        System.out.println("vector = " + vector);

        Collections.synchronizedList(names);
        names.add("Rod"); //fikret
        names.remove("Aby"); //max

        //Stack






    }
}
