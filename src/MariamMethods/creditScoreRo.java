package MariamMethods;

public class creditScoreRo {
    public static void main(String[] args) {
    check(700);
    check(860);
    check(500);
    int score = getCridetScore();
        System.out.println(score);




    }
    public static void check(int credit){
        if(credit >=700){
            System.out.println("you allow");

        }else{
            System.out.println("not allow");
        }

    }
    public static int getCridetScore(){
       return 800;
    }
}
