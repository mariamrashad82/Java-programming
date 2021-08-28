package interview_coding;

public class Reverse2 {
    public static void main(String[] args) {
        StrRev("java is fun");

    }
    public static void StrRev(String Str){
        String Reverse = "";
       for(int i =Str.length()-1;i >=0 ;i--){
           Reverse += Str.charAt(i);

       }
        System.out.println(Reverse);



    }
}
