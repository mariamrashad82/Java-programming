package day34_void_methods;

public class StartCar3 {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        followYourGBS();
        followSpeedLimit();
    }
    public static void seatInCar() {
        System.out.println(" 1. Open The Door And Seat! ");
    }
    public static void startTheCar() {
        System.out.println(" 2. Start The Car And Goooo! ");
    }
    public static void shiftToDrive() {
        System.out.println(" 3. Shift your injection to Drive! ");
    }
    public static void followYourGBS() {
        System.out.println(" 4. Follow Your GBS! ");
    }
    public static void followSpeedLimit() {
        System.out.println(" 5. Follow Speed limit!");
    }
}