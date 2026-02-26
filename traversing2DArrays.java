
/**
1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns 
using the new keyword. 

2. Instantiate a 2-D array with the following values:

4   5    7

2  -1   8

0  1   3

For the following problems, print out those elements before and after to 
verify it worked. 

3. For both of those arrays, change the element in the first row, first 
column to a 17.

4. For both of those arrays, change the element in the second row, third 
column into a 20. 

5. For both of those arrays, change the last element in the first row to 
a -5. Accomplish this using .length 

6. For both of those arrays, change the first element in the last row to 
a -7. Accomplish this using .length 

7. For both of those arrays, change the last element in the last row to 
a -30. Accomplish this using .length 

8. Create a method that is passed a 2-D array of ints and one by one prints 
out each element in the first row. 

9. Create a method that is passed a 2-D array of ints and one by one prints 
out each element in the first column.

10. Create a method that is passed a 2-D array of ints and one by one prints 
out each element in row-major order. 

11. Create a method that is passed a 2-D array of ints and one by one prints 
out each element in column-major order. 
 */

public class twoDArrays {

	public static void main(String[] args) {
		
		//1. Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
		int[][] gridNums = {
				            {0,0,0,0,0,0},
				            {0,0,0,0,0,0},
				            {0,0,0,0,0,0},
				            {0,0,0,0,0,0}
		                   };
		
		/**
		 * Instantiate a 2-D array with the following values:

			4   5    7

			2  -1   8

			0  1   3
		 */
		int[][] gridNums2 = { 
				            {4,5,7},
				            {2,-1,8},
				            {0,1,3},
		                   };
		
		//3. For both of those arrays, change the element in the first row, first column to a 17.
		System.out.println(gridNums[0][0]);
		gridNums[0][0] = 17;
		System.out.println(gridNums[0][0]);
		System.out.println();
		
		System.out.println(gridNums2[0][0]);
		gridNums2[0][0] = 17;
		System.out.println(gridNums2[0][0]);
		System.out.println();
		System.out.println();
		
		//4 For both of those arrays, change the element in the second row, third column into a 20.
		System.out.println(gridNums[1][2]);
		gridNums[1][2] = 20;
		System.out.println(gridNums[1][2]);
		System.out.println();
		
		System.out.println(gridNums2[1][2]);
		gridNums2[1][2] = 20;
		System.out.println(gridNums2[1][2]);
		System.out.println();
		System.out.println();
		
		//5. For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 
		System.out.println(gridNums[0][gridNums.length-1]);
		gridNums[0][gridNums.length-1] = -5;
		System.out.println(gridNums[0][gridNums.length-1]);
		System.out.println();
		
		System.out.println(gridNums2[0][gridNums2.length-1]);
		gridNums2[0][gridNums2.length-1] = -5;
		System.out.println(gridNums2[0][gridNums2.length-1]);
		System.out.println();
		System.out.println();
		
		//6. For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length
		System.out.println(gridNums[gridNums.length-1][0]);
		gridNums[gridNums.length-1][0] = -7;
		System.out.println(gridNums[gridNums.length-1][0]);
		System.out.println();
		
		System.out.println(gridNums2[gridNums2.length-1][0]);
		gridNums2[gridNums2.length-1][0] = -7;
		System.out.println(gridNums2[gridNums2.length-1][0]);
		System.out.println();
		System.out.println();
		
		//7. For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 
		System.out.println(gridNums[gridNums.length-1][gridNums.length-1]);
		gridNums[gridNums.length-1][gridNums.length-1] = -30;
		System.out.println(gridNums[gridNums.length-1][gridNums.length-1]);
		System.out.println();
		
		System.out.println(gridNums2[gridNums2.length-1][gridNums2.length-1]);
		gridNums2[gridNums2.length-1][gridNums2.length-1] = -30;
		System.out.println(gridNums2[gridNums2.length-1][gridNums2.length-1]);
		System.out.println();
		System.out.println();
		
		//This is where I call on the methods to check if they work.
		
        //8. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 
		firstRow(gridNums);
		System.out.println();
		System.out.println();
		firstRow(gridNums2);
		System.out.println();
		System.out.println();
		System.out.println();
		
		//9. Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.
		firstColumn(gridNums);
		System.out.println();
		System.out.println();
		firstColumn(gridNums2);
		System.out.println();
		System.out.println();
		System.out.println();
		
		//10. Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 
		printArrRow(gridNums);
		System.out.println();
		System.out.println();
		printArrRow(gridNums2);
		System.out.println();
		System.out.println();
		System.out.println();
		
		//11. Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 
		printArrCol(gridNums);
		System.out.println();
		System.out.println();
		printArrCol(gridNums2);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}

	/**
	 * This method takes a 2-D array and prints out each element in the first row 
	 * by using a for loop to go through all the elements in the first element 
	 * in the array then prints it out.
	 * @param arr
	 */
	public static void firstRow(int arr[][]) {
		
		for(int i = 0; i < arr[0].length; i++) {
			
			System.out.print(arr[0][i] + " ");
		
		}
		
	}
	
	/**
	 * This method takes a 2-D array and uses a for each loop to go through each
	 * element in the array and prints out the first element from each element.
	 * @param arr
	 */
	public static void firstColumn(int arr[][]) {
		
		for(int []i : arr) {
			
			System.out.println(i[0]+"");
			
		}
		
	}
	
	/**
	 * This method takes a 2-D array and prints out each element one by one
	 * The first for loop goes element by element in the array while the second 
	 * for loop goes through every element in each element and prints them out.
	 * After that it goes to the next line to print out the next element.
	 * @param arr
	 */
	public static void printArrRow(int arr[][]) {
		
		for(int j = 0; j < arr.length; j++) { 
			
			for(int i = 0; i < arr[j].length; i++) {
			
				System.out.print(arr[j][i] + " ");
			
			}
			
			System.out.println();
			
		}
		
	}
	
	/**
	 * This method takes a 2-D array and prints out the first element of each 
	 * element then goes to the next column and prints out the 2nd element of each
	 * element and so on until all the columns are printed.
	 * @param arr
	 */
	public static void printArrCol(int arr[][]) {
		
		for(int j = 0; j < arr[0].length; j++) { 
			
			for(int i = 0; i < arr.length; i++) {
			
				System.out.print(arr[i][j] + " ");
			
			}
			
			System.out.println();
			
		}
		
	}
	
}
