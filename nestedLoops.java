
public class NestedLoops {

	public static void main(String[] args) {
		
		//multTable is a method that can be given any number to make a  table for. 
		multTable(6);
	           
	       }
		
	/**
	 * This method takes the given int and passes it through a for loop that 
	 * creates rows and columns for the multiplication table. 
	 */
	public static void multTable(int a) {
		
		//This for loop creates the columns and rows of the number given to the method.
		for (int row = 1; row < a+1; row++) {
			
			   //This for loop takes the number and makes the columns for the amount that was passed to the method.
	           for (int col = 1; col < a+1; col++) {
	        	   
	        	   //This line prints out the number by multiplying the rows by the columns.
	               System.out.print(row * col + "\t");
	               
	           }
	           
	           //This moves to the next line.
	           System.out.println();
	           System.out.println();
	           
		}
	
	}

}
