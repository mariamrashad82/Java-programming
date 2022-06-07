package mariamArrays;

public class Ass219 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 6;
        int itreat = 5;
        int total = 0;
        for( int j =0;j<itreat;j++){
            if(j%3==0)
                continue;
            total+=num1+num2;

        }
        System.out.println(total);
    }
}
