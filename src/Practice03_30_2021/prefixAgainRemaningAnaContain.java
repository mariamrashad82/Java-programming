package Practice03_30_2021;

public class prefixAgainRemaningAnaContain {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 2;

        String prefix = str.substring(0,n); // 0, 2 -> ab
        String remaining = str.substring(n);  // XYabc

        System.out.println(remaining.contains(prefix));
    }
}
