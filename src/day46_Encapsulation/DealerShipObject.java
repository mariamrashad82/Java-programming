package day46_Encapsulation;

public class DealerShipObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        // this is not working because model,year and mileage is private
       // car1.model = "Nissan Altima";
       // car1.year = 2020;
       // car1.mileage = 120;
        car1.setModel("Nissan Altima");
        System.out.println("car1.getModel() = " + car1.getModel());
        
        car1.setYear(2020);
        System.out.println("car1.getYear() = " + car1.getYear());
        
        car1.setMileage(125);
        System.out.println("car1.getMileage() = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1);

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo");
        alfaRomeo.setMileage(17655);
        alfaRomeo.setYear(2020);

        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("year = " + alfaRomeo.getYear());
        System.out.println("mileage = " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);



    }
}
