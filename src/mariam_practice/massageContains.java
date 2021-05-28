package mariam_practice;

public class massageContains {
    public static void main(String[] args) {
        String massage= "Studying java a lot is dumb ";
        if(massage.contains("heck")||(massage.contains("dumb")|| massage.contains("idiot"))){
            System.out.println("massage not sent");
        }else{
            System.out.println(" massage sent");
        }
    }
}
