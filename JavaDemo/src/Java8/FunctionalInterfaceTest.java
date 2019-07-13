package Java8;

@FunctionalInterface
interface squire{
	Integer calculater(Integer x);
}
public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		
		Integer x = 5;
		squire sq = (Integer a)->a*a;
		Integer ans = sq.calculater(x);
		System.out.println("Squire :"+ans); 
	}

}
