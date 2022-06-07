package mariamArrays;

public class Assesment28 {
    public static void main(String[] args) {
        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);
        int ind1 = s.indexOf("game");
        int ind2 = s2.indexOf("game");
        if (ind1==ind2){
            System.out.println(ind1);
        }else {
            System.out.println(ind2);
        }
    }
}
