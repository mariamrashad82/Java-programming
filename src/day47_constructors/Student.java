package day47_constructors;

public class Student {
    // no _ args constructor
    public Student(){
        System.out.println("No_Args constructors");
    }
//constructor overloaded with 1 param : String name
    public Student(String name){
        System.out.println("name param constructor | name " + name);

    }

public Student(int age){
    System.out.println("age param constructor | age " + age);
}
public Student(String name,int age){
    System.out.println("name & age param  : " + name + " :  " + age);
}

}
