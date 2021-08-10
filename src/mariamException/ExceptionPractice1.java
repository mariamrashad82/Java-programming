package mariamException;

public class ExceptionPractice1 {
    public static void main(String[] args) {
        String word = "koko";
        try {


            System.out.println("Word = " + word);
            System.out.println(word.length());
            System.out.println(word.substring(20));

        } catch (NullPointerException e) {
            System.out.println("NullPointerException catch and handled");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is wrong , please check if u entered a valid index");
        } catch (Throwable t) {//parent of all exception , parent type exception must be at end
            System.out.println("Exception is catch ");
            System.out.println(" Reason " + t.getMessage());
        }
    }
}