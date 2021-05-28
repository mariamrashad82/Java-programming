package MariamMethods;

public class voidMethod {
    public static void main(String[] args) {

        for(int i = 0 ; i< 4 ; i++){
            printAToZ();
        }
        displayUsFlag();

    }
    public static void printAToZ(){
        for(char i = 'A' ; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void displayUsFlag(){
        System.out.println("************** Flag Of USA*************");
        String p1 = " * * * * * =========================\n * * * * * =========================";
        String p2 = " ====================================";
        for(int i = 0 ; i<4;i++){
            System.out.println(p1);
        }
        System.out.println(p1);
        for(int i =0;i<6;i++){
            System.out.println(p2);
        }
    }
}
