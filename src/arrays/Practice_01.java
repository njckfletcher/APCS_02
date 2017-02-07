package arrays;

public class Practice_01 {
	public static void main(String[] args) {
		// Declaring array:
		int [ ] grades = new int [5];
		// Brackets may come before or after variable name
		// int grades [ ] = new int [5];
		// The 5 tells how many items the array will hold
		
		// Initializing array:
		grades[0] = 95;

		grades[1] = 90;

		grades[2] = 100;

		grades[3] = 80;

		grades[4] = 86;
		
		// Declare and initialize:
		int grades_02 [ ] = {95, 90, 100, 80, 86};
		
		// Another declare and initialize:
		int grades_03 [ ] = new int [ ] {95, 90, 100, 80, 86};
		
		// Find array length
		int arrayLength = grades.length;
		
		// First way to iterate through an array:
		System.out.println("First iteration:");
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		System.out.println();
		
		// Second way to iterate through an array:
		System.out.println("Second iteration:");
		for (int g: grades) {
			System.out.println(g);
		}
		
	}
}
