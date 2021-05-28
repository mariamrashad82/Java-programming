package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String UserName = "CYBERTEK";
        String password = "Abc123";
        if (expUserName.equalsIgnoreCase(UserName) &&expPassword.equals(password)) {
            System.out.println("pass- user logged in successfully " );
        }else{
            if(!expUserName.equalsIgnoreCase(UserName)){
                System.out.println("Invalid UserName");
            }else{
                System.out.println("Invalid Password");
            }
        }
    }

}

// if(city.equals("chicago")) {
//            System.out.println("equals() true");
//        }else{
//            System.out.println("equals() false");