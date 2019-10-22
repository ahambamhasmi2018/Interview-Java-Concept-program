package Java8;
interface Moveable{
	default void move(){
		System.out.println("It's a default method interface");
	}
}

public class DefaultMethod implements Moveable{
	
	public static void main(String[] args) {
		DefaultMethod obj = new DefaultMethod();
		obj.move();
	}
}
