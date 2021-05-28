package mariam_practice;

public class sumOddNumber24 {
    public static void main(String[] args) {
        int year =0;
        int treeSize = 0;

        do{
            year++;

            if(year < 3){

                treeSize++;
                System.out.println("year "+year+" - growth 1 cm");
                System.out.println("tree size: "+treeSize+"cm");
            }else if(year==3){

                treeSize++;
                System.out.println("year "+year+"  - growth 1 cm");
                System.out.println("tree size: "+treeSize+"cm");

            }else if(year<7){
                System.out.println("year "+year+" - growth 2 cm");
                treeSize += 2;
                System.out.println("tree size: "+treeSize+"cm");

            }else{
                System.out.println("year "+year+" - growth 2cm");
                treeSize += 2;
                System.out.println("tree size: "+treeSize+"cm");

            }
        } while(year<10);

    }
}
