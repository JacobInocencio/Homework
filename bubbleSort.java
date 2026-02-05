
public class SwapCW {
	/**
	 * This is the main. In it an array is created. After a loop
	 * is made to print out each element from the array after the
	 * method is called.
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] nums = {9,2,3,4,1,6,7,8,5};
		bubbleSearch(nums);
		
		for(int i = 0; i < nums.length; i++) {
			
			System.out.println(nums[i]);
			
		}

	}
	/**
	 * This method sorts the array from smallest to biggest.
	 * It goes through the array over and over, compares numbers
	 * next to each other, and swaps them if they are out of order.
	 * When it’s done, the array is sorted and returned.
	 * @param tempNum
	 * @return
	 */
	public static int[] bubbleSearch(int[] tempNum) {
		
		for (int HAHA : tempNum) {
			for(int i = 0; i < tempNum.length-1; i++) {
			
				int temp = tempNum[i];
			
				if (tempNum[i+1] < tempNum[i]) {
				
					tempNum[i] = tempNum[i+1];
					tempNum[i+1] = temp;
				
				}
			
			}
		}
		
		return tempNum;
		
	}
	
}
