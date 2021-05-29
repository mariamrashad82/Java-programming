package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroup {
    public static void main(String[] args) {

        // dependency injection.Group object creation depend on String name
        Group group1 = new Group("CyberBugs");

        //print size of member
        System.out.println(group1.getMember().size());
        group1.addMember("koko");
        group1.addMember("dodo");
        group1.addMember("gaby");
        group1.addMember("Ramy");
        group1.addMember("heaven");
        group1.addMember("mero");

        System.out.println(group1.getMember().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMember(Arrays.asList("Nosa","Mavy","Lolo","Momo","Soso","Nana"));

        //print all members .not toString
        System.out.println("Group2 members = " + group2.getMember());

        //use if statement if Lolo in the list
        if(group2.getMember().contains("Lolo")){
            System.out.println("Lolo is in group2");
        }else{
            System.out.println("Lolo is not in the group");
        }
        //remove member from group1
        group1.removeMember("Ramy");
        group1.removeMember("koko");
        System.out.println(group1.toString());


    }
}
