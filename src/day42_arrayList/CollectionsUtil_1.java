package day42_arrayList;
import java.util.*;
public class CollectionsUtil_1 {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));

        System.out.println("size = " + letters.size());

        System.out.println("Total = " +letters);

        Collections.reverse(letters);

        System.out.println("reversed = " + letters);

        System.out.println( "how many 'a' : "+ Collections.frequency(letters , 'a'));// how many time repeating

        int vCount = Collections.frequency(letters,'v');
        System.out.println("v count = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters,'a','u');
        Collections.replaceAll(letters,'i','j');
        System.out.println("After replace All = " + letters);

        Collections.sort(letters);
        System.out.println("After sorted = " +letters );


        List<Integer> nums = Arrays.asList(23,1,43,5,234,7,-9,0,5,5,5,5);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("After reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("max = " + max );
        System.out.println("min = " + min);

       int countOffFive =  Collections.frequency(nums,5);
        System.out.println("count off five = " + countOffFive);

        int countOff1s = Collections.frequency(nums,1);
        System.out.println("count off 1s = " + countOff1s);

        Collections.replaceAll(nums,5,50);
        System.out.println("After replace all = " + nums);


        Collections.sort(nums);
        System.out.println("after sort = " + nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println("After reverse sort = " + nums);

        Collections.shuffle(nums); // randoom
        System.out.println("nums after shuffle = " + nums);



    }

}
