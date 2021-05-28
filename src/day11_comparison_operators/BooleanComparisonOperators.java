package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);//T
        System.out.println(1000>100);//T
        System.out.println(1590<1780);//T
        System.out.println(10<=11);//T
        System.out.println(11>=9);//T
        System.out.println(10!=9);//T
        System.out.println(-100!=44 );//T
        System.out.println("\n");
        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a!=b);
        System.out.println("\n");
        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);
        result = 33 > 44;
        System.out.println("result = " + result);
        result = 88 < 99;
        System.out.println("result = " + result);
        result = 10 >= 10;
        System.out.println("result = " + result);
        result = 123 <= 124;
        System.out.println("result = " + result);
        result = 2 != 2;
        System.out.println("result = " + result);
        String city = "seattle";
        System.out.println( city == "seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "fairfax");
        String name = "nadir";
        boolean checkName = name == "nadir";
        System.out.println("checkName = " + checkName);
        checkName = name != "khan";
        System.out.println("checkName = " + checkName);
        System.out.println("\n");
        int m1 = 5;
        int m2 = 3;
        System.out.println(m1 == m2);
        System.out.println(m1 < m2);
        System.out.println(m1 > m2);
        System.out.println(m1 <= m2);
        System.out.println(m1 >= m2);
        System.out.println(m1 != m2);
        System.out.println("\n");

        int age = 2;
        boolean noMoreToddler = age > 3;
        System.out.println(noMoreToddler);
        System.out.println("\n");
        
        int ageSen = 66;
        boolean seniors = ageSen <= 67;
        System.out.println("is seniors = " + seniors);
        
        


    }
}
