package day14_multi_branch_if_statment;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 5;
        if (selection == 1) {
            System.out.println("HELLO, THANK FOR YOUR CALL");
        } else if (selection == 2) {
            System.out.println("hello,gracias para llamar");
        } else if (selection == 3) {
            System.out.println("merhaba,");
        } else if (selection == 4) {
            System.out.println("priver");
        } else if (selection == 5) {
            System.out.println("merci");
        }else{
            System.out.println(" lets talk java");
        }
    }
}
