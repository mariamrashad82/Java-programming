package mariam_practice;

public class GivenTwoStringFirstAndLastName {
    public static void main(String[] args) {
        String fullName = "james bond";
        String lastName = "bond";
        if(fullName.contains(lastName)){
            System.out.println("same last name");
        }else{
            System.out.println("Not the same last name ");
        }
    }
}
