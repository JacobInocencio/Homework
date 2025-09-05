
/**
 1. Create a nonvoid method called giveName() that returns your name. 
 Repeat this task for giveEyeColor(), giveHairStyle(), giveBestFriend(), 
 and giveFavoriteFood(). Then, call giveName(), giveHairStyle, and 
 giveFavoriteFood(). Use the calls to make a full print statement. 

2. Create a nonvoid method getCircleStats() that is passed a double 
(meant to represent a circle's radius) and calculates then returns the 
radius, diameter, circumference, and area of the circle. Call the method 
in a print statement or variable declaration in order to make a complete 
print statement of all the properties. 

3. Create nonvoid methods that are passed two ints and returns their sum, 
difference, product, quotient, and the remainder (using modulus) of the 
first number modulus the second number; all operations should be their 
own respective methods. Call them inside print statements to make sure 
they work. 
 */

public class NonMethods {

	public static void main(String[] args) {

	//Main
	
	//The following lines print out what is returned to them from the nonvoid methods.
	//Task 1
	System.out.println("Profile:");
	System.out.println(" ");
	System.out.println(giveName());
	System.out.println(giveHairStyle());
	System.out.println(giveFavoriteFood());
	System.out.println(" ");
	System.out.println(" ");
	
	//Task 2
	System.out.println("Circle Stats:");
	System.out.println(" ");
	System.out.println(getCircleStats(7.0));
	System.out.println(" ");
	System.out.println(" ");
	
	//Task 3
	System.out.println("Math Stuff:");
	System.out.println(" ");
	System.out.println(getMathsStuffs(3,8));
	
}

	/**
	 * This nonvoid method returns my First and Last name.
	 */
	public static String giveName() {
		
		return "Jacob Inocencio";
		
	}
	
	
	/**
	 * This nonvoid method returns my Eye color.
	 */
	public static String giveEyeColor() {
		
		return "Eye Color: Brown";
		
	}
	
	
	/**
	 * This nonvoid method returns my Hair style.
	 */
	public static String giveHairStyle() {
		
		return "Hair Style: Middle Part";
		
	}
	
	
	/**
	 * This nonvoid method returns who my best friend is.
	 */
	public static String giveBestFriend() {
		
		return "Best Friend: Jesus";
		
	}
	
	
	/**
	 * This nonvoid method returns my favorite food.
	 */
	public static String giveFavoriteFood() {
		
		return "Favorite Food: Water :)";
		
	}
	
	
	/**
	 * This is a nonvoid method that returns the results
	 * of the math problems to print it out in the main method.
	 */
	public static String getCircleStats(double r) {
       
		//These 4 lines use math to determine the values.
		double diameter = 2 * r;
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        //These print out the results of the last 4 lines.
        return "Radius: " + r + 
        		"\nDiameter: " + diameter + 
        		"\nCircumference: " + circumference + 
        		"\nArea: " + area;

	}
	
	
	/**
	 * This nonvoid method takes 2 variables that are given 
	 * in the main class and uses SOPs to do math
	 * and then returns the outcomes to the main to be
	 * printed out.
	 */
	public static String getMathsStuffs(int a, int b) {
		
		//These lines print out the result of the math eqns.
		return "Sum: " + (a + b) + 
				"\nDifference: " + (a - b) + 
				"\nProduct: " + (a * b) + 
				"\nQuotient: " + (a / b) + 
				"\nRemainder: " + (a % b);
		
	}
	
}
