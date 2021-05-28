package MariamMethods;

public class MethodsCollection {
    public static void main(String[] args) {
        System.out.println(repeat("java",5,'*'));

    }
    public static String repeat(String word , int time ,char del ){
        String sum = "";
        for(int i = 1;i<=time;i++){
            sum+=word+del;
        }
        return sum;
    }
}
