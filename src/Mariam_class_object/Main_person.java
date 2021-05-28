package Mariam_class_object;

public class Main_person {
    String fullName;
    int age;
    char gender;
    boolean married;
    public void learn(){
        System.out.println(fullName+" is learning Java");
    }
    public void playSoccer(){
        System.out.println(fullName + " playing soccer ");
    }

}
class people {
    public static void main(String[]args){
        Main_person person1 = new Main_person();
        person1.fullName="Mariam Rashad";
        person1.age = 39;
        person1.gender = 'F';
        person1.married=true;
        person1.learn();
        person1.playSoccer();
        System.out.println("person1 = " + person1.fullName);
        System.out.println("person1 = " + person1.age);
        System.out.println("person1 = " + person1.gender);
        System.out.println("person1 = " + person1.married);

        
        Main_person person2 = new Main_person();
        person2.fullName="Marvi Reyad";
        person2.age= 16;
        person2.gender='F';
        person2.married=false;
        person2.playSoccer();
        person2.learn();
        System.out.println("person2 = " + person2.fullName);
        System.out.println("person2 = " + person2.age);
        System.out.println("person2 = " + person2.gender);
        System.out.println("person2 = " + person2.married);


    }

}
