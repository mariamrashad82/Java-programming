package day15_logicallops_switch_ternary;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("! true = " + (!true));
        System.out.println("! false = " + (!false));
        System.out.println("\n\n");

        int age = 5;
        if (!(age > 7)) {
            System.out.println("NEED TO SIT IN CAR SEAT");
        } else {
            System.out.println(" Do Not Need To Seat In Car Seat");
            System.out.println("\n\n");
        }


        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println(" NO SMOKING");
        }


        boolean isAffordable = false;
        if (!isAffordable) {
            System.out.println("Item is affordable");
        } else {
            System.out.println("item is not affordable");
            System.out.println("\n");
        }


        String env = "Qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong env");
            System.out.println("\n\n");
        }


        String carModel = "Honda";
        if (!carModel.equals("Tesla")) {
            System.out.println(" I am not interesting, No thank you! ");
            System.out.println("\n\n");
        }


        String secretPassword = "aaa123";
        String inputPassword = "aaa123";
        if (!inputPassword.equals("aaa123")) {
            System.out.println("Invalid password");
        }
        if (!inputPassword.equals(secretPassword)) {
            System.out.println(" Invalid Password");
        }
        if (inputPassword.equals("aaa123")) {
            System.out.println("Correct password");
        } else {
            System.out.println("TRY Again ");
         }

        }

    }
