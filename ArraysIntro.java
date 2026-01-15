/**
1. Create an empty array that is meant to represent doubles. 
Name it doubArr.Repeat this for arrays that represent ints, 
booleans, String objects, and Circle objects. 

2. Create an array of ints with the following represented 
values: 7, -12, 88, -88, 0, 5, 2000.

3. Create an array that represents 5 String objects with default 
values. Name the array fruitsArr. In the comment for this task, 
state what each element's default value is. State what the default 
value for ints, doubles, booleans, and any reference data type is 
as well. 

4. Change the 2nd element in fruitsArr to "Bapple" .

5. Change the last element in fruitsArr to "Zanana" . Accomplish 
this without typing the number "4" and instead accessing the array's 
length.

6. To verify you did number 4 correctly, print out the second element 
of fruitsArr.

7. Create a loop that one by one prints out each element in fruitsArr.
*/


public class ArraysIntro {

	public static void main(String[] args) {
		
		//These lines declare new arrays like double, int, boolean, String, and Circle.
		double[] doubArr;
		int[] intArr;
		boolean[] boolArr;
		String[] StrArr;
		Circle[] circArr;
		
		//This line assigns specific values to the array.
		int[] contInts = {7, -12, 88, -88, 0, 5, 2000};
		
		//This line creates an array that represents 5 String objects with default values.
		//String = nulls
		//Ints = 0
		//Doubles = .0
		//Booleans = False
		//Circle = nulls
		String[] fruitsArr = new String[5];

		//This line changes the second value to "Bapple"
		fruitsArr[1] = "Bapple";
		
		//This line changes the last element in fruitsArr to "Zanana".
		fruitsArr[fruitsArr.length-1] = "Zanana";
		
		//This line prints out the result of number 4 and prints out "Bapple"
		System.out.println(fruitsArr[1]);
		
		//This loop goes through every element in the array and prints out each one.
		for(int i = 0; i < fruitsArr.length; i++) {
			
			System.out.println(fruitsArr[i]);
			
		}
		
	}

}
