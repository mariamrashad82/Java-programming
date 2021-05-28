package day13_conditional_statments;

import java.util.Scanner;

public class IfWithBooleanVariable {
    public static void main(String[] args) {

       boolean isHungry = false;
        //if (isHungry == true) {
        if (isHungry) {
        System.out.println("i am hungry " + isHungry+ " let eat and code java") ;
        }else {
        System.out.println(" iam not hungry, lets keep coding java" );
            System.out.println("\n");
    }
        double price = 130.44;
        boolean isAffordable = price >=100;
        if(isAffordable){
            System.out.println("is Affordable = " + isAffordable);
            if(isAffordable){
                System.out.println(" i can afford , lets buy !"); }
        }else {
            System.out.println("it is not Affordable, too expensive  " );

        }
        System.out.println("\n");

        boolean isRemoteJob = true;
        //if( isRemoteJob != true ){
            //if(isRemoteJob == false){

        if(!isRemoteJob ){
            System.out.println(" sure, i am interested");
        }else{
            System.out.println("sorry , i am not interested");
        }
    }
}
