package day64_review;

public class ExceptionReview {
    public static void main(String[] args) {
        try {
            System.out.println("java" );
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("Exception happened");
            e.printStackTrace();
            System.out.println(" get message : " + e.getMessage());
        }
    }
}
