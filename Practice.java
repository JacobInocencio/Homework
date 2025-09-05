package Homework; // Declares the package (folder) this class belongs to

public class ModulusCompoundOperatorsAndCastingPractice { // Defines the class
    public static void main(String[] args) { // Main method, program starts here
        
        // =====================
        // PART ONE: MODULUS
        // =====================
        System.out.println("PART ONE: MODULUS"); // Print section title

        System.out.println(14 % 13);  // Prints remainder of 14 ÷ 13 → 1
        System.out.println(8 % 11);   // Prints remainder of 8 ÷ 11 → 8
        System.out.println(6 % 2);    // Prints remainder of 6 ÷ 2 → 0
        System.out.println(7 % 2);    // Prints remainder of 7 ÷ 2 → 1
        System.out.println(274 % 10); // Prints remainder of 274 ÷ 10 → 4
        System.out.println(881 % 2);  // Prints remainder of 881 ÷ 2 → 1
        System.out.println();         // Prints a blank line for spacing

        // =====================
        // PART TWO: COMPOUND OPERATORS
        // =====================
        System.out.println("PART TWO: COMPOUND OPERATORS"); // Print section title

        int x = 0, y = 1, z = 2; // Declare three variables x=0, y=1, z=2

        x--;    // Decrease x by 1 → x = -1
        y++;    // Increase y by 1 → y = 2
        z += y; // Add y to z → z = 2 + 2 = 4

        // Print results of first block
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        int a = 3, b = 5, c = 2; // Declare three variables a=3, b=5, c=2

        a = c * 2; // Multiply c by 2 and store in a → a = 4
        b = b / 2; // Divide b by 2 (integer division) → b = 2
        c++;       // Increase c by 1 → c = 3

        // Print results of second block
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println(); // Print blank line for spacing

        // =====================
        // PART THREE: CASTING
        // =====================
        System.out.println("PART THREE: CASTING"); // Print section title

        int total = 5 + 7 + 2; // Add numbers together → total = 14

        // Option A: Divide total by 3 first (integer division), then cast to double
        System.out.println("Option A: " + (double)(total / 3)); // Prints 4.0 (wrong)

        // Option B: Divide total by 3 with integer division (no casting)
        System.out.println("Option B: " + total / 3); // Prints 4 (wrong)

        // Option C: Cast total to double first, then divide → gives correct average
        System.out.println("Option C: " + (double)total / 3); // Prints 4.666... (correct)
    }
}
