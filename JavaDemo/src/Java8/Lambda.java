package Java8;
interface Ifra{
	public void m1();
}

public class Lambda {
	int x = 100;
	public void m2() {
		int y = 10;
		Ifra i=()->{
		//	y =100;    // Local variable y defined in an enclosing scope must be final or effectively final
			System.out.println(x);
			System.out.println(y);
		};
		i.m1();
	}

	public static void main(String[] args) {
		Lambda obj = new Lambda();
		obj.m2();
	}

}
