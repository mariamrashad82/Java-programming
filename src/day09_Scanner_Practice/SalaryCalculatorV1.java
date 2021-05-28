package day09_Scanner_Practice;

public class SalaryCalculatorV1 {
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weekly = hourlyRate * 40;
        int monthly = weekly * 52/12;
        int yearly = monthly * 12;
        System.out.println(" weekly pay is : " + weekly );
        System.out.println(" monthly pay is : " + monthly );
        System.out.println(" yearly pay is : " + yearly );
    }
}
