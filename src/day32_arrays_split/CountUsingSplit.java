package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
             //
        String catsTyps = "bengal cat tabby cat persian cat van cat";
        String[] catsArray = catsTyps.split("cat");
        System.out.println("Number of cats = " + catsArray.length);

        for (String type : catsArray){
            System.out.println(type);
        }

    }
}














// cheap idea
//int count = 0;
//        for (int i = 0; i < cats.length()- 2; i++) {
//            if (cats.substring(i,i+3).equals("cat")) {
//                count++;
//            }
//        }
//        System.out.println("count cats = " + count);