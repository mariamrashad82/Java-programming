package mariam_practice;

public class SportFee1 {
    public static void main(String[] args) {
        String sportKind="soccer";
        double fee1 = 100;
        double fee2 = 50;
        if(sportKind.equals("soccer")){
            System.out.println("Entrance fee for soccer= $"+fee1);
            if(sportKind.equals("tennis")) {
                System.out.println("Entrance fee for tennis= $" + fee1);
            }
            }else {
                System.out.println("the fees for any other game= $"+fee2);
            }
        }
    }

