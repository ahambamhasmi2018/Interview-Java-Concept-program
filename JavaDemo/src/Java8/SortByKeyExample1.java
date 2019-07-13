package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByKeyExample1 {

    public static void main(String[] args) {

    	HashMap<String, String> unsortMap = new HashMap<String, String>();
        unsortMap.put("2", "z");
        unsortMap.put("12", "b");
        unsortMap.put("8", "a");
        unsortMap.put("16", "c");
        unsortMap.put("78", "c");
        unsortMap.put("60", "c");
        unsortMap.put("1", "c");
        List<Entry<String,String>> unsortedList = new ArrayList<Entry<String,String>>(unsortMap.entrySet());
        Collections.sort(unsortedList,new Comparator<Entry<String,String>>()
        {
            @Override
            public int compare(Entry<String,String> e1,Entry<String,String> e2)
            {
            	Integer v1 = Integer.parseInt(e1.getKey());
            	Integer v2 = Integer.parseInt(e2.getKey());
                return v1.compareTo(v2);
            }
        }
        );
        Map<String,String> sortedMap = new LinkedHashMap<String,String>();
        
        for(Entry<String,String> entry:unsortedList){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        //Print the Elements of the Map after Sorting
        System.out.println("Elements of the HashMap after Sorting");
        System.out.println(sortedMap);
    }
}
    //pretty print a map
/*    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() 
				+ " Value : " + entry.getValue());
        }
    }*/


