import java.util.Scanner;

/**
 * Complete the following tasks in a single class called StringIntro (with a main method):

Precondition: the scanned String will always be more than 6 characters long.

1. In the main method, instantiate a Scanner object and then instantiate a 
String object equal to a scanned input. Be sure to close the scanner at the 
bottom of your main method before testing any code. 

2. Make and test a void method printSecondAndLastLetter that will print the 
second character and last character in the passed String.  

3. Make and test a method findTheEthat returns the index of the first 'e' 
character in a passed String. 

4. Make and test a method getLength that returns the amount of characters 
(the length) of a passed String. 

5. Make and test a void method printFirstAndLastThree that is passed a string 
and prints the first three and last three characters in a passed String. 

Example input: "Creatures"

Example output:

The second letter is r and the last letter is s.

The first e occurs at index 2.

The String is 9 characters long.

The first three characters are Cre and the last three characters are res.
 */

public class StringIntro {

	public static void main(String[] args) {
		
		//This line opens the scanner and declares it's name.
		Scanner inputReader = new Scanner(System.in);
		
		//This line takes the input of what ever is in the 
		//text prompt and stores it in a variable.
		String myLine = inputReader.nextLine();
		System.out.print("\n \n");
		//The following lines call the methods.
		printSecondAndLastLetter(myLine);
		System.out.println("The first e occurs at index: " + findTheE(myLine) + "\n ");
		System.out.println("The String is " + getLength(myLine) + " letters long" + "\n ");
		printFirstAndLastThree(myLine);
		
		inputReader.close();
		
	}
	
		/**
		 * This method prints the second and last letter of the given word in the prompt.
		 * @param inputLine
		 */
		public static void printSecondAndLastLetter(String inputLine) {
		
			//This line finds the second letter in the word.
			char myLetter1 = inputLine.charAt(1);
			//Prints out second letter.
			System.out.println("The second letter is: " + myLetter1 + "\n ");
			//Finds last letter.
			char myLetter2 = inputLine.charAt(inputLine.length() - 1);
			//Prints out last letter.
			System.out.println("The last letter is: " + myLetter2 + "\n ");
		
	}
	
		/**
		 * This method finds the location of e anywhere in the word.
		 * Then prints out the location in the word.
		 * @param inputLine
		 * @return
		 */
		public static int findTheE(String inputLine) {
			
			//This finds the location of the letter 'e'
			int eLocation = inputLine.indexOf('e');
			//This returns the int variable of the location of 'e'
			return eLocation;
		
	}
	
		/**
		 * This method gets the length of the word printed in the prompt.
		 * @param inputLine
		 * @return
		 */
		public static int getLength(String inputLine) {
		
			//This finds the length of the given line.
			int lengthOfString = inputLine.length();
			//This returns the length to the main.
			return lengthOfString;
		
	}
	
		/**
		 * This prints the first three letters and last three letters. 
		 * @param inputLine
		 */
		public static void printFirstAndLastThree(String inputLine) {
		
			//This line finds the first three letters.
			String firstThree = new String ( inputLine.substring(0, 3) );
			//This line prints out the first three letters.
			System.out.println("The first three letters is: " + firstThree + "\n ");
			//This line finds the last three letters.
			String lastThree = inputLine.substring(inputLine.length() - 3);
			//This line prints out the last three letters.
			System.out.println("The last three letters is: " + lastThree);
		
	}

}
