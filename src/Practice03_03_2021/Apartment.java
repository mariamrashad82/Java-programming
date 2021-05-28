package Practice03_03_2021;

public class Apartment {
    public static void main(String[] args) {
        String desc1 = " **********PALM TREE APARTMENT**********";
        String desc2 = "Thank you for your interest to our apartment complex";
        String address = " 6700 HOLLOW OAK LANE CENTREVILLE, VA ,20121 ";
        String nameOwner  = " James Lokas";
        byte numOfUnit = 10;
        float averageSizeOfEachUnit = 1085F;
        double monthlyRent = 1850 ;
        byte numberOfWasherAndDriers = 20;
        boolean allowsPets = true;
        boolean hasPool = true;
        String lengthOfLease = " 12 month";
        byte totalNumberOfResidentsInBuilding = 80;
        long phoneNumberOfOwner = 4043333333L;
        boolean isNearAGasStation = true;
        byte numberOfFloors = 3;
        boolean hasABasementHasAvailableUnitsForRent = true;
        boolean isAirConditioning = true;
        long numberOfParkingSpaces = 300;
        boolean hasWheelChairAccess = true;
        double reviewStars = 4.7;
        double averageRentAfter3Years= monthlyRent - (monthlyRent % 10);
        double averageRentAfter6Years= monthlyRent - (monthlyRent % 20);
        double averageNumberOfResidentPerUnit = totalNumberOfResidentsInBuilding / numOfUnit;
        double averageNumberOfParkingSpotsPerUnit = numberOfParkingSpaces / numOfUnit ;
        double AverageNumberOfUnitsPerFloor = numOfUnit / numberOfFloors;
        System.out.println("\t\t\t\t\t\t\t\t"+ desc1);
        System.out.println(desc2);
        System.out.println("address is : \t\t\t\t\t\t\t" + address);
        System.out.println("Owner Name : \t\t\t\t\t\t\t" + nameOwner);
        System.out.println( "Number Of Unit Is : \t\t\t\t\t\t" + numOfUnit );
        System.out.println("Average Size Of Each Unit :\t\t\t\t\t" +averageSizeOfEachUnit );
        System.out.println("Monthly Rent : \t\t\t\t\t\t\t\t" + monthlyRent + "$");
        System.out.println("Number Of Washer And Driers : \t\t\t\t" + numberOfWasherAndDriers);
        System.out.println( "Allows Pets : \t\t\t\t\t\t\t\t" + allowsPets );
        System.out.println( "Has Pool : \t\t\t\t\t\t\t\t\t" + hasPool);
        System.out.println( "lengthOfLease :  \t\t\t\t\t\t\t" + lengthOfLease);
        System.out.println( "phone Number Of Owner : \t\t\t\t\t" + phoneNumberOfOwner);
        System.out.println("is Near A Gas Station : \t\t\t\t\t " + isNearAGasStation);
        System.out.println( "Review Stars : \t\t\t\t\t\t\t\t " +   reviewStars );
        System.out.println( "average Rent After 3 Years : \t\t\t\t " + averageRentAfter3Years);
        System.out.println( "average Rent After 6 Years : \t\t\t\t " + averageRentAfter6Years);
        System.out.println( "average Number Of Resident Per Unit : \t\t" +averageNumberOfResidentPerUnit );
        System.out.println( "average Number Of Parking Spots Per Unit :\t" +averageNumberOfParkingSpotsPerUnit);
        System.out.println( "Average Number Of Units Per Floor : \t\t" + AverageNumberOfUnitsPerFloor);
        System.out.println("Has A Basement Has Available Units For Rent : " + hasABasementHasAvailableUnitsForRent);
        System.out.println( "Is Air Conditioning :\t\t\t\t\t\t" + isAirConditioning);
        System.out.println("Has Wheel Chair Access :\t\t\t\t\t" + hasWheelChairAccess);





















    }
}
