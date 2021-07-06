package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.polymorphism.shapes.Square;
import day57_abstraction_polymorphism.polymorphism.shapes.Shape;


public class InstanceOf {
    public static void main(String[] args) {

 Shape shape = new Square();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        if(shape instanceof Circle){
            System.out.println("it is circle object");
        }else if(shape instanceof Square){
            System.out.println("It is square object");
        }
        System.out.println(shape.getClass().getSimpleName());// just class name
        System.out.println(shape.getClass().getName());

        if(shape.getClass().getSimpleName().equals("Square")){
            System.out.println("It is a square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println( "object class name of el variable = " + el.getClass().getSimpleName());
        System.out.println(el.getClass().getDeclaredFields().getClass().getName());


    }
}
