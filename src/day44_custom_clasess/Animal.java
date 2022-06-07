package day44_custom_clasess;

public class Animal {

        String type ;

        public void eat(){
            System.out.println(type + " Eat ");

        }
        public void speak(){
            System.out.println(type+ " Speak ");
        }
        public void eat(String food){
            System.out.println("Eating " + food);
        }
        public void speak(String loud){
            System.out.println("Speak " + loud);
        }

    }


