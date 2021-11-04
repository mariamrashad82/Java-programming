package day54_abstraction.student;

public class CampusStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Campus student is attending the class in person");
    }
}
