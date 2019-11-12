package LinkedList.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AddLinkedListElement {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>(); 
			linkedList.add("New Delhi");
			linkedList.add("Mumbai");
			linkedList.add("Manish");
			linkedList.add("Bangalore");
			linkedList.add("Manish");
			linkedList.add("Pune");
			System.out.println("LinkedList Elements:"+linkedList );
			// Add new Element at index 3
			linkedList.add(3, "NEW ELEMENT");
			linkedList.add("Manish");
			
			// AddFirst element
			linkedList.addFirst("FIRST CITY");
			
			// addLast city
			linkedList.addLast("LAST CITY");
			
			// offerFirst element linkedlist
			linkedList.offerFirst("OFFER ELEMENT");
			
			// offerLast element linkedlist
			linkedList.offerLast("Offer LAST");
			
			linkedList.offer("only offer");
			// After Adding  list
			
		
			Iterator<String> it = linkedList.iterator();
			while (it.hasNext()) {
				System.out.println(" "+it.next());
			}
			
			Object FisrtRemv = linkedList.removeFirst();
			String LastRemov = linkedList.removeLast();
			Object indexRemove = linkedList.remove(3);
			//get(i) returns element present at index i
		    for(int i=0; i < linkedList.size(); i++){
		      System.out.println("Element at index "+i+" is: "+linkedList.get(i));
		    } 
		    
		    //Searching first occurrence of element
		     int firstIndex = linkedList.indexOf("Manish");
		     System.out.println("First Occurrence: " + firstIndex);
		 
		     //Searching last occurrence of element
		     int lastIndex = linkedList.lastIndexOf("Manish");
		     System.out.println("Last Occurrence: " + lastIndex);
		     
		     // Obtaining Sublist from the LinkedList
		     List sublist = linkedList.subList(2,5);
		  
		     // Displaying SubList elements
		     System.out.println("\n Sub List elements:");
		     Iterator subit= sublist.iterator();
		     while(subit.hasNext()){
		        System.out.println(subit.next());
		     }
			
			System.out.println("remove First : "+FisrtRemv + " Last remove : "+ LastRemov +" indexRemove :" + indexRemove);
		    // Getting First element of the List
		    Object firstElement = linkedList.getFirst();
		    System.out.println("First Element is: "+firstElement);
		 
		    // Getting Last element of the List
		    Object lastElement = linkedList.getLast();
		    System.out.println("Last Element is: "+lastElement);
			linkedList.clear();
			System.err.println(linkedList);  // remove call element from linked list
	}

}
