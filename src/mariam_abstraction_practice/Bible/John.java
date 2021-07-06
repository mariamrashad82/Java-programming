package mariam_abstraction_practice.Bible;

public class John  extends NewTestament implements Mark{


    @Override
    public void jesusMiracles() {
        System.out.println("Mark and peter has the same miracles");


    }

    @Override
    public void chapters(int chap) {
        System.out.println("Mark has 24 chapters and Luke has 24 chapters  " );

    }

    @Override
    public void jesusProverbs() {

    }

    @Override
    public void verses() {
        Mark.super.verses();
    }
}

