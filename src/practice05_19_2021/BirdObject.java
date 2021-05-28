package practice05_19_2021;

public class BirdObject {
    public static void main(String[] args) {
        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();
        // birdOne.canFly; -> don't compile
        birdOne.setCanFly(true);
        System.out.println(birdOne.canFly());
        birdTwo.setBeakLength(-1);
        System.out.println(birdTwo.getBeakLength());

    }

}

