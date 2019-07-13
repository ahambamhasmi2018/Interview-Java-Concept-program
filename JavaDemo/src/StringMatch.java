import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringMatch 
{
	public static void main(String[] args) 
	{
		/*{    
            double a = 290.05;
            int  b = 100;
            byte c = (byte) a;
            byte d = (byte) b;
            System.out.println(c + " "  + d);
        }*/
       /* {
            char var;
            var = "hackathons".charAt(-1);
            System.out.println(var);
        }*/
		 /* Map<String, Integer> names = new HashMap<String, Integer>();
	        names.put("Anne", 10);
	        names.put("John", 35);
	        names.put("Bob", 2);
	        Set<Entry<String, Integer>> set = names.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	          public int compare( Map.Entry<String, Integer> order1, Map.Entry<String, Integer> order2)
	            {
	                return (order2.getValue()).compareTo( order1.getValue() );
	            }
	        });
	        for(Map.Entry<String, Integer> entry:list){
	            System.out.print(" "+entry.getKey());
	        }
*/	
		
		String regex = ".@.";

		StringMatch.compare("Hacker@Earth.com", regex);
		StringMatch.compare("a@N", regex);
		StringMatch.compare("Java@Program", regex);

		}

		public static void compare(String str, String regex)
		{
		    if (str.matches(regex))
		    {
		        System.out.println(str + " matches");
		    }
		    else
		    {
		        System.out.println(str + " does not match");
		    }}
}
