import java.util.HashMap;
import java.util.Map;

public class CheckEquals {

	public static void main(String[] args) {
		HashMap<Employeee, String> map = new HashMap<Employeee,String>();
		Employeee e1 = new Employeee();
			e1.setEmpId(1);
			e1.setEmpName("m");
		Employeee e2 = new Employeee();
			e2.setEmpId(1);
			e2.setEmpName("m");
			
			map.put(e1, "jjj");
			map.put(e2,"jjj");
			
			for(Map.Entry<Employeee,String> empMap : map.entrySet()) {
				System.out.println(empMap.getKey().hashCode());
			}
		
	System.out.println(e1.hashCode()+"  "+e2.hashCode() +" Equal : "+ e1.equals(e2));
//		System.out.println(map.get(e1.getEmpId()));
	}

}
