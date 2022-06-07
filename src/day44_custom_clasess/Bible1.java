package day44_custom_clasess;

public class Bible1 {
    private String verse;
    private int chapter;

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public int getChapter() {
        return chapter;
    }



    public void setChapter(int chapter) {
        this.chapter = chapter;

    }

    @Override
    public String toString() {
        return "Bible1{" +
                "verse='" + verse + '\'' +
                ", chapter=" + chapter +
                '}';
    }
}
