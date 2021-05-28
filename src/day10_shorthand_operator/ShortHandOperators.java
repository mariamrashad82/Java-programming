package day10_shorthand_operator;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars =10;
        System.out.println("cars in parking lot = " + cars);
        // 2 people came
        cars = cars + 2;
        System.out.println("cars in parking lot = " +  cars );
        cars += 5;
        System.out.println("cars in parking lot = "  + cars);
        //6 cars left
        // cars = cars - 6;
        cars -=6;
        System.out.println("cars in parking lot = " + cars);
        cars = cars - 1;
        cars -=1;
        System.out.println("cars in parking lot = " + cars);
        // increase electric cars
        int electricCars = 13;
       // cars = cars + electricCars;
        cars += electricCars;
        System.out.println("parking with electricCars = " +cars + "\n");
        /////////////string
        String word = "java";
        System.out.println("word = " + word);
        word = word +" programming";
        System.out.println("word = " + word);
        // add "is fun"
        word +=" is fun";
        System.out.println("word = " + word);
        String selenium = "but \" selenium\"  more fun.";
        word += selenium;
        System.out.println("word = " + word);
        word +=12345;
        System.out.println("word = " + word + "\n");
        //char
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter +=3;
        System.out.println("letter = " + letter);
        // add 'j' to letter
        letter += 1;
        System.out.println("letter = " + letter + "\n");
        double parkingFee = 7.50;
        System.out.println("parkingFee = " + parkingFee);
        // early bird fee is 50 0ff
        // parkingFee = parkingFee / 2
        parkingFee /= 2;
        System.out.println("early bird parkingFee = " + parkingFee);
        parkingFee -= parkingFee; //  parkingFee = parkingFee - parkingFee
        System.out.println("weekend parkingFee free  = " + parkingFee);

                          


        
    }
}
