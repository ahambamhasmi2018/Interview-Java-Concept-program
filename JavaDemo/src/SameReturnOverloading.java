public class SameReturnOverloading{
	public boolean getData() {
		return false;
	}
	public int getData(int A) {
		return A;
	}
	public static void main(String[] args) {
		SameReturnOverloading obj = new SameReturnOverloading();
		System.out.print(obj.getData());
	}
}
