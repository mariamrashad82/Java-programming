package Practice03_29_2021;

public class SandwichString {
    public static void main(String[] args) {

        String str = "breadbread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)
        boolean isValid = false;
        String result = "";

        if(str.contains("bread")) { // 5,5

            int firstBread = str.indexOf("bread");

            if(str.substring(firstBread+5).contains("bread")) { //jambread
                int secondBread = str.lastIndexOf("bread");
                result = str.substring(firstBread + 5,secondBread);
                isValid = true;
            }

        }

        if(!isValid || result.isEmpty()) {
            System.out.println("nothing");
        } else {
            System.out.println(result);
        }





    }
}