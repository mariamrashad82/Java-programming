package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        //creat traffic light object

        TrafficLight_1 trafficLight = new TrafficLight_1();
      //  trafficLight.color = "red"; not use this way
        trafficLight.changeColor("red");
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight_1 trafficLight2 = new TrafficLight_1();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();



    }
}
