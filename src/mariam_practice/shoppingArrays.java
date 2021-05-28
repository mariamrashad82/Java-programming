package mariam_practice;

public class shoppingArrays {
    public static void main(String[] args) {
        String[] items = {"shoes", "jacket", "gloves", "Airpods", "ipad", "iPhone"};
        double[] price = {99.9, 150.60, 310, 548, 19.99, 867};
        int[] itemIDs = {7565, 98876, 977, 76, 9877, 887};
        System.out.println("******* find the index of gloves *******");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                System.out.println(items[i] + " found in index " + i);
                break;
            }
        }
        System.out.println("******* boolean is true if u found ipad *******");
        boolean iPadIsFound = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("ipad")) {
                iPadIsFound = true;
                System.out.println("i pad is found " + iPadIsFound);
                System.out.println(items[i] + " " + iPadIsFound + " in index : " + i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println("------ Print a report of each shopping item ------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(" ( " + items[i] + " _$" + price[i] + " _ #" + itemIDs[i] + " ) ");
        }

        System.out.println("*********look for jaket all details********");
        for(int i = 0 ; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jackets")) {

                // break;


                System.out.println( " "+ items[i] + price[i] + itemIDs[i] + " ");
            }
        }
        }

    }
