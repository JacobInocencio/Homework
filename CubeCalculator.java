/**
 * n a class called CubeCalculator, accomplish the 
 * following tasks in the main method. The code must be 
 * adaptable.

1. Declare a side length as a double 2. Calculate its 
surface area 3. Calculate its volume 4. Print them as ints 
(with full sentence) 5. Well documented
 */

public class CubeCalculator {

	public static void main(String[] args) {
		
		        //This instantiates the side length of the cube as 12.
		        double sideLength = 12;
		        
		        //This line calculates the surfaceArea of the cube by putting it in an equation and instantiating the result of the equation into the variable surfaceArea.
		        double surfaceArea = 6 * Math.pow(sideLength, 2);

		        //This line uses an equation to find the volume of the cube and then instantiates the result into the variable volume.
		        double volume = Math.pow(sideLength, 3);

		        
		        //Print results out.
		        System.out.println("Side length: " + (int)sideLength);
		        System.out.println("Surface area: " + (int)surfaceArea + " square units");
		        System.out.println("Volume: " + (int)volume + " cubic units");


	}

}

