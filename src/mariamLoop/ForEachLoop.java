package mariamLoop;

public class ForEachLoop {
    public static void main(String[] args) {
//        int[] num = {12,45,778,433,245,6,8,90};
//        for (int i : num) {
//            if(i % 2 == 1)
//            System.out.println("Odd number : " + i);

        int[] num = {12, 45, 778, 433, 245, 6, 8, 90};
        for (int i : num) {
            if (i % 2 == 0)
                System.out.println("even number : " + i);
        }

        String[] sent = {"samir", "mariam", "Marvi", "Emmanuel"};
        for (String i : sent) {
            if (i.contains("e")) {
                System.out.println("take emmanuel out");
                break;
            }
            System.out.println("i = " + i);

        }
        
        for (int i = 0; i < sent.length; i++) {
            String j = sent[i];
            System.out.println(" for : " + j);

        }
    }
}


