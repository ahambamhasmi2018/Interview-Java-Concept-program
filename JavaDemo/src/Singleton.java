public class Singleton {

	private static Singleton sin_instasnce = null;
	 public String s;
	 
	 private Singleton(){
		 s = "Hello Sinalton class";
	 }
	 
	 public static Singleton getInstance() {
		 if(sin_instasnce  == null) {
			 sin_instasnce = new Singleton();
		 }
		return sin_instasnce;
	 }
}
class SingletonPattern{
	public static void main(String[] args) {
		Singleton x= Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		System.out.println("x :"+x.getInstance());
		System.out.println("y :"+y.getInstance());
	}
}
