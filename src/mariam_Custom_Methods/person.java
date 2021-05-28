package mariam_Custom_Methods;

public class person {
    String name ;
    int age ;
    char gender;
    String job;
    public void cv1(){
        System.out.println("My name is : "+ name + " , My age : "+
                age+ " , My Gender : " + gender+" , My job : " +job + " . " );

    }
    public void cv2(){
        System.out.println("My name is : "+ name + " , My age : "+
                age+ " , My Gender : " + gender+" , My job : " +job + " . " );

    }
    public void run(){
        System.out.println( name+" is running");
    }
    public void swim(){
        System.out.println(name + " playing swimming");
    }
    public void runMiles(int mileCount){
        System.out.println(name + " is running " + mileCount + " mile" );
    }
    public int burnCalory(){
        System.out.println(name+" is running 1 mile " );
        return 10;
    }
    public int burnCaloryWithMile(int mileCount){
        System.out.println(name+ " Is running " + mileCount + " mile " );
        return 10 * mileCount;
    }

}
