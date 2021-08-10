package interview_coding;

public class Balance3 {
    public boolean checkWithIntegers(String input) {

        int brackets = 0;

        for (char c: input.toCharArray()) {

            switch (c) {

                case '(':

                    brackets++;

                    break;

                case ')':

                    if (brackets == 0)
                        return false;

                    brackets--;

                    break;

                default:

                    break;
            }
        }


        return brackets == 0;
    }

    public static void main(String... args) {

        Balance3 b = new Balance3();
        System.out.println( b.checkWithIntegers("") );
        System.out.println( b.checkWithIntegers("(") );
        System.out.println( b.checkWithIntegers(")") );
        System.out.println( b.checkWithIntegers(")(") );
        System.out.println( b.checkWithIntegers("()") );

    }
}
