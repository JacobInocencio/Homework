
public class NestedLoopsQuiz {

	public static void main(String[] args) {
		
		printNumberTriangle(8);
		
		
	}
	
	public static void printNumberTriangle(int a) {
		
		for(int row = 1; row <= a; row++) {
			
			for(int col = 0; col <= row-1; col++) {
				
				System.out.print(row + "\t");
				
			}
			
			System.out.println();
			System.out.println();
			
		}
		
	}

}
