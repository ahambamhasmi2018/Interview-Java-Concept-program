class MyCustomException extends Exception{
	public MyCustomException() {
		super();
		//System.out.println("Hello ");
	}
	
	MyCustomException(String s){
		super(s);
	}
}
public class CustomeException {
	public static void main(String[] args) {
		try {
			throw new MyCustomException("jay hind");
		} catch (MyCustomException e) {
			System.out.println("Caught exception ..../");
			System.out.println(e.getMessage());
		}
		try {
			throw new MyCustomException();
		} catch (MyCustomException e) {
			System.out.println("Caught exception 2..../");
			System.out.println(e.getMessage());
		}
	}
}
