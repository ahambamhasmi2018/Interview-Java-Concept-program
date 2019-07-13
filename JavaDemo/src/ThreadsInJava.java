public class ThreadsInJava 
{
	public static void main(String[] args)
    {
        Thread.State[] states = Thread.State.values();
        Thread.State[] states2 = Thread.State.values();
 
        for (Thread.State state : states2)
        {
            System.out.println(state);
        }
    }
}
