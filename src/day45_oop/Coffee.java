package day45_oop;

public class Coffee {

    int amount;
    String type ;
// short cut right click (generate)
    //select(to string)
    //select (ok)
    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill() {
        amount = 100;
        System.out.println("Amount = " + amount);
    }
    public void drink(int someAmount) {
        amount -= someAmount;
    }
    public int getAmount(){
        return amount;
    }


    public void setType(String newType){
        type = newType;

    }
    public String getType(){
        return type;
    }
}