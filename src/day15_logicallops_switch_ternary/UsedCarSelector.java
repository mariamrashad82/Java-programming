package day15_logicallops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000;
        double carPrice = 4500;
        String model = "Toyota";
        if(budget >= carPrice && model== "Toyota" || model=="Honda" || model== "Tesla"){
            System.out.println("READY TO BUY MODEL = " + model + " price = " + carPrice);
        }
    }
}
