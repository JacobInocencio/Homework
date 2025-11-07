public class Multiply {

	public static void main(String[] args) {
		
		//Prints out the result
		System.out.print(multiply(2,2));

	}
	
	/**
	 * This multiplies int a and int b
	 * without using * and by using a for
	 * loop to multiply by adding the two
	 * ints by the other int.
	 * @param a
	 * @param b
	 * @return
	 */
	public static int multiply(int a, int b) {
		
		//This line declares the variable count as 0
	    int count = 0;
	    
	    //Repeats the addition process 'b' times
	    for(int i = 0; i < b; i++) {
	    	
	    	//Adds 'a' to the count each time
	        count += a;
	        
	    }
	    //Return the final product
	    return count;
	    
	}
	
}
