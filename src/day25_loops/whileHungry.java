package day25_loops;

public class whileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        //while(isHungry ||bananas != countToFull);
        while (isHungry) {
            bananas++;
            System.out.println("Eating bananas = " + bananas);
            //isHungry = bananas == countToFull ? false: true;
            if (bananas == countToFull){
               isHungry= false;
            }
        }
        System.out.println("Im full, i had "+bananas +" bananas");

        }
    }

