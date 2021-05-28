package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source ="ABCDEFJHIGKLMNOPQRSTUVWXYZsghdcdjhcudg_!^%$*(&^^$@#";

        Random random = new Random();
        String password = "";

        for(int i = 1 ; i <= 8 ; i++){
            int index = random.nextInt(source.length());
            System.out.print(source.charAt(index));
            //password = password+ source.charAt()
            password += source.charAt(index);
        }
        System.out.println("\n your password : "+ password);

    }
}
