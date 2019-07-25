
class OneThread extends Thread{
	public void run() {
		for(int i = 0 ; i<= 10 ; i++) {
			System.out.println("Child Thread");
		}
	}

}
public class MyThread{
	public static void main(String[] args) {
		OneThread t = new OneThread();
		//t.setPriority(10);
		t.start();
	
			for(int i = 0 ; i<= 10 ; i++) {
				System.out.println("Main Thread");
			}

	}
}
