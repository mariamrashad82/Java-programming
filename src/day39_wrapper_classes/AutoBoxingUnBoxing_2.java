package day39_wrapper_classes;

public class AutoBoxingUnBoxing_2 {
    public static void main(String[] args) {
        // auto_boxing : Primitive > OBJECT
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;

        // Un_boxing : Object > primitive
        Double d1 = new Double(100.0); // Wrapper class always uppercase
        double d2 = d1;
        double d3 = new Double(345.5);


    }
}
