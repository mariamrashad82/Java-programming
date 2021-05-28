package day43_list_custom_classes;

public class Employee {
    //instance/object variable
    String Name;
    String jobTitle;
    String comp ;
    int age;
    char gender;
    //object methods behavior
    public void work() {
        System.out.println(Name +" Work as " + jobTitle);


    }
    public void location(){
        System.out.println(Name + " is working as " + jobTitle  + " working in our location in "+ comp);
    }
}
