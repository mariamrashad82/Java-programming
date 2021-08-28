package interview_coding;
import java.util.*;
public class SortingMapByValue {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 3);
        map.put('B', 4);
        map.put('C', 1);
        map.put('D', -2);
        map.put('E', 0);
        map.put('F', 2);

        System.out.println("map = " + map);

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());


        System.out.println("list = " + list);


        for (int i = 0; i < list.size(); i++) {

            for (int j = i+1; j < list.size(); j++) {

                if (list.get(i).getValue() > list.get(j).getValue()){
                    int temp = list.get(i).getValue();
                    list.get(i).setValue(list.get(j).getValue());
                    list.get(j).setValue(temp);
                }

            }
        }

        Map<Character,Integer> mapAfterSort = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : list) {
            mapAfterSort.put(entry.getKey(), entry.getValue());
        }
        System.out.println("mapAfterSort = " + mapAfterSort);

    }
}
