package CollectionSetList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ObjEqSetCheck {

	static String s1 = new String("MANISH");
	static String s2 = new String("KUMAR");

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		set.add(s1);
		set.add(s2);
		set.add("MANISH");
		list.add(s1);
		list.add(s2);
		list.add("KUMAR");
		
		
		System.out.println("Set Elements : "+set.size()); 
		System.out.println("List Elements : "+list.size()); 
	}
}
