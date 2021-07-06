package mariam_abstraction_practice.Bible;

public class DisciplesTest {

    public static void main(String[] args) {

      Luke luke = new Luke();
      luke.jesusProverbs();
      luke.verses();
      luke.chapters(14);

      John john = new John();
      john.listen();
      john.read();
      john.jesusMiracles();

      Mark mark = new John();
      mark.jesusProverbs();
      mark.verses();

      NewTestament nt = new Mathew();
      nt.jesusMiracles();
      nt.chapters(44);
      nt.listen();
      nt.read();


      }








    }

