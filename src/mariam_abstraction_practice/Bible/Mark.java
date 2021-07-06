package mariam_abstraction_practice.Bible;

public interface Mark {

   public void jesusProverbs();

   public default void verses(){
        System.out.println("Mark has a lot of good Verses");

    }
}
