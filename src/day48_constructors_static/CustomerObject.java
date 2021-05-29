package day48_constructors_static;

import day41_arrayList.ArrayAsList;

import java.util.ArrayList;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        // the same result
        System.out.println(cs1);
        System.out.println(cs1.toString());

        cs1.setId(39);
        cs1.setName("mariam");
        System.out.println(cs1);

        Customer cs2 = new Customer("Nosa",40);
        Customer cs3 = new Customer("RomaIIIII",1);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] todaysCustomers = {cs1,cs2,cs3,new Customer("Zek",2021)};


        //arrayList of Customers objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Roma ",25));
        customerList.add(new Customer("Marvi ",28));
        customerList.add(new Customer("koko ",18));
        customerList.add(new Customer("samir ",20));

        //print info of first customer object in array and arraylist.
        // 3 print the same value
        System.out.println(todaysCustomers[0]);
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());

        System.out.println(customerList);//print toString() info of all customer object

        for(int i = 0 ; i < customerList.size();i++){
            System.out.println(customerList.get(i));
        }
        System.out.println("_______FOR EACH LOOP________");
        for(Customer eachCustomer : customerList){
            System.out.println(eachCustomer);

        }
        //print only names in the list
        System.out.println("______Names Of Customers_______");
        //forEach method and lambda expression
        customerList.forEach(each -> System.out.println(each.getName()));
        for(Customer eachCustomer : customerList){
            System.out.println(eachCustomer.getName());
        }

    }
}
