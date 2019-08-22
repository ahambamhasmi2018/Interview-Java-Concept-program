import java.util.*;

public class ArrayListExample
{
	public static void main(String args[])
	{
		 ArrayList<String> al=new ArrayList<String>();  // creating array list
		 al.add("Jack");                // adding elements    
		 al.add("Tyler");
		 Iterator<String> itr = al.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
	}
}
