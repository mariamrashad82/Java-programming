package day56_abstraction.driveable;

public abstract class Transportation {
    public abstract void transportPeople();
    public abstract void cost(int mile);
    public void start() {
        System.out.println("Starting the engine");
    }
    public void stop() {
        System.out.println("Shut off the engine");
    }
}
