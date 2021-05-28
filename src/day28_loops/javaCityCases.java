package day28_loops;

public class javaCityCases {
    public static void main(String[] args) {

        //every day we have 200 cases but on sunday  cases increase to  500 cases.
        int totalCases = 0;
        for( int day = 1 ;day <= 30; day ++ ){
            if(day %7 == 0 ){
                totalCases+=500;
            }else{
                totalCases+=200;
            }
            System.out.println("day " + day + " | total cases :" + totalCases);
            }
        System.out.println("java city 11/2021 total cases :" + totalCases);
        }

        }



