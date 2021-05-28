package mariam_practice;

public class batchesIfNested {
    public static void main(String[] args) {
        String batch = "US Batches";
        String Time = "Morning";

        if (batch.equals("US Batches") && Time.equals("Morning")) {
            System.out.println("Morning classes time are 10_5 EST. M,T,TH,Fr");
            if (batch.equals("US") && Time.equals("Evening")) {
                System.out.println("Evening classes time are 7_10 EST. M,T,W,TH,S,S");

            } else if (batch.equals("EU") && Time.equals("Morning")) {
                System.out.println("classes time are 10_5 EST. M,T,TH,Fr");
            }
            } else {
                System.out.println("Invalid Time");
            }
        }
    }
