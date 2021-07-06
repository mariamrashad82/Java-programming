package mariam_abstraction_practice.Bible;

public class Mathew extends NewTestament implements Mark{

    @Override
    public void jesusMiracles() {
        System.out.println("Mathew has 5 jesus miracles");

    }

    @Override
    public void chapters(int chap) {
        System.out.println("Mathew ha 24 chapter" + chap);

    }

    @Override
    public void jesusProverbs() {

    }

    @Override
    public void verses() {
        System.out.println("God is love");
        Mark.super.verses();
    }
}
