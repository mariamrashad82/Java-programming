package mariam_abstraction_practice.hollyweek;

public class HollyFeast {
    public static void main(String[] args) {
        OrthodoxHollyWeek ox = new PalmSunday();
        GoodFriday gf = new GoodFriday();
        PalmSunday ps = new PalmSunday();
        ResurrectionEvent event = new ResurrectionEvent();

        gf.pray();
        gf.Baskha();
        gf.fasting(12);
        System.out.println("in good friday we fasting "+ gf.fasting(6) + " hours");
        System.out.println("OrthodoxHollyWeek the most blessing week !");

        ps.pray();
        ps.Baskha();
        ps.fasting(6);
        System.out.println("in good friday we fasting " + ps.fasting(1) +" hours");
        System.out.println("Palm sunday has different hymns");

        event.celebrate();
        System.out.println("Jesus Is Risen ");

    }
}
