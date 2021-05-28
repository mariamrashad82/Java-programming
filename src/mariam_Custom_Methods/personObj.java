package mariam_Custom_Methods;

public class personObj {
    public static void main(String[] args) {
        person pre1 = new person();
        pre1.name = "Mariam";
        pre1.age = 39;
        pre1.gender = 'F';
        pre1.job = "SDET";

        pre1.cv1();
        pre1.run();
        pre1.runMiles(50);
        pre1.burnCalory();
        pre1.burnCaloryWithMile(20);


        person per2 = new person();
        per2.name="Nancy";
        per2.age=40;
        per2.gender='F';
        per2.job="SDET";
        per2.cv2();
        per2.swim();

    }
}
