package day64_review;

public class EnvRunner {

    public static void main(String[] args) {
        System.out.println(Environment.QA);
        System.out.println(Environment.DEV);
        Environment env = Environment.QA;
        System.out.println("env = " + env);
        switch (env){
            case QA:
            System.out.println("we aer in qa env");
            break;
            case SDET:
                System.out.println("we aer in sdet env");
                break;
            case DEV:
                System.out.println("we aer in DEV env");
                break;
            case PRO:
                System.out.println("we aer in PRO env");
                break;
        }

    }
}
