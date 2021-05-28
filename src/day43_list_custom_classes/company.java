package day43_list_custom_classes;

public class company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.Name = " Mariam Rashad ";
        employee1.jobTitle = "SDET";
        employee1.comp= " AMAZON ";
        employee1.age = 39;
        employee1.gender= 'F';
        employee1.work();
        employee1.location();
        System.out.println("employee1 = " + employee1.Name);
        System.out.println("employee1 = " + employee1.jobTitle);
        System.out.println("employee1 = " + employee1.comp);
        System.out.println("employee1 = " + employee1.age);
        System.out.println("employee1 = " + employee1.gender);
    }
}
