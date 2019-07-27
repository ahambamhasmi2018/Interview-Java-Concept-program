class MyThread1 extends Thread
	{
		int total = 0 ;
		public void run() {
		for(int i =0 ; i<=100;i++) 
		{
			total =total + i;
		}synchronized (this) {
			this.notify();
		}
		
	
	}
}
public class waitDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 b = new MyThread1();
		b.start();
		//b.join();
		//b.sleep(0,1);
		synchronized (b) {
			b.wait();
		}
	
		System.out.println(b.total);
		
	}
}



