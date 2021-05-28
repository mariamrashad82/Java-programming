package mariam_practice;

public class SportFee2 {
    public static void main(String[] args) {
        String sport = "soccer";
        int fee = 100;
        fee =(sport.equals("soccer"))||(sport.equals("tennis")) ? 100: 50;
        System.out.println(fee);
    }
}
