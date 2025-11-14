package Homework;

/**
 * Create a class with a main method. Inside the 
 * class, create the following methods:

1. Create a method countLetters() that is passed a String 
and a char and returns how many times that passed char shows 
up in the passed String. Examples:

countLetters( "abqcdqefghqqijk" , q ) -----returns----> 4

countLetters ( "aaabaabaab" , b ) ----returns---> 3

2. Create a method getFactorial() that is passed an int and 
returns the factorial of that int (a factorial is a number 
multiplied by each number before it. For example, 5! = 5 x 4 x 3 x 2 x 1)

Examples:

getFactorial ( 5 ) ----returns---> 120

3. Create a method getIfRepeats() that will return true if 
the passed String has two of the same letter next to each 
other, and returns false if not.

Examples:

printIfRepeats ( "abcde" ) ---returns---> false

printIfRepeats ( "abcce" ) ---returns---> true
 */

public class LoopsIntroPractice {

    public static void main(String[] args) {
    	
        // Test the methods here if you want
        System.out.println(countLetters("Weather", 'e'));
        
        System.out.println(countLetters("Awesome", 'e'));
        
        System.out.println(getFactorial(6));
        
        System.out.println(getIfRepeats("abcdefg"));
        
        System.out.println(getIfRepeats("abbcdeffg"));
    }

    //Count how many times a char appears in a String
    public static int countLetters(String a, char b) {
    	
    	//Counter for to return the times the letter appears
        int count = 0;
        
        //Loop to go through the word and count each time it appears
        for (int num = 0; num < a.length(); num++) {
        	
        	//If statement to run every time the specific letter appears
            if (a.charAt(num) == b) {
            	
            	//adds one to the count when the letter appears
                count++;
                
            }
            
        }
        
        //returns the final count of how many times the letter appeared in the word
        return count;
        
    }
    

    //Return the factorial of a number
    public static int getFactorial(int a) {
    	
    	//Starts the result as one
        int result = 1;
        
        //loops it however many times the number you put in and runs until the number it 1
        for (int num = a; num >= 1; num--) {
        	
        	//multiplies the result by the number of times you inputed
            result *= num;
            
        }
        
        //returns the final result to the main method.
        return result;
        
    }
    

    //Return true if the string has two identical letters next to each other
    public static boolean getIfRepeats(String s) {
    	
    	//loop to go through the word to find repeating letters
        for (int num = 0; num < s.length() - 1; num++) {
        	
        	//if statement to find if the next letter is the same as the current letter
            if (s.charAt(num) == s.charAt(num + 1)) {
            	
            	//returns true if the statement is true
                return true;
                
                
            }
            
        }
        
        //returns false if the statement was false and there are no repeating letters
        return false;
    }
}

