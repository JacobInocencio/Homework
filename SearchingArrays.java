/**
 * 1. Create a method checkFor4() that is passed an int array and 
 * returns true if that array has a 4 and false if that array has no 4's. 

2. Create a method countFor4() that is passed an int array and 
returns how many times 4 shows up in the array. 

3. Create a method checkForFour4() that is passed an int array and 
return true if the array has exactly four 4's in it. 
 */


public class searchingArr {

	public static void main(String[] args) {
		
		int[] fours = {0,3,2,5,1};
		System.out.print("IS THERE 4?: " + checkFor4(fours));
		System.out.println();
		System.out.print("4 SHOWS: " + countFor4(fours));
		System.out.println();
		System.out.print("How many?: " + checkForFour4(fours));

	}
	
/**
 * This method checks if there are any 4s by going through each element in the array and
 * then if it comes across a 4 it returns true if not it is false.
 * @param nums
 * @return
 */
	
	public static boolean checkFor4(int[] nums) {
		
		boolean is4 = false;
		for(int temp : nums) {
			
			if (temp == 4) {
				
				is4 = true;
				
			}
			
		}
		
		return is4;
		
	}
	
/**
 * This method goes through each element and checks if they are a 4, if it is it adds to the
 * count and at the end it returns the count of 4s.
 * @param nums
 * @return
 */
	
	public static int countFor4(int[] nums) {
		
		int count = 0;
		for(int temp : nums) {
			
			if (temp == 4) {
				
				count++;
				
			}
			
		}
		
		return count;
		
	}

/**
 * This method goes through every element in the arrays and checks if they are 4.
 * Then if it is a 4 it adds to the count at the end the count is checked and if there
 * is exactly four 4s then it returns true. If there isn't or there is more than it returns
 * false.
 * @param nums
 * @return
 */
	
	public static boolean checkForFour4(int[] nums) {
		
		boolean fourEle = false;
		int fourCount = 0;
		for(int temp : nums) {
			
			if(temp == 4) {
				
				fourCount++;
				
			}
			
		}
		
		if(fourCount == 4) {
			
			fourEle = true;
			
		}
		
		return fourEle;
		
	}
	
}
