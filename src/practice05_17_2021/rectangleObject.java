package practice05_17_2021;

import practice03_08_2021.Rectangle;

public class rectangleObject {
    public static void main(String[] args){
        RectangleTask rectangle = new RectangleTask();
        System.out.println( rectangle.getArea());
        rectangle.setDimensions(5,3);
        System.out.println( "rectangle.getArea = " + rectangle.getArea());
        System.out.println(" rectangle = " +rectangle);

        RectangleTask rectangle2 = new RectangleTask();
        System.out.println("rectangle2 = " + rectangle2.getArea());
        rectangle2.setDimensions(2,10);
        System.out.println("rectangle2 = " + rectangle2.getArea());

       }
    }

