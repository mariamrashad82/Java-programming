package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        //             0123456789
        String list = "jesus,is,love";

       // for(int i = 0 ; i < list.length()-2 ; i++){
       // System.out.println(list.substring(i, i+3));

            for(int i = 0; i < list.length()-4; i++) {
                String part = list.substring(i, i + 5);
                System.out.println(list.substring(i, i + 5));
                System.out.println("part of :" + list);

               // if(list.substring(i, i+5).equals("jes") || list.substring(i, i + 5).equals("jes")) {
                  //  System.out.println("jes is found");

                }
            }



        }



