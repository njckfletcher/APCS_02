import java.util.*; 

public class StatsArrayListStudent
{
    
    /**
     * precondition: nums.size() > 0; nums contains Integer objects
     * postcondition: returns the maximal value in nums
     */
    
    private static Integer findMax(ArrayList nums)
    {
      Integer max = (Integer)nums.get(0);
      for(int k=1; k < nums.size(); k++) {
     Integer i = (Integer) nums.get(k);
     if ((Integer)nums.get(k) > max) {
       max = (Integer)nums.get(k);
     }
 }
 return max;
    }
 
    /**
     * precondition: tally.length > 0
     * postcondition: returns an int array that contains the modes(s);
     *                the array's length equals the number of modes.
     */
       

    /**
     * precondition: tally.size() > 0; tally contains Integer objects
     * postcondition: returns an ArrayList that contains the modes(s);
     *                the ArrayList's size equals the number of modes.
     */
    
	public static ArrayList calculateModes(ArrayList tally) {
		
		ArrayList<Integer> modes = new ArrayList();
		
		int largestValue = findMax(tally);//0;
		
		for(int i=0; i < tally.size(); i++) {
			int num = (int)tally.get(i);
			if(num == largestValue) {
				modes.add(i);
			}
		}
		
		return modes;
		
    }

   
    /**
     * precondition: tally.size() > 0; tally contains Integer objects
     *               0 < k <= total number of values in data collection
     * postcondition: returns the kth value in the data collection
     *                represented by tally
     */
    
    public static int kthDataValue(ArrayList tally, int k) {
    	
    	int count = 0;
    	
    	for(int i=0; i < tally.size(); i++) {
    		count += (int)tally.get(i);
    		if(count >= k) {
    			return i;
    		}
    	}
    	
    	return tally.size() - 1;
    	
    }
    
         public static void main(String[]args)
      {
// Main method to test the methods in the class    
      ArrayList<Integer> myList = new ArrayList<Integer>(); 
              
      System.out.print("The array is: "); 
      for(int i = 0; i < 10; i++)
      {
        int pos = (int)(Math.random()*11); 
         myList.add(i, pos);
       
       
       System.out.print(myList.get(i) + " "); 
      }
       
      System.out.println("\nThe 14th value is at index: " + kthDataValue(myList,14)); 

      System.out.print("The mode is at index: "); 
      for(int i = 0; i < calculateModes(myList).size(); i++) 
      {
      System.out.print(calculateModes(myList).get(i) + " " );
      
     
}
}
}

