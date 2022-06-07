package MockInterview;

public class Test2 {
    public static void main(String[] args) {
        method2("The sun set quickly and created a shadow");
    }
    public static void method2(String s){
        String a = s.substring(10);
        if(a.length() > s.length()){
            System.out.println(a);

        }else {
            System.out.println(s);
        }
    }

}
