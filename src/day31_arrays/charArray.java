package day31_arrays;

public class charArray {
    public static void main(String[] args) {
        char[] charLetter = {'j' , 'a' , 'v' , 'a' , ' ' , 'i' , 's' , ' ' , 'f' , 'u' , 'n'};
        //print each letter using a loop
        for(char each : charLetter) {
            System.out.print(each + " ");
        }

        System.out.println("\n");
        String sentence = new String(charLetter);
        System.out.println("\nsentence = " + sentence);


        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("\n itemArray.length = " + itemArray.length);
        System.out.println("\n item.length() = " + item.length());


        System.out.println("\n");
        //  0            1         2       3       4         5
        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};

        //"bananas-apples-kiwi-mango-papaya-strawberry-"
        String fruitStr = "";

        for(String each : fruits) {
            System.out.print(each +"-");
            fruitStr += each + "-";
        }
        System.out.println("\nfruitStr = " + fruitStr);

        System.out.println("\n");
        String[] languages = {"java", "python" , "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join(" " ,languages));
        System.out.println(String.join(" ## ",languages));
        String joinedLanguages = String.join(" <> " , languages);
        System.out.println("joinedLanguages = " + joinedLanguages);
    }
}



