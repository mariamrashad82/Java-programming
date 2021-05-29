package day48_constructors_static;

public class Customer {
    private String name;
    private int id;
    // no args constructors
    public Customer(){
        System.out.println("No args Constructor");
        name = "new Customer";
        id = -1;
    }
    // add a constructors where we can assign name and id
    public  Customer(String name ,int id){
        System.out.println("2_args constructors ");
        this.name= name;// set name (name);
        this.id= id; // set id (id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
