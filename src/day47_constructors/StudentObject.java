package day47_constructors;

public class StudentObject {
    public static void main(String[] args) {
        Student st1 =new Student();
        Student st2 =new Student();

        Student st3 =new Student("Mariam");
        Student st4 =new Student("Marvi");

        Student st5 =new Student(39);
        Student st6 =new Student("Mariam",39);
    }
}
