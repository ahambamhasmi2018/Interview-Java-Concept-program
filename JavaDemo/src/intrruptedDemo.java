class IntThred extends Thread{
	public void run() {
		try {
			for (int i = 0;i <= 10;i++) {
				System.out.println("I am lazay thread");
				Thread.sleep(1000, 100);
			}
		}catch (InterruptedException e) {
				System.out.println("I am InterruptedException");
			}
		}
	}
public class intrruptedDemo {
	public static void main(String[] args) {
		IntThred t = new IntThred();
		t.start();
		t.interrupt();
		System.out.println("I am main thread");
	}

}
