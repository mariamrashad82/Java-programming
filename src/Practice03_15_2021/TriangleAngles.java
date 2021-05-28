package Practice03_15_2021;

public class TriangleAngles {
    public static void main(String[] args) {
        int angle1 = 100;
        int angle2 = 30;
        int angle3 = 50;
        int sum = angle1 + angle2 + angle3;
        if(sum == 180){
            // if( (angle1 + angle2 + angle3) == 180){
            // or boolean check = angle1 + angle2 + angle3) == 180;
            System.out.println(" Valid Triangle ");
        }else{
            System.out.println("Invalid Triangle");
            // if( (angle1 + angle2 + angle3) != 180){
            //System.out.println("Invalid Triangle");
        }
    }
}
