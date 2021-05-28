package day15_logicallops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "MOSCO";
        if (city.equals("MOSCO") || city.equals("TAMPA")) {
            System.out.println("willing to relocate to " + city);
        } else {
            System.out.println("not considering_  " + city);
            System.out.println("\n");
        }

        //String city = "MOSCO";
        // if (city.equals("MOSCO") && city.equals("TAMPA")) { // false
        //System.out.println("willing to relocate to " + city);
        //} else {
        //System.out.println("not considering_  " + city);
        //System.out.println("\n");

        String teacher = "NADIR";
        if (teacher.equals("Saim") || teacher.equals("Moradil")) {
            System.out.println(" we have good java class " + teacher);
        } else {
            System.out.println(" Soft skills class with " + teacher);
        }
        if (teacher.equals("Saim") && teacher.equals("Moradil")) {
            System.out.println(" we have good java class" + teacher);
        } else if (teacher.equals("NADIR")) {
            System.out.println("soft skill class with " + teacher);
        } else {
            System.out.println("some other class with " + teacher);
            System.out.println("\n");
        }
        String company = "GOOGLE";
        double salary = 100000;
        if (company.equals("GOOGLE") || salary >= 100000) {
            System.out.println(" I accept offer from " + company);
        } else {
            System.out.println(" Reject offer from " + company);
            System.out.println("\n");
        }
        String company2 = "NADER TECH";
        if (company.equals("NADER TECH") && salary >= 100000) {
            System.out.println(" I accept offer from " + company2);
        } else {
            System.out.println(" Reject offer from " + company2);
        }
    }
}