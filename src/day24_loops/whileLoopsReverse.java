package day24_loops;

public class whileLoopsReverse {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while (count >= 0) {
            System.out.println("count = " + count--);
            Thread.sleep(1000);
        }
        System.out.println("finished the count :)");



        int unreadSMS = 10;

        System.out.println("I have total  " + unreadSMS +" unread SMS");
        while(unreadSMS>=0){
            System.out.println(" Un read MSM : " + unreadSMS--);
        }
        System.out.println("No more unread MSM :)");
        }
}
