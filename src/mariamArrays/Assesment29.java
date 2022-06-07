package mariamArrays;

public class Assesment29 {
    public static void main(String[] args) {
        String z = "popcorn";
        z = z.substring(1,8);
        if(z.equals("opcor")){
            System.out.println(z.length());
        }else {
            System.out.println(z.replace("o,","a"));
        }
    }
}
