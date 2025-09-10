/**
 * Simple Homework Program
 * Task 1: Print your name in ASCII art using "O".
 * Task 2: Compute a math problem.
 * Task 3: Print the circumference and area of a circle.
 */

package Homework;

public class HomeWorkPracticingSystemAndPrimitives {
    public static void main(String[] args) {
        
        // ---------------- Task 1 ----------------
        // Print a title for Task 1
        System.out.println("Task 1: ASCII Art\n");
        
        /**
         * These lines all together print out the each "0" with a specific 
         * amount of spaces in between to print out an ascii art of my name. 
         * After every row it goes to the next row.
         */
        System.out.println("   OOO      OOO      OOOO     OOO     OOO  "); 
        System.out.println("     O     O   O    O        O   O    O  O ");
        System.out.println("     O     OOOO     O        O   O    OOO  ");
        System.out.println("O    O     O   O    O        O   O    O  O ");
        System.out.println(" OOO       O   O     OOOO     OOO     OOO  ");
        
        // ---------------- Task 2 ----------------
        // Print a title for Task 2
        System.out.println("\nTask 2 result:");
        
        // This line does the math problem then stores it in a variable (result).
        double result = 6.0 * (3.5 - 1.5 * 5) / (55.6 - 30.2);
        
        // This line prints out the variable (result).
        System.out.println(result);
        
        // ---------------- Task 3 ----------------
        // This assigns the variable radius with the given number for the radius.
        double radius = 4.0;
        
        // This assigns the variable pi with the number for pi.
        final double pi = 3.14;
        
        /**
         *  This assigns the variable circumference by using the variables pi 
         *  and radius to come up with the number for the circumference
         */
        double circumference = 2 * pi * radius;
        
        /**
         *  This line calls the previous variables into an eqn to come up 
         *  with the number for area then assigns that number to the variable area.
         */
        double area = pi * radius * radius;

        // Print a title for Task 3
        System.out.println("\nTask 3 result:");
        
        // This line prints out the circumference of the circle.
        System.out.println("The circumference of the circle is " + circumference);
        
        // This line prints out the area of the circle.
        System.out.println("The area of the circle is " + area);
    }
}
