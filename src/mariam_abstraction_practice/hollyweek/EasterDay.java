package mariam_abstraction_practice.hollyweek;

public interface EasterDay {

    public void EggHunt();

    public default void Dinner(){
        System.out.println("Dinner together");


    }
}
