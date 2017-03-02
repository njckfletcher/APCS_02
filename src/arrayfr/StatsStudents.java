package arrayfr;

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
    
	public static int[] calculateModes(int[] tally) {
		
		int count = 0;
		int max = findMax(tally);
		for(int i = 0; i < tally.length; i++) {
			if(tally[i] == max) {
				count++;
			}
		}
		int[] newArray = new int[count];
		count = 0;
		for(int i = 0; i < tally.length; i++) {
			if(tally[i] == max) {
				newArray[count] = i;
				count++;
			}
		}
		return newArray;
    }

	/**
	 * precondition: tally.length > 0;
	 *               0 < k <= total number of values in data collection
	 * postcondition: returns the kth value in the data collection
	 *                represented by tally
	 */
    
	public static int kthDataValue(int[] tally, int k) {
		int count = 0;
		for(int i = 0; i < tally.length; i++) {
			count += tally[i];
			if(count >= k) {
				return i;
			}
		}
		return tally.length - 1;
	}

	public static void main(String[]args) {
		
		int list[] = new int[10];
		
		System.out.print("Random List: ");
		for(int i = 0; i < list.length; i++) {
			int pos = (int)(Math.random()*11); 
			list[i] = pos;
			
			if(i != list.length - 1) {
				System.out.print(list[i] + ", ");
			}
			else {
				System.out.print(list[i]);
			}
		}
		
		//System.out.println();
		
		System.out.println("\n14th data value: " + kthDataValue(list,14)); 
		
		System.out.print("Mode indexes: ");
		for(int i = 0; i < calculateModes(list).length; i++) {
			if(i != calculateModes(list).length - 1) {
				System.out.print(calculateModes(list)[i] + ", ");
			}
			else {
				System.out.print(calculateModes(list)[i]);
			}
		}
	}
}
