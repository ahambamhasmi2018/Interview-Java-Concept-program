public class JavaThreadLifeCycle 
{
	public static void main(String arg[]) {
		// TODO Auto-generated method stub
		Thread t = new Thread();
		System.out.println("Thread State : "+ t.getState());
		t.start();
		System.out.println("Thread State : "+ t.getState()); 
	}
}
