import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<Integer, String> mapObj = new TreeMap<Integer,String>();
		mapObj.put(1000, "Manish");
		mapObj.put(3000, "Mishra");
		mapObj.put(2000, "Kumar");
		System.out.println("Map Key : "+mapObj.get(3000)); 
		System.out.println("Map : "+mapObj);
	}
}
