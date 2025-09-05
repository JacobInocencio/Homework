package Homework;

/**
 * Complete each of the following problems without any online aid.
 *
 * Task 1: Print out your name using the letter "O" in ASCII art.
 * Task 2: Compute a math problem.
 * Task 3: Print the circumference and area of a circle.
 */

public class HomeWorkPracticingSystemAndPrimitives {
    public static void main(String[] args) {

        // Task 1: Print your name in ASCII art using "O"
        // Store your name in a string variable so it can be easily changed
        String name = "JACOB"; // <-- Change this to your name

        // Create a 2D array containing the ASCII art representation of each letter
        // Each inner array represents a letter, each string is a row of the ASCII art
        String[][] asciiArt = {
            // J
            {"   OOO", "     O", "     O", "O    O", " OOO "},
            // A
            {"  OOO  ", " O   O ", " OOOO  ", " O   O ", " O   O "},
            // C
            {"  OOOO", " O    ", " O    ", " O    ", "  OOOO"},
            // O
            {"  OOO  ", " O   O ", " O   O ", " O   O ", "  OOO  "},
            // B
            {" OOO ", " O  O", " OOO ", " O  O", " OOO "}
        };

        // Create a map to connect letters to their corresponding index in the asciiArt array
        java.util.Map<Character, Integer> letterMap = new java.util.HashMap<>();
        letterMap.put('J', 0);
        letterMap.put('A', 1);
        letterMap.put('C', 2);
        letterMap.put('O', 3);
        letterMap.put('B', 4);

        // Print a header for Task 1
        System.out.println("Task 1: ASCII Art\n");

        // Loop over each row of the ASCII art (5 rows total)
        for (int row = 0; row < 5; row++) {
            // Loop over each letter in the name
            for (int i = 0; i < name.length(); i++) {
                // Convert the letter to uppercase to match the map keys
                char letter = Character.toUpperCase(name.charAt(i));
                // If the letter exists in our map, print its corresponding row of ASCII art
                if (letterMap.containsKey(letter)) {
                    System.out.print(asciiArt[letterMap.get(letter)][row] + "  ");
                } else {
                    // If the letter is not supported, print blank spaces
                    System.out.print("       ");
                }
            }
            // Move to the next row
            System.out.println();
        }

        // Task 2: Compute the math problem
        // Print an empty line for spacing
        System.out.println(" ");
        // Print a header for Task 2
        System.out.println("Task 2 result:");
        // Compute and print the result in one statement
        System.out.println(6.0 * (3.5 - 1.5 * 5) / (55.6 - 30.2));

        // Task 3: Compute circumference and area of a circle
        // Store the radius of the circle
        double radius = 4.0;
        // Store the value of pi
        double pi = 3.14;
        // Compute the circumference using the formula 2 * pi * radius
        double circumference = 2 * pi * radius;
        // Compute the area using the formula pi * radius^2
        double area = pi * radius * radius;
        // Print a header for Task 3
        System.out.println("\nTask 3 result:");
        // Print the circumference and area using string concatenation
        System.out.println("The circumference of the circle is " + circumference +
                           " and the area of the circle is " + area + ".");
    }
}
