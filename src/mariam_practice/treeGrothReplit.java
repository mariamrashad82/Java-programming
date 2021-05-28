package mariam_practice;

public class treeGrothReplit {
    public static void main(String[] args) {
        int year =1;
        int treeSize = 1;
        int cm = 1;

        while( year <=10){
            System.out.println("year "+year+ "growth "+ treeSize+ "cm" );
            year++;
            cm+=1;

            if(year >= 4 && year <= 10){
                System.out.println("year "+year+ "growth "+ treeSize + "cm");
                System.out.println("Tree size :  " + cm + "cm");
                treeSize =2;
                cm+=1;


            }
        }

    }
}
