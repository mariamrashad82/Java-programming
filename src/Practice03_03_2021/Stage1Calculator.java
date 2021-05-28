package Practice03_03_2021;

public class Stage1Calculator {
    public static void main(String[] args) {
        double numOne = 5.0;
        double numTwo = 10.0;
        double addition = numOne + numTwo;
        double subtraction = numOne - numTwo ;
        double multiplication = numOne * numTwo;
        double division = numOne / numTwo;
        double remainder = numOne % numTwo;
        System.out.println("calculate for " + numOne + " & " + numTwo);
        System.out.println( numOne + " + " + numTwo + " = " + addition );
        System.out.println( numOne + " - " + numTwo + " = " + subtraction  );
        System.out.println( numOne + " * " + numTwo + " = " + multiplication  );
        System.out.println( numOne + " / " + numTwo + " = " + division  );
        System.out.println( numOne + " % " + numTwo + " = " + remainder );
        // new practice
        System.out.println("calculate for " + numOne + " & " + numTwo);
        System.out.println( numOne + " + " + numTwo + " = " + (numOne + numTwo) );
        System.out.println( numOne + " - " + numTwo + " = " +  (numOne - numTwo)  );
        System.out.println( numOne + " * " + numTwo + " = " +  (numOne * numTwo)  );
        System.out.println( numOne + " / " + numTwo + " = " +  (numOne / numTwo)  );
        System.out.println( numOne + " % " + numTwo + " = " + (numOne % numTwo)  );


    }
}
