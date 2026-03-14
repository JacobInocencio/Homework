
public class twoDArraySort {

	public static void main(String[] args) {
		
		//This creates a three by three double grid
		double[][] gridNums = {
						  {5.2, 1.1, 9.4},
	            		  {3.3, 7.7, 2.8}
					     };

			//Call method to check if it works
	        sortRowMajor(gridNums);
	        //Prints out the array
	        printArray(gridNums);

	    }

	//ROW-MAJOR SELECTION SORT
	public static void sortRowMajor(double[][] arr) {
		
		//
		int rows = arr.length;
		int cols = arr[0].length;
		int totalArr = rows * cols;
		
		for (int i = 0; i < totalArr - 1; i++) {
			
			int thisRow = i / cols;
			int thisCol = i % cols;
			
			int minRow = thisRow;
			int minCol = thisCol;
			
			for (int j = i + 1; j < totalArr; j++) {
				
				int minLocRow = j / cols;
				int minLocCol = j % cols;
				
				if (arr[minLocRow][minLocCol] < arr[minRow][minCol]) {
					
					minRow = minLocRow;
					minCol = minLocCol;
					
				}
				
			}
			
			double temp = arr[thisRow][thisCol];
			arr[thisRow][thisCol] = arr[minRow][minCol];
			arr[minRow][minCol] = temp;
			
		}
		
	}
    
    
    //PRINT ARRAY
	public static void printArray(double[][] arr) {
       
		for (int r = 0; r < arr.length; r++) {
            
			for (int c = 0; c < arr[0].length; c++) {
               
				System.out.print(arr[r][c] + " ");
           
			}
			
            System.out.println();
            
        }
		
        System.out.println();
        
    }
    
}
