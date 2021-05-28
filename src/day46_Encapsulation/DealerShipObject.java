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

        Car alfaromio = new Car();
        alfaromio.setModel("Alfa Romio");
        alfaromio.setMileage(17655);
        alfaromio.setYear(2020);

        System.out.println("Model = " + alfaromio.getModel());
        System.out.println("year = " + alfaromio.getYear());
        System.out.println("mileage = " + alfaromio.getMileage());
        System.out.println(alfaromio);



    }
}
