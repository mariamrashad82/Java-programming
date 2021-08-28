package interview_coding;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "({[]})]";
        System.out.println("isBalanced(str) = " + isBalanced(str));
    }
    // stack = 0
    // stack.pop = [ ;

    //  {{()}()  ==> T
    // [{()}]

    // 1. first ==> the number of opening and the number closing should match
    // 2. second ==> you should close the inner Parentheses first and go to outer

    // ][{()}][

    // list opening = [   [ , { . ( ,[     ]
    // list closing = [   ], ) , } , ]     ]

    public static boolean isBalanced2(String str) {

        List<Character> opening = new ArrayList<>();
        List<Character> closing = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                opening.add(str.charAt(i));
            } else if ((str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') )  {
                closing.add(str.charAt(i));
            }
        }

        if (opening.size() != closing.size()){
            return false;
        }

        int lastIndex = opening.size() -1;

        for (int i = 0; i < opening.size(); i++) {
            switch (str.charAt(i)) {

                case '{':
                    if (closing.get(lastIndex -i) != '}') {
                        return false;
                    }
                case '[':
                    if (closing.get(lastIndex -i) != ']') {
                        return false;
                    }
                case '(':
                    if (closing.get(lastIndex -i) != ')') {
                        return false;
                    }
            }
        }


        return true;
    }

    // LIFO , last in first out
    // push() ==> add to the last
    // pop() ==> one of them will return the value of last index
    //       ==> it will remove it at same time
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        try {

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                    stack.push(str.charAt(i)); // [ '{', '(', '[' ]
                } else {
                    switch (str.charAt(i)) {
                        case '}':
                            if (stack.pop() != '{') {
                                return false;
                            }
                            break;
                        case ']':
                            if (stack.pop() != '[') {
                                return false;
                            }
                            break;
                        case ')':
                            if (stack.pop() != '(') {
                                return false;
                            }
                            break;
                    }
                }
            }
        }catch (EmptyStackException e){
            return false;
        }


        if (stack.size() != 0) {
            return false;
        }

        return true;
    }
}
