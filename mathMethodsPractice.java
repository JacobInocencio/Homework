/**
 * Complete the following tasks in the main method by using the 
 * dot operator to call methods in the Math class:

Before calling any methods, initialize at least one positive 
double variable and one negative double variable. Also do this 
for ints. Call them posInt, negInt, posDouble, and negDouble. 
(Note: if any methods do not work, comment them out.)

1. Use the abs() method to print out the absolute value of all 
your variables. In a comment, say whether or not this method is 
overloaded and how you know your answer. 

2. Use the pow() method in order to find the result of the positive 
int to the power of the negative int, and to find the negative int 
to the power of the positive one. In a comment, say whether or not 
this method is overloaded and how you know your answer. 

3. Use the sqrt() method to find the square root of each variable 
you declared. In a comment, answer whether or not you expected any 
errors and why you think there weren't any. 

4. Use the random() method to generate a random number from 11 to 
20. Try to accomplish this without the use of any online aid and 
only by looking at the Math class' documentation. 
 */


package Homework;


public class MathMethodsPractice {

	public static void main(String[] args) {
		//These lines assign the variables to numbers so that they can be called in methods.
		int posInt = 1;
		int negInt = -1;
		double posDouble = 1.0;
		double negDouble = -1.0;
		
		//These lines call the methods to make sure they work.
		showAbs(posInt, negInt, posDouble, negDouble);
		System.out.println(" \n");
		showPow(posInt, negInt);
		System.out.println(" \n");
		showSqrt(posInt, negInt, posDouble, negDouble);
		System.out.println(" \n");
		showRandom();
		
	}

	/**
	 * This method takes the main values and inserts them into SOPs to find the absolute value.
	 */
	 public static void showAbs(int posInt, int negInt, double posDouble, double negDouble) {
		 	/*
		 	 * These lines take the stuff given in the parameters and inserts them into the SOPs
		 	 * to find the Absolute Value.
		 	 */
	        System.out.println("Absolute Values:\n");
	        System.out.println("abs(posInt) = " + Math.abs(posInt));
	        System.out.println("abs(negInt) = " + Math.abs(negInt));
	        System.out.println("abs(posDouble) = " + Math.abs(posDouble));
	        System.out.println("abs(negDouble) = " + Math.abs(negDouble));
	        // abs() IS overloaded.
	        // There are multiple versions of abs() that accept int, long, float, and double.
	        // We know because we can call it with both int and double variables.
	}
	 
	 /**
	  * This method takes the main values that are ints and inserts them into SOPs to find the Pow.
	  */
	 public static void showPow(int posInt, int negInt) {
		 	/*
		 	 * These lines take the stuff given in the parameter and inserts it into the SOPs 
		 	 * to find the Pow of them.
		 	 */
	        System.out.println("Powers:\n");
	        System.out.println("posInt ^ negInt = " + Math.pow(posInt, negInt));
	        System.out.println("negInt ^ posInt = " + Math.pow(negInt, posInt));
	        // No, pow() is NOT overloaded.
	        // It always takes two doubles as arguments (Math.pow(double a, double b)).
	        // Even if we pass ints, they are promoted to doubles.
	}
	 /**
	  * This method takes the main values and inserts them into the SOPs to find the Square root.
	  */
	 public static void showSqrt(int posInt, int negInt, double posDouble, double negDouble) {
		 	/*
		 	 * These lines take the stuff given in the parameters and inserts them into the SOPs to
		 	 * find the Square root of the given values.
		 	 */
	        System.out.println("Square Roots:\n");
	        System.out.println("sqrt(posInt) = " + Math.sqrt(posInt));
	        System.out.println("sqrt(negInt) = " + Math.sqrt(negInt));
	        System.out.println("sqrt(posDouble) = " + Math.sqrt(posDouble));
	        System.out.println("sqrt(negDouble) = " + Math.sqrt(negDouble));
	        // I expected an error for negative numbers,
	        // but there isn't a runtime error — instead Math.sqrt() returns NaN (Not a Number).
	        // That’s how Java handles invalid roots instead of crashing.
	}
	 
	 /**
	  * This method produces a random number between 11 and 20.
	  */
	 public static void showRandom() {
		 	/*
		 	 * This line declares the variable f with the Math.random from the math library 
		 	 * divided by the Math.nextDown(1.0).
		 	 */
		 	double f = Math.random()/Math.nextDown(1.0);
		 	/*
		 	 * This declares the variable x as an equation that takes the random number in 
		 	 * f and turns it into a random number from 11 to 20.
		 	 */
		 	double x = 11*(1.0 - f) + 21*f;
		 	//This line prints out the result of the random number as an int.
		 	System.out.print("Random:" + (int)x);
	}

}
