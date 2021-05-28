package day09_Scanner_Practice;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class speedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter current speed ! ");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overTheLimit = currentSpeed -  speedLimit;
        System.out.println( "you are driving " + overTheLimit + " mph over the speed . slow down!");
    }
}
