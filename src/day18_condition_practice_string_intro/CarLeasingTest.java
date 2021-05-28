package day18_condition_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {

        // String make = "Mercedes";
        //String model ="E";
        // double leasePrice = 0.0;

        //if(make.equals("Mercedes") && model.equals("A")) {
        //   leasePrice = 400;
        //}else if(make.equals("Mercedes") && model.equals("A")){
        // leasePrice = 600;
        //}
        // System.out.println(" make =" + make );
        // System.out.println(" model =" + model );
        //System.out.println( " lease price =" + leasePrice  );
        String make = "Honda";
        String model = "A";
        double leasePrice = 0.0;


        if (make.equals("Honda")) {
            if (model.equals("E")) {
                leasePrice = 500;
            }

            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("Lease Price " + leasePrice);
        }

    }

}
