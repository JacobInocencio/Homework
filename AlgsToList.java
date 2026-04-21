import java.util.ArrayList;

public class ListAlgs {

    public static void main(String[] args) {

        //Creating an ArrayList
        ArrayList<Integer> nums = new ArrayList<Integer>();

        //Adding 6 random numbers from 0–9 into the list
        for(int i = 0; i < 6; i++) {
            int randNum = (int)(Math.random() * 10);
            nums.add(randNum);
        }

        //Printing original list
        System.out.println(nums);
        System.out.println("");

        //Calling methods to test them

        System.out.println("Index of 4: " + checkFor4(nums));
        System.out.println("");

        System.out.println("Remove 5s: " + ridAllFives(nums));
        System.out.println("");

        System.out.println("Sorted: " + bubbleSort(nums));
        System.out.println("");
    }

    //1. Return the index of the first 4 in the list, or -1 if there is none
    public static int checkFor4(ArrayList<Integer> nums) {

        //variable to store index of 4
        int index4 = -1;

        //for loop to go through the list
        for(int i = 0; i < nums.size(); i++) {

            //check if current value is 4
            if(nums.get(i) == 4) {

                //store index and stop loop
                index4 = i;
                break;
            }
        }

        //return result
        return index4;
    }

    //2. Remove all 5s from the list
    public static ArrayList<Integer> ridAllFives(ArrayList<Integer> nums) {

        //for loop to go through the list
        for(int i = 0; i < nums.size(); i++) {

            //check if value is 5
            if(nums.get(i) == 5) {

                //remove it and move index back
                nums.remove(i);
                i--;
            }
        }

        //return updated list
        return nums;
    }

    //3. Sort the list using bubble sort
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nums) {

        //outer loop to repeat passes
        for(int j = 0; j < nums.size(); j++) {

            //inner loop to compare values
            for(int i = 0; i < nums.size() - 1; i++) {

                //store current value
                int temp = nums.get(i);

                //compare adjacent values
                if(nums.get(i + 1) < nums.get(i)) {

                    //swap values
                    nums.set(i, nums.get(i + 1));
                    nums.set(i + 1, temp);
                }
            }
        }

        //return sorted list
        return nums;
    }
}
