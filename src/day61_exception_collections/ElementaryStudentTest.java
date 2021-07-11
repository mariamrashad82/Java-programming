package day61_exception_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(1);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace();// print the error and continue
        }

        System.out.println("________EXECUTION COMPLETE______");

        throw new BreakTimeException();
    }
}
