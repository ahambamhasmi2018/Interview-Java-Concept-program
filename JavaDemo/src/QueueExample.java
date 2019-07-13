import java.util.*;

public class QueueExample 
{
	public static void main(String args[])
	{
		PriorityQueue<String> queue=new PriorityQueue<String>(); // creating priority queue
		queue.add("Amit");                                       // adding elements
		queue.add("Rachit");
		queue.add("Rahul");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		// System.out.println("head:"+queue.poll());
		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()){
		System.out.println(itr2.next());
		}
	}
}
