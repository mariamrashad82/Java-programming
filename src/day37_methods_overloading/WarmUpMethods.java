package day37_methods_overloading;

public class WarmUpMethods {
    public static void main(String[] args) {
        loginVoid("mariamCybertek", "Many1234");//positive
        loginVoid("mariamCybertek", "mariam");//negative
        loginVoid(" "," ");//negative

    }

    public static void loginVoid(String username, String password) {

        String secretUsername = "mariamCybertek";
        String secretPassword = "Many1234";


        if (username.equals(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login Successful, welcome to Cybertek!");
        } else {
            System.out.println("Invalid please try again");
        }






        }


    }


