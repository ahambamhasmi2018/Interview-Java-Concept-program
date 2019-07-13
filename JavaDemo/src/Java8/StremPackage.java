package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StremPackage {
	
	public static void main(String[] args) 
	{
		String[] arr = new String[]{"P", "A", "V"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::println); 

		stream = Stream.of("M","A","N","I","S","H");
		stream.forEach(System.out::println);

		List<String> list = Arrays.asList("Pavan", "Opencodez");
		System.out.println("Hii forEach");
		//list.forEach(System.out::println);
		stream = list.stream();
		stream.forEach(System.out::println); 

		
		System.out.println("Before parallel Stream ");
		list.parallelStream().forEach(System.out::println);

	}
}
