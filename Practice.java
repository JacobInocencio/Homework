package Homework;

/**
 * //PART ONE: MODULUS
//What would each of the following 1-6 lines including the modulo operator cause to be printed?
     System.out.println(14 % 13);
     System.out.println(8 % 11);
     System.out.println(6 % 2);
     System.out.println(7 % 2);
     System.out.println(274 % 10);
     System.out.println(881 % 2);

//PART TWO: COMPOUND OPERATORS AND SHORTCUTS (credits to runestone.academy)

    int x = 0;
    int y = 1;
    int z = 2;
    x--; // x followed by the double minus sign
    y++;
    z+=y;
//After the above code runs, what are x, y, and z equal to?

    int a = 3;
    int b = 5;
    int c = 2;
    a = c * 2;
    b = b / 2;
    c++;
//After the above code runs, what are a, b, and c equal to?

//PART THREE: CASTING

    int total = 5 + 7 + 2;
    (double) (total / 3); //Option A
    total / 3; //Option B
    (double) total / 3; //Option C

//Which of the above options correctly computes the average of total? Why do the other options not work?
 */

public class ModulusCompoundOperatorsAndCastingPractice {

	public static void main(String[] args) {
		
		        // =========================
		        // PART ONE: MODULUS
		        // =========================
		        System.out.println("PART ONE: MODULUS");
		        // Modulo gives the remainder after division
		        System.out.println(14 % 13); // 14 ÷ 13 = 1 remainder 1 → prints 1
		        System.out.println(8 % 11);  // 8 ÷ 11 = 0 remainder 8 → prints 8
		        System.out.println(6 % 2);   // 6 ÷ 2 = 3 remainder 0 → prints 0
		        System.out.println(7 % 2);   // 7 ÷ 2 = 3 remainder 1 → prints 1
		        System.out.println(274 % 10);// 274 ÷ 10 = 27 remainder 4 → prints 4
		        System.out.println(881 % 2); // 881 ÷ 2 = 440 remainder 1 → prints 1
		        System.out.println();

		        // =========================
		        // PART TWO: COMPOUND OPERATORS
		        // =========================
		        System.out.println("PART TWO: COMPOUND OPERATORS");
		        int x = 0;
		        int y = 1;
		        int z = 2;

		        x--;       // x = 0 - 1 → -1
		        y++;       // y = 1 + 1 → 2
		        z += y;    // z = 2 + 2 → 4

		        System.out.println("After first block: x = " + x + ", y = " + y + ", z = " + z);

		        int a = 3;
		        int b = 5;
		        int c = 2;

		        a = c * 2; // a = 2 * 2 → 4
		        b = b / 2; // b = 5 / 2 → 2 (integer division)
		        c++;       // c = 2 + 1 → 3

		        System.out.println("After second block: a = " + a + ", b = " + b + ", c = " + c);
		        System.out.println();

		        // =========================
		        // PART THREE: CASTING
		        // =========================
		        System.out.println("PART THREE: CASTING");
		        int total = 5 + 7 + 2; // total = 14

		        // Option A: (double) (total / 3)
		        System.out.println("Option A: " + (double) (total / 3)); 
		        // Integer division happens first → 14 / 3 = 4 → cast to double → 4.0

		        // Option B: total / 3
		        System.out.println("Option B: " + total / 3); 
		        // Integer division only → 14 / 3 = 4

		        // Option C: (double) total / 3
		        System.out.println("Option C: " + (double) total / 3); 
		        // Casting happens first → 14.0 / 3 = 4.6667 (correct average)
		    }
		}

		
