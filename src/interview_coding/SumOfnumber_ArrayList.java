package interview_coding;
import java.util.ArrayList;
import java.util.Arrays;

public class SumOfnumber_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("123" , "54", "24"));

        for(int i= 0; i < list.size(); i++) {
            int totalSum = 0;
            for (char digit : list.get(i).toCharArray()){ // [1, 2, 3]
                totalSum += Integer.parseInt("" +digit);
            }
            //System.out.println(list);
            list.set(i, "" + totalSum);

        }

        System.out.println(list);

    }
}

