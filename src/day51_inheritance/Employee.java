package day51_inheritance;

public class Employee extends Object{
    String jobTitle;

    public double calculateSalary(double hourlyRate) {
        return 52 * 40 * hourlyRate * 1.1;
    }

    //toString method is inherited from Object class
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }


}
