package day43_list_custom_classes;

public class PersonMain {// our class name person has 2 variable string name,int age
    String firstName;
    int age ;
    char gender;
    public void speak(){
        System.out.println("person is speaking Eng");
    }

    }
    class people {
    public static void main(String[]args){

        //person-3 it is class  has 2 object person1 , person2
        PersonMain person1 = new PersonMain();
        person1.firstName = "Atef";
        person1.age=33;
        person1.gender='M';
        person1.speak();

        System.out.println("Person 1 first name : " + person1.firstName);
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);





        PersonMain person2 = new PersonMain();
        person2.firstName = "Ghali";
        person2.age= 44;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);






    }

    }


