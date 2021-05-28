package mariam_practice;

public class NeedHelpLoop {
    public static void main(String[] args) {
        //Java textbook By Murodil. Chapter 1 datatypes and variables.
        // Chapter 2 conditional statements. chapter 3 String manipulation. Chapter 4 Loops.
        // Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. chapter 8 instance and static.
        // Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism.
        // Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more.14 Chapters -> value of the book: 140

        String []book = {"Chapter 1 datatypes and variables.Chapter 2 conditional statements.chapter 3 String manipulation." +
                " Chapter 4 Loops.Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList.chapter 8 instance and static.\n" +
                "        // Chapter 9 Constructors. Chapter 10 Encapsulation and Inheritance. Chapter 11 Abstraction and Polymorphism. \n" +
                "        // Chapter 12 Exceptions. Chapter 13 Collections. Chapter 14 Learn more. "};

        int chPrice = 10;
        int chaptersCount = 0;
        int value=0;

        for (String chapters: book) {
            if (chapters == book[book.length] ) {
                System.out.println(chapters);
             //  value= chaptersCount * chPrice;
               // chaptersCount++;


            }
           // System.out.println("value = " + value);



        }


    }
}