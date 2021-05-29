package day48_constructors_static.static_example;

public class CalculatorTest {
    public static void main(String[] args) {
        //add static method , can be called using classname.staticMethodName
        Calculator.add(5,3);
        Calculator calcObject = new Calculator();
        calcObject.multiply(2,4);

        calcObject.add(10,45);




    }
}
