package day51_inheritance.super_keyword;

public class Lux extends Lyft{
    @Override
    public double calculateRate(double miles) {
        //     calculateRate of Lyft + plus 20 percent
        return super.calculateRate(miles) * 1.2;
    }
}
