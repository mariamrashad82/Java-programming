package Mariam_class_object;

public class coffee {
    int amount;

    String type;


    @Override
    public String toString() {
        return "coffee{" +
                "type='" + type + '\'' +
                '}';
    }
    public void refill(){
        amount =100;
        System.out.println("amount = " + amount);
    }
    public void drink (int someAmount){
        amount-=someAmount;


    }
    public int getAmount(){
        return amount;
    }
    public void setType(String newType){
        type=newType;

    }
    public String getType(){
        return type;
    }

}
