package day60_exception;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("Lets creat exception");
     //   RuntimeException e = new RuntimeException();
     //   throw e;

     //   throw new RuntimeException();
        String userName = "";
        if(userName.isEmpty()){
            throw new RuntimeException("UserName cannot be empty");
        }

    }
}
