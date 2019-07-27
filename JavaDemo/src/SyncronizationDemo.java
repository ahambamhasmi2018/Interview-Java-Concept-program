class Display{
	/*public synchronized void wish(String name) {*/    
	public static synchronized void wish(String name)   // Class level lock
	{
		for(int i = 0; i<=10;i++) {
			System.out.print("Good Morning :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {	
			}
			System.out.println(name);
		}
	}
}
class SyncThread  extends Thread{
	Display d;
	String name;
	SyncThread(Display d,String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
public class SyncronizationDemo {
	public static void main(String[] args) {
		Display obj = new Display();
		Display obj2 = new Display();
		SyncThread t = new SyncThread(obj,"Mansh");
		SyncThread t1 = new SyncThread(obj2,"Kumar");
	//	SyncThread t2 = new SyncThread(obj,"Mishra");
		t.start();
		t1.start();
	//	t2.start();
	}
}
