package mariamLoop;

public class ForLoop2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i+=5) {
            if(i==50)
               // break;
              continue;
            System.out.println("Odd num = " +i);

        }
    }
}
