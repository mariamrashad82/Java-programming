package day15_logicallops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location= "fair fax";
        double salary = 75000;
        boolean hasBenefits = true;
        boolean isRemote = true;
        if(location.equals("fair fax") && salary==75000 && hasBenefits && isRemote){
            System.out.println(" i accept your offer");
        }else{
            System.out.println(" keep looking");
        }
    }
}
