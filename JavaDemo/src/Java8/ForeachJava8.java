package Java8;

import java.util.HashMap;
import java.util.Map;

public class ForeachJava8 {
	public static void main(String arg[]) {
		Map<Integer, String> items = new HashMap<>();
		items.put(500,"Shifoo");
		items.put(504,"Oogway");
		items.put(503,"Tigress");
		items.put(730,"Mantis");
		
		items.keySet()
		.stream()
		.filter((k)->k.intValue()<600)
		.forEach(System.out::println); 
		
		System.out.println("Printing Map with forEach \n : ");
		items.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
		items.values().forEach((v)->System.out.println("values : " + v));
		items.values().forEach((V)->System.out.println(V+":"+V.length()));
		System.out.println("\nPrinting Map with forEach");
			}
}
