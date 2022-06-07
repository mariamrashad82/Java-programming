package day44_custom_clasess;

import mariamArrays.NewQuiz;

public class Mark {
    public static void main(String[] args) {
        Bible1 mark = new Bible1();
        mark.setVerse("God is love");
        System.out.println(mark.getVerse());

        mark.setChapter(15);
        System.out.println(mark.getChapter());

        System.out.println(mark.toString());

    }
}
