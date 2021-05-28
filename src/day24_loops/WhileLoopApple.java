package day24_loops;

public class WhileLoopApple {
    public static void main(String[] args) {
        int apples = 1;
        while (apples <= 10) {
            System.out.println("apples = " + apples++);

        }
        System.out.println("No more apples :(");
    }
    }