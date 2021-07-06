package mariam_abstraction_practice.shop;

public class Espresso extends menu {
    @Override
    public void hot() {
        System.out.println("our shop serve hot Espresso");
    }

    @Override
    public void cold() {
        System.out.println("our shop serve cold Espresso");

    }
}
