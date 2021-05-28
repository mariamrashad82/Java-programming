package MariamMethods;

public class methodCallAnother_RO {
    public static void main(String[] args) {
        begin();

    }
    public static void begin(){
        System.out.println("Begin");
        middle();

    }
    public static void middle(){
        System.out.println("middle");
        end();
    }
    public static void end(){
        System.out.println("end");
    }

}
