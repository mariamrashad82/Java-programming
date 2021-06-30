package day56_abstraction.driveable;

public interface SelfDrivable {
    void autoPiloting();
    //void selfPark(); this causes error in sub classes, because they must override abstract method
    public default void selfPark() { //if we add default method, it will prevent errors
        System.out.println("performing self park steps");
    }
}
