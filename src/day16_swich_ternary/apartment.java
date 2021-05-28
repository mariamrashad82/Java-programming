package day16_swich_ternary;

public class apartment {
    public static void main(String[] args) {
        System.out.println("******Welcome to our apartment******");
        String apartmentStyle = "King";
        double roomNumber = 0.0;
        double price = 0.0;

        switch (apartmentStyle) {
            case "studio":
                roomNumber = 0;
                price = 1190;
                System.out.println("  Studio Style");
            break;
            case "Colonade":
                roomNumber = 1;
                price = 1490;
                System.out.println("  Colonade Style");
            break;
            case "Queen":
                roomNumber = 2;
                price = 1790;
                System.out.println(" Queen Style");
            break;
            case "King":
                roomNumber = 3;
                price = 2190;
                System.out.println(" King Style");
            break;
            default:
                System.out.println( apartmentStyle + "Style Not Available");
                break;

        }
        System.out.println("Total price : $" + price);
        System.out.println("Room Number:" + roomNumber  );
        }
}

