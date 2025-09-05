package Homework;

/**
 * Simple Homework Program
 * Task 1: Print your name in ASCII art using "O".
 * Task 2: Compute a math problem.
 * Task 3: Print the circumference and area of a circle.
 */

public class HomeWorkPracticingSystemAndPrimitives {
    public static void main(String[] args) {
        
        // ---------------- Task 1 ----------------
        // Print a title for Task 1
        System.out.println("Task 1: ASCII Art\n");
        
        // Print each row of ASCII art for the name "JACOB"
        // Each System.out.println prints one line of the picture
        System.out.println("   OOO      OOO       OOOO     OOO      OOO "); 
        System.out.println("     O     O   O    O        O   O    O   O");
        System.out.println("     O     OOOO     O        O   O    OOO  ");
        System.out.println("O    O     O   O    O        O   O    O  O ");
        System.out.println(" OOO       O   O     OOOO     OOO     OOO  ");
        
        // ---------------- Task 2 ----------------
        // Print a title for Task 2
        System.out.println("\nTask 2 result:");
        
        // Compute the math expression and store it in a variable
        double result = 6.0 * (3.5 - 1.5 * 5) / (55.6 - 30.2);
        
        // Print the result of the math expression
        System.out.println(result);
        
        // ---------------- Task 3 ----------------
        // Store the circle's radius
        double radius = 4.0;
        
        // Store the value of pi
        double pi = 3.14;
        
        // Compute the circumference using formula: 2 * pi * radius
        double circumference = 2 * pi * radius;
        
        // Compute the area using formula: pi * radius^2
        double area = pi * radius * radius;

        // Print a title for Task 3
        System.out.println("\nTask 3 result:");
        
        // Print the circle's circumference
        System.out.println("The circumference of the circle is " + circumference);
        
        // Print the circle's area
        System.out.println("The area of the circle is " + area);
    }
}

