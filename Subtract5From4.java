/**
 * Complete the following tasks:

1) Create a method subract5FromAll4() that is passed an array nums and returns a 
new array. The new array will consist of the values of nums, except that each element 
must be 5 less than its corresponding element in nums. 

Ex: 

subtract5FromAll4( {5, 0, 8, 20}  )   -------returns----->     {0, -5, 3, 15}
 */


/**
 * This code creates an array and then calls a method that creates a copy array and 
 * changes the values of all the elements in the array by using a for loop to go 
 * through each element and subtract 5. Then it returns the copy array back to the 
 * main method and prints it out.
 */
public class alteringArraysProblems {

	public static void main(String[] args) {
		
		int[] nums = {5,6,7,8};
		subtract5FromAll4(nums);

	}

	public static void subtract5FromAll4(int[] numbers) {
		
		int[] copyNumbersArr = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			
			copyNumbersArr[i] = numbers[i] - 5;
			System.out.print(copyNumbersArr[i] + ", ");
			
		}
		
		
	}
	
}
