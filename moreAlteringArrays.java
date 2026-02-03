/**
1. Create a method noNegatives() that is passed a double array nums and 
returns a copy of that array, except any negative elements are changed to 0.

Ex: 

noNegatives( {-5.5, 0.0, -8.4, 20.3}  )   -------returns----->     {0.0, 0.0, 0.0, 20.3}
2. Create a method dropLowest() that is passed an int array nums and 
returns a copy of that array, except the lowest number in the array has 
been changed to 0.

Ex: 

subtract5FromAll4( {9, -2, 12, 8}  )   -------returns----->     {9, 0, 12, 8}
 */

public class moreAlteringArrays {

	/**
	 * The main method creates two arrays and calls two methods to change them.
	 * The noNegatives method replaces all negative numbers with 0.0 and the
	 * dropLowest method replaces the smallest number with 0. The updated arrays
	 * are saved and then printed using loops. A blank line separates the outputs.
	 */
	public static void main(String[] args) {
		
		double[] nums1 = {-2.3,2.1,-5.5,4.3};
		int[] nums2 = {3,-2,4,5,7,8};
		
		nums1 = noNegatives(nums1);
		nums2 = dropLowest(nums2);
	
		
		for(int i = 0; i < nums1.length; i++) {
			
			System.out.println(nums1[i]);
			
		}
		
		System.out.println();
		
		for(int i = 0; i < nums2.length; i++) {
			
			System.out.println(nums2[i]);
			
		}

	}

	/**
	 * The noNegatives method takes a double array as input and creates a new array.
	 * It loops through each value in the input array. If a value is negative, it
	 * stores 0.0 in the new array at the same position. Otherwise, it copies the
	 * original value. After checking all values, it returns the new array with no
	 * negative numbers.
	 */
	public static double[] noNegatives(double[] nums) {
		
		double[] result = new double[nums.length];

	    for (int i = 0; i < nums.length; i++) {
	    	
	        if (nums[i] < 0) {
	        	
	            result[i] = 0.0;
	            
	        } 
	        else {
	        	
	            result[i] = nums[i];
	            
	        }
	        
	    }

	    return result;
	    
	}
	
	/**
	 * The dropLowest method takes an int array as input and creates a new array.
	 * First, it finds the smallest number in the input array by looping through all values.
	 * Then, it loops through the array again. If a value equals the smallest number,
	 * it stores 0 in the new array at that position; otherwise, it copies the original value.
	 * Finally, it returns the new array with the lowest number replaced by 0.
	 * @param nums
	 * @return
	 */
	public static int[] dropLowest(int[] nums) {
		
		
		int[] result = new int[nums.length];

	    int lowest = nums[0];
	    
	    for (int i = 1; i < nums.length; i++) {
	    	
	        if (nums[i] < lowest) {
	        	
	            lowest = nums[i];
	            
	        }
	        
	    }

	    for (int i = 0; i < nums.length; i++) {
	    	
	        if (nums[i] == lowest) {
	        	
	            result[i] = 0;
	            
	        } 
	        else {
	        	
	            result[i] = nums[i];
	            
	        }
	        
	    }

	    return result;
	
	}
	
}
