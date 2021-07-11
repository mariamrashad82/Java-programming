package day61_exception_collections.cheched_exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds ");





        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        Thread.sleep(5000);
        System.out.println(" wake up after 5 seconds");
    }
}
