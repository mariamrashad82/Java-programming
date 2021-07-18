package day63_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
      //  Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
      //  queue.add("one");
     //   queue.add("one");
       queue.add("three");
       queue.add("four");
       queue.add("five");

        System.out.println(queue.element()); // looking in top element
        System.out.println(queue);

        System.out.println(queue.peek()); //
        System.out.println(queue);

        System.out.println(queue.poll());// remove top element
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue);


    }
}
