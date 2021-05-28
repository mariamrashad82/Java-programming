package mariam_practice;

public class usernameAndPassword {
    public static void main(String[] args) {
        String userName = "many mano";
        String password = "many";
        if (password.length() <= 5) {
            System.out.println("password can not be less than 5");
        }else{
            System.out.println("valid password");

        }
        if (!password.contains(userName)) {
                System.out.println("invalid password ,username should not be in it");
            } else {
                System.out.println("valid username");

        }


    }



}


