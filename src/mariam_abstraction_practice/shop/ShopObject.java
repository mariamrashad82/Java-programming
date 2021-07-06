package mariam_abstraction_practice.shop;

public class ShopObject {

    public static void main(String[] args) {
        Latte latte = new Latte();
        latte.cold();
        latte.hot();


        Espresso espresso = new Espresso();
        espresso.hot();
        espresso.cold();
    }
}
