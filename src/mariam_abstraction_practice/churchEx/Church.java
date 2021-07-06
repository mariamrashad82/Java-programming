package mariam_abstraction_practice.churchEx;

public class Church {
    public static void main(String[] args) {
        Retreat retreat = new Retreat();
        retreat.meeting();


        SundaySchool sundaySchool = new SundaySchool();
        sundaySchool.meeting();
        sundaySchool.pray("Bible");



    }
}
