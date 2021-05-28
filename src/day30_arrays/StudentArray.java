package day30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args){
        //String[] student = {"12345", "Mariam", "", "B22", "90099009900"};

        String[] student1 = new String[5];
        student1[0]="Ad 4536";
        student1[1]="Mariam";
        student1[2]="Rashad";
        student1[3]="B22";
        student1[4]="567-543-6787";

        String[] student2 = {"AD567", "Maria", "Mawed", "B22", "900-999-9080"};

        System.out.println("student1 ID = " + student1 [0]);
        System.out.println("Student1 first name =" + student1 [1]);
        System.out.println("Student1 last name = " + student1 [2]);
        System.out.println("Student1 batch number = " + student1 [3] );
        System.out.println("Student1 phone number = " + student1 [4] );

           // data arrays length
        System.out.println("student data length : " + student1.length);

            // first and last name upperCase
        System.out.println(student1[1].toUpperCase()+ " " + student2[2].toUpperCase() );

        // store phone number
        String mobilNum = student1[4];
        System.out.println("mobilNum.length() = " + mobilNum.length());
        System.out.println("mobilNum.startsWith(567) = " + mobilNum.startsWith("567") );



        if (student1.length == student2.length) {
            System.out.println("Pass : data array has match");
        } else {
            System.out.println("Fail : data array has not match");
        }



    }


}
