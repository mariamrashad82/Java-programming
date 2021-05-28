package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        // 0        1        2          3        4       5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println("\n");
        System.out.println("____________FIND THE INDEX OF 'GLOVES' IN ITEMS ARRAY__________");
        //use for loop with condition
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                System.out.println(items[i] + " found in Index  " + i);
                break;// exit for loop

            }
        }
        System.out.println("\n");
        System.out.println("_______Set Boolean To True If First 'I PAD' is Found __________");
        boolean ipadIsFound = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("iPad")) {
                ipadIsFound = true;
                System.out.println("IPad Is Found " + ipadIsFound);
                break;
            }
        }

        if (ipadIsFound) {
            System.out.println("We bought the iPad!!");
        } else {
            System.out.println("We forgot the iPad! :(");
        }

        System.out.println("\n");
        System.out.println("------ Print a report of each shopping item ------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(" ( " + items[i] + " _$" + prices[i] + " _ #" + itemIDs[i] + " ) ");
        }

        System.out.println("__________LOOK FOR 'JAKET' IN ITEMS AND PRINT ALL DETAILS_________");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jacket")) {
                System.out.println(" ( " + items[i] + " - $" + prices[i] + " - #" + itemIDs[i] + " ) ");
                break;
            }

        }
        System.out.println("\n");
        System.out.println("__________LOOK FOR 'iphone 11 case' IN ITEMS AND PRINT ALL DETAILS_________");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("iphone 11 case")) {

                System.out.println(" ( " + items[i] + " - $" + prices[i] + " - #" + itemIDs[i] + " ) ");
            }
        }
        System.out.println("\n");
        System.out.println("__________LOOK FOR 'Shoes' IN ITEMS AND PRINT ALL DETAILS_________");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Shoes")) {

                System.out.println(" ( " + items[i] + " - $" + prices[i] + " - #" + itemIDs[i] + " ) ");

            }


        }
    }
}



// //(another idea)
//                // }
//                // }
//                // System.out.println("_______Set Boolean To True If First 'I PAD' is Found __________");
//                // boolean ipadIsExists = false;
//                // for (String item : items) {
//                //   if (items[i].equalsIgnoreCase("iPad")) {
//                //       ipadIsExists = true;
//                //        break;
//                //   }
//
//                // }
//                //System.out.println("IPad Is Found " + ipadIsExists);




