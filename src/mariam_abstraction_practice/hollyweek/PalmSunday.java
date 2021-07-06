package mariam_abstraction_practice.hollyweek;

public class PalmSunday extends OrthodoxHollyWeek implements EasterDay{

    @Override
    public void Baskha() {
        System.out.println("Basha start after palm sunday");

    }

    @Override
    public int fasting(int hours) {
        System.out.println("we fasting 7 hour" + hours);
        return hours * 7 ;
    }

    @Override
    public void EggHunt() {

    }

    @Override
    public void Dinner() {
        EasterDay.super.Dinner();
    }
}
