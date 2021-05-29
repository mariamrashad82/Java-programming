package day48_constructors_static;
import java.util.*;

public class BusObject {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver= new Driver("Abbas");
        bus.engine = new Engine(10);
        System.out.println(bus.toString());

        Bus metroBus =new Bus();
        metroBus.driver= new Driver("aziz");
        metroBus.engine = new Engine(15);

        System.out.println(metroBus);

        //print driver name of metroBus
        System.out.println(metroBus.driver.getName());


    }
}
