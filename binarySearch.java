
public class BinarySearch {

/**
 * In the main the array nums is created and the int target is created to find the location of
 * the target number in the array and puts both of them into a SOP where a method is called to do
 * just that by inputing the arr and the int into the method parameters. Then it prints out the 
 * result.	
 * @param args
 */
	
	public static void main(String[] args) {
		
		int[] nums = {3,5,7,8,10,13,14,18};
		int target = 3;
		System.out.print(binarySearch(nums,target));

	}
	
/**
 * This method searches the target number given in the main and runs loops through if statements,
 * That cut the array in half every time it goes through the array and finds if the number is in
 * the first half or the second half. Once it finds that it cuts it and keeps cutting the array
 * until the middle of it is the number. Once it finds the location of the number it sends it back
 * to the main.
 * @param nums1
 * @param target
 * @return
 */
	
	public static int binarySearch(int[] nums1, int target) {
		
		int min = 0;
		int max = nums1.length-1;
		int mid = min+(max-min)/2;
		
		while(nums1[mid] != target) {
			
			mid = min+(max-min)/2;
			
			if(nums1[mid] > target) {
				
				max = mid;
				mid = max/2;
					
			}
			else if(nums1[mid] < target) {
					
				min = mid;
				mid = min+(max-min)/2;
					
				if (nums1[mid+1] == target) {
					
					mid = mid+1;
					
				}
				
			}
			
		}
		
		return mid;
		
	}

}
