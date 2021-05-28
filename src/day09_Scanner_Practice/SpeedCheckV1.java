package day09_Scanner_Practice;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 75;
        int overTheLimit = currentSpeed - speedLimit ;
        System.out.println(" you are driving _" +  overTheLimit + "mph please slow down");

    }
}
