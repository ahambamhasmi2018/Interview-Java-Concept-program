package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(23);
		System.out.println(l);
		List<Integer> l1 = l.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println("even only :"+l1);
		List<Integer> db = l.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println("Double elememnt :"+db);
		l.stream().map(x->x*x).forEach(x->System.out.println(x)); 
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("Manish");
		c.accept("Upasana");
	}

}
