package MockInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ConvertStringHash {
    public static void main(String[] args) {



String student = "test,123:test1,124:test2,125:test3,126 ";


Map<String, String> hashMap = new HashMap<>();

String parts[] = student.split(":");


for (String part : parts) {


    String stuData[] = part.split(",");


    String stuName = stuData[0].trim();
    String stuRollNo = stuData[1].trim();


    hashMap.put( stuName,stuRollNo);




}
        System.out.println("String to HashMap: " + hashMap);
}
}
