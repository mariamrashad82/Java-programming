package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {
    //constants
    public static final String TYPE = "interface";
    double MAX_COUNT = 500; //this is also public static final

    /**
     * ERROR: Interfaces CANNOT have constructors
     public InterfaceA() {
     System.out.println("constructor is not welcome in Interface");
     }
     */
    public abstract void absMethodD(int num);

    /**
     * starting from Java 8 (jdk 1.8)
     * interface can have static and default methods
     */
    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " + str);
    }

    public default void defaultMethodF() {
        System.out.println("defaultMethodF is called");
    }
}
