package mariam_practice;

public class batchesIfNested2 {
    public static void main(String[] args) {
        String batch = "EU Batches";
        String Time = "Morning";

        if (batch.equals("US Batches")) {
            System.out.println("US batch selected :");
            if (Time.equals("Morning")) {
                System.out.println("Morning classes time are 10_5 EST. M,T,TH,Fr");

            } else if (batch.equals("US Batches") && Time.equals("Evening")) {
                System.out.println(" Evening classes time are 7_10 EST. M,T,W,TH,S,S");
            }
            } else if (batch.equals("EU Batches") && Time.equals("Morning")){

                    System.out.println("EU classes time are 10_5 EST. M,T,TH,Fr");


            }
        }
    }



