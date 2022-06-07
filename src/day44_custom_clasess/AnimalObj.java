package day44_custom_clasess;

public class AnimalObj {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.type="Dog";
        System.out.println(animal.type);
        animal.eat();

        animal.eat("grass");

        animal.speak();

        animal.speak();

        //creat new animal object
        Animal catsObj = new Animal();
        catsObj.type = "Cat";
        System.out.println(catsObj.type);
        catsObj.eat("milk");
    }
}





