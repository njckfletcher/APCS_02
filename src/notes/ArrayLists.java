package notes;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		// Creation of an array list
		ArrayList myStuff = new ArrayList();
		
		/*Notice in this line of code we do not know what types are being stored 
		in this ArrayList. When we try to remove elements we will need to typecast 
		them as a specific object. It may be more helpful for us to declare the type 
		when the ArrayList is created.*/
		
		// Creation of an array with type declaration (String as example)
		ArrayList <String> myList = new ArrayList <String> ( );
		
		/*Wrapper Classes
		
		Since ArrayLists will only store objects we need to find a way to use 
		primitive data. This is where the Wrapper class comes in to play. The Wrapper 
		class makes primitive data into objects.*/
		
		Integer num = new Integer (1);
		
		/*num is now declared and created as an Integer storing 1.   To unwrap the 1 
		and assign it to an int we would do the following:*/
		
		int x = num.intValue();
		
		// The other Wrapper classes that you may use are Double for double and Boolean for boolean.
		
		/*ArrayList methods:
			add (index, Object) - This methods adds Object at the given index in the ArrayList. This causes all of the other objects to shift.
			add (Object) - This method adds Object to the end of the ArrayList.
			get (index) - This method retrieves an object at the index in the ArrayList. It does not remove the object.
			set (index, Object) - This method will replace the object at index with Object in the ArrayList.
			size()- This method returns the number of elements in the ArrayList.
			remove (index)- This method removes the object at index in the ArrayList. This causes all of the other objects to shift.*/
		
	}
}
