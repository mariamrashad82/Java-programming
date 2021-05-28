package mariam_practice;

public class sumEvenNumber24 {
    public static void main(String[] args) {
        int count = 0;
        int evenNumber = 1;
        while(evenNumber < 101){
            if(evenNumber % 2 == 0){
                count += evenNumber ;

            }
            evenNumber++;

        }
        System.out.println("Sum of even number " +count);
    }
}
