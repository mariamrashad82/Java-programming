package mariam_abstraction_practice.shop;

public class Latte extends menu{
    @Override
    public void hot() {
        System.out.println("our shop serve hot latte");
    }

    @Override
    public void cold() {
        System.out.println("our shop serve cold latte");

    }
}
