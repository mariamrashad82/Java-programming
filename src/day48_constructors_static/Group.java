package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<String> members = new ArrayList<>();

    // constructors that accepts a name
    public Group(String name){
        this.name=name;

    }

    public void addMember(String newMember){
        members.add(newMember);

    }
    public void removeMember(String memberName){
        members.remove(memberName);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", member=" + members +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMember() {
        return members;
    }

    public void setMember(List<String> member) {
        this.members = member;
    }
}
