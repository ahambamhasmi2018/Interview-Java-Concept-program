package CollectionSetList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapInternalWork {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		Set<String> setObj = new HashSet<String>(); 
		
		setObj.add("Kumar");
		setObj.add("Om");
		setObj.add("Dev");
		
		System.out.println(setObj);
		
		map.put("Manish", 1987);
		map.put("Ekta", 1990);
		map.put("Tripty", 1992);
		
		System.out.println(map.values()+" "+map.keySet());
	}
}
