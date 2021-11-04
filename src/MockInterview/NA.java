package MockInterview;

public class NA {
    private static int pgmSample(
            String someString, char searchedChar, int index) {
        if (index >= someString.length()) {
            return 0;
        }

        int i = someString.charAt(index) == searchedChar ? 1 : 0;
        return i + pgmSample(someString, searchedChar, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(pgmSample("Java beans", 'a',3+1));
    }
}


