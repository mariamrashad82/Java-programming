package mariam_abstraction_practice.hollyweek;

public class GoodFriday extends OrthodoxHollyWeek implements EasterDay{
    @Override
    public void Baskha() {
        System.out.println("Good Friday Baskha it is good time to be in heaven");

    }

    @Override
    public int fasting(int hours) {
        System.out.println("We fasting 12 hours" + hours);
        return hours * 2;
    }

    @Override
    public void EggHunt() {

    }

    @Override
    public void Dinner() {
        EasterDay.super.Dinner();
    }
}
