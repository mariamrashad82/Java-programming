package day34_void_methods;

public class FirstMethods1 {
    public static void main(String[] args) {
        displayMessage(); //1st call the method
        displayMessage(); //2nd call to method
        displayMessage();

        for(int i = 1; i <= 100; i++) {
            System.out.print(i +" - ");
            displayMessage();
        }

    }

    //first custom reusable method
    public static void displayMessage() {

        System.out.println("Hello B22 Friends!");
    }
}



