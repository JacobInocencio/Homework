
public class CubeCalculator {

	public static void main(String[] args) {
		
		        /** 
		         * 1. Declare the side length of the cube 
		         * (easily adaptable by changing this value). 
		         * This line is where you can change the value 
		         * of the side length and it declares the value 
		         * of sideLength
		         */
		        double sideLength = 12;
		        
		        /*
		         * 2. Calculate the surface area of the cube. 
		         * This line uses Math.pow to calculate the surface 
		         * area by first finding the surface area of one side 
		         * then multiplying by the 6 sides of a cube
		         */
		        double surfaceArea = 6 * Math.pow(sideLength, 2);

		        /**
		         *  3. Calculate the volume of the cube. This line 
		         *  That line calculates the cube’s volume by raising 
		         *  the variable sideLength to the power of 3 
		         *  (sideLength × sideLength × sideLength) and stores 
		         *  the result in the volume variable.
		         */
		        double volume = Math.pow(sideLength, 3);

		        
		        // 4. Print results as integers (rounded automatically by casting).
		        System.out.println("Side length: " + (int)sideLength);
		        System.out.println("Surface area: " + (int)surfaceArea + " square units");
		        System.out.println("Volume: " + (int)volume + " cubic units");


	}

}
