package mariam_practice;

public class EvenNumber24 {
    public static void main(String[] args) {
        int count = 0;
        int evenNumber = 0;
        while(evenNumber < 100){
            if(evenNumber % 3 == 0 && evenNumber % 5 ==0 && evenNumber % 2 == 0 ){
                count += evenNumber ;

            }
            evenNumber++;

        }
        System.out.println("Sum of even number " +count);
    }

}
