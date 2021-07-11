package day61_exception_collections;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent(){}

    public ElementaryStudent(String name , int age){
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        return "ElementryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        //check if null first,otherwise we might get null pointer exception
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
        //if name is all numbers , or starts with number
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 5 || age > 12 ){
            throw new IllegalArgumentException("age can not be < 5 or > 12");
        }
        this.age = age;

    }


    }

