package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = " KIA ";
        String driverName = " MARIAM ";
        String licenseNum = "8764 ";
        short speed = 55;
        boolean isAutomatic = true;
        char licenceClass = 'D';

        System.out.println("Car Model:\t\t\t\t\t" +"\""+ carModel+"\""+ "\n" + "Driver Name:\t\t\t\t" +"\""+ driverName +"\"" + "\n" + "License Num:\t\t\t\t" +licenseNum
        +"\n" + "Current Speed is:\t\t\t" + speed + " mph " + "\n" + "Is Automatic:\t\t\t\t" + isAutomatic +"\n" + "licence Class:\t\t\t\t" +licenceClass  );

        System.out.println("\"" + driverName + "is driving car model" + carModel +"\"" );

    }


}
