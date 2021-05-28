package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
         for (int stars = 1; stars <= 5; stars++) {
        System.out.print("___***___" );//3)


        //for(int num = 5; num >= 0 ; num--){
        //System.out.println("num = " + num);
    }
        System.out.print("\n");

    String myStars = " ";
        for(int i = 0; i < 5 ; i++){
        myStars = myStars + "___***___";
        //myStars+="* "
    }

        System.out.print("myStars : " + myStars.trim());// trim() help to organize speace
}

}


