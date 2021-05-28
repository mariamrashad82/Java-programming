package day39_wrapper_classes;

public class ParseString_4 {
    public static void main(String[] args) {
        // String >> int
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "3455";
        double price = Double.parseDouble(strPrice);
        if (price > 100) {
            System.out.println("price Expensive " + price);
        }

              // split     1/ 2  /  3   / 4 / 5  /  6   / 7 / 8  / 9 /  10
        String sentence = "I love jesues 100 time because he loved me first";
        // split by space , parse index 2 to int
        String[]words = sentence.split(" ");
        int timeLove = Integer.parseInt(words[3]);
        System.out.println("time Love =  " + timeLove);
    }
}
