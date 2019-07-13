package CollectionSetList;

import java.util.HashSet;

public class HashSetExample
{
    public static void main(String[] args)
    {
        //Creating One HashSet object
 
        HashSet<String> set = new HashSet<String>();
 
        //Adding elements to HashSet
 
        set.add("RED");
 
        set.add("GREEN");
 
        set.add("BLUE");
 
        set.add("PINK");
 
        //Removing "RED" from HashSet
        set.remove("RED");
        
        System.out.println("Print Set : "+set);
    }
}