package Practice03_16_2021;

public class CampusHours {
    public static void main(String[] args) {
        int time = 8;
        if (time < 0 || time > 24) {
            System.out.println(" Invalid Time");
        }else if( time >= 8 && time <=23){
            System.out.println(" Campus is open");
        }else{
            System.out.println("Campus is closed");
        }
    }
}