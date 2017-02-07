package stats;

import java.util.*; 

public class StatsStudents {
    /**
     *  precondition:  nums.length > 0
     *  postcondition: returns the maximal value in nums
     */
    
	private static int findMax(int[] nums) {
		int max = Integer.MIN_VALUE; 
	
		for(int k=0; k < nums.length; k++) {
			if (nums[k] > max) {
				max = nums[k];
			}
		}
		return max;
	}


    


    /**
     * precondition: tally.length > 0
     * postcondition: returns an int array that contains the modes(s);
     *                the array's length equals the number of modes.
     */
    
    public static int[] calculateModes(int[] tally)	{
    	
    }


    /**
     * precondition: tally.size() > 0; tally contains Integer objects
     * postcondition: returns an ArrayList that contains the modes(s);
     *                the ArrayList's size equals the number of modes.
     */
    
  


    /**
     * precondition: tally.length > 0;
     *               0 < k <= total number of values in data collection
     * postcondition: returns the kth value in the data collection
     *                represented by tally
     */
    
    public static int kthDataValue(int[] tally, int k) {
    	
    }

    /**
     * precondition: tally.size() > 0; tally contains Integer objects
     *               0 < k <= total number of values in data collection
     * postcondition: returns the kth value in the data collection
     *                represented by tally
     */
    
    
    public static void main(String[]args) {
    	
    	int tally[] = {0, 0, 10, 5, 10, 0, 7, 1, 0, 6, 0, 10, 3, 0, 0, 1};
    	
    	int max = findMax(tally);
    	
    	System.out.println(max);
    	
    	/*int list[] = new int[10];
        
    	for(int i = 0; i < 10; i++) {
	        int pos = (int)(Math.random()*11); 
	        list[i] = pos; 
       
	        System.out.print(list[i] + " "); 
    	}
       
    	System.out.println("\n " + kthDataValue(list,14)); 

    	for(int i = 0; i < calculateModes(list).length; i++) {
	        System.out.print(calculateModes(list)[i] + " ");
	        System.out.println(" "); 
    	}*/
    }
}





