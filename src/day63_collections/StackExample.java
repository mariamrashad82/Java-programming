package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry potter");
        bookStack.add("Leader eat last");
        bookStack.add("Java intro");
       // bookStack.add("cucumber");
        bookStack.push("Cucumber");
        System.out.println(bookStack);

     //   System.out.println(bookStack.push("Cucumber"));
     //   System.out.println(bookStack);

        System.out.println(" This is the top of the stack : " + bookStack.peek());
        System.out.println(bookStack);

        System.out.println("remove index 0 " + bookStack.remove(0));
        System.out.println(bookStack);

     //   bookStack.pop(); // remove and returns the top of the stack item

        System.out.println(bookStack.pop());
        System.out.println(bookStack);

        System.out.println ("Final version" + bookStack);
        System.out.println(bookStack);
    }
}
