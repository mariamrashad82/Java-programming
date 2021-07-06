package mariam_abstraction_practice.Bible;

public class Luke extends NewTestament implements Mark{
    @Override
    public void jesusMiracles() {
        System.out.println("Mark and peter has the same miracles");

    }

    @Override
    public void chapters(int chap) {
        System.out.println("Chapters " + chap);


        }


    @Override
    public void jesusProverbs() {

    }

    @Override
    public void verses() {
        System.out.println("jesus the son of god");
        Mark.super.verses();
    }
}
