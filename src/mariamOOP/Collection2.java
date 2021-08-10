package mariamOOP;

import java.util.*;

public class Collection2 {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.addAll(Arrays.asList("Aghabe","Halida", "Fikret"));
        pq.add("Aygun");
        pq.offer("Mariam");
        System.out.println(pq);
        pq.poll();
        System.out.println("pq = after poll = " + pq);
        pq.remove();
        System.out.println("pq = " + pq);
        System.out.println();

        //---------------------------------------------------------------------------------
        Queue<String> lq = new LinkedList<>();
        lq.addAll(Arrays.asList("Aghabe","Halida", "Fikret"));
        lq.add("Aygun");
        lq.offer("Mariam");
        System.out.println("lq = " + lq);
        lq.remove();
        System.out.println("lq = " + lq);
        System.out.println();

        //---------------------------------------------------------------------------------
        Deque<String> deq2 = new ArrayDeque<>();
        deq2.addAll(Arrays.asList("Aghabe","Halida", "Fikret"));
        deq2.add("Aygun");
        deq2.offer("Mariam");
        System.out.println(deq2);
        deq2.removeFirst();
        deq2.removeLast();
        System.out.println("deq = after poll = " + deq2);
        System.out.println();

        //---------------------------------------------------------------------------------
        Queue<Integer> nums = new PriorityQueue<>();
        nums.offer(1);
        nums.add(2);
        nums.addAll(Arrays.asList(3,4,5,6));
        System.out.println("nums: "+nums);
        System.out.println();

        Iterator iter = nums.iterator();
        while(iter.hasNext()) {
            if(iter.next().equals(5)){
                iter.remove();
            }
            System.out.print("iter = "+iter.next() + " ");
        }
        System.out.println();

        //---------------------------------------------------------------------------------
        Queue <String> str= new LinkedList<>();
        str.addAll(Arrays.asList("Aygun", "Aby","Aghabe","Mariam","Halida"));
        Iterator it = str.iterator();
//        for (String s : str) {
//      str.remove();
//            System.out.println("s = " + s);
//         }
        while(it.hasNext()){
            if (it.next().equals("Aby")) {
                it.remove();
            }
        }
        System.out.println("iter2 = " + str);
    }
    }

