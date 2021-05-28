package mariam_practice;

public class addressIsEmpty {
    public static void main(String[] args) {
        String address = "9758 emmanuel court fair fax virginia";
        if(address.isEmpty()){
            System.out.println("No address found");
        }else{
            System.out.println("correct address");
        }
        if(!address.isEmpty()){
            System.out.println(address.toUpperCase());
        }
    }
}
