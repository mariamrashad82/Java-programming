package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKid();
        //spMan1.work("SDET"); //ERROR- spMan1 is Father type can only access methods in father
        Worker spMan2 = new SuperMan();
        spMan2.work("SDET");
        System.out.println( "got paid $" + spMan2.getPaid() );
        //spMan2.raiseKid(); ERROR

        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("Scrum Master");
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.raiseKid();

    }
}
