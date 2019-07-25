class yieldThread extends Thread{
	public void run() {
		for(int i = 0 ; i<= 10 ; i++) {
			System.out.println("Child Thread");
			//Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
public class ThreadYieldDemo{
	public static void main(String[] args) throws InterruptedException { 
		yieldThread t = new yieldThread();
		t.start();
		t.join();
			for(int i = 0 ; i<= 10 ; i++) {
				System.out.println("Main Thread");
				Thread.sleep(2000);
			}

	}
}