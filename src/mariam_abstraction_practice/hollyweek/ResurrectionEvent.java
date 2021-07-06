package mariam_abstraction_practice.hollyweek;

public class ResurrectionEvent extends EasterEve {

    @Override
    public void celebrate() {
        System.out.println("jesus is Risen");
    }

    @Override
    public void Baskha() {
        System.out.println(" Baskha is end we start to resurrection  ");

    }

    @Override
    public int fasting(int hours) {
        return hours * 3;
    }
}
