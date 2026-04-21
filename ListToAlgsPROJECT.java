/**
 * This class is meant to complete 10 objectives: return the smallest number and index in an array,
 * the average of all numbers in an array, a boolean depending if all numbers in an array are even,
 * change the value of two consecutive 5s to 0s, check if any number shows up three times in a row,
 * count how many times a value shows up, reverse an array, shift right, and sort using selection sort.
 */

public class AlgorithmsProject {

    /*
     * The main method creates multiple arrays and tests each method.
     * It prints the results as it goes.
     */

    public static void main(String[] args) {

        int[] smallArray = {5, 3, 6, 2, 8};
        int[] medArray = {3, 10, 6, 8, 9, 7, 5, 5};
        int[] threeArray = {4, 6, 7, 8, 8, 8, 9, 10};
        int[] fiveArray = {2, 5, 8, 5, 3, 9, 8, 5, 5};
        int[] nicArray = {4, 5, 16, 36, 37, 67, 3498};
        int[] randArray = {56, 1000, 73, 69, 67, 83};

        int targetNum = 5;

        System.out.println("smallArray:");

        System.out.println("Smallest: " + smallestNum(smallArray));
        System.out.println("Smallest Index: " + smallestIndex(smallArray));
        System.out.println("Average: " + arrayMean(smallArray));
        System.out.println("All Even: " + checkEven(smallArray));
        System.out.println("");

        System.out.println("medArray:");
        consFive(medArray);
        printArray(medArray);
        System.out.println("");

        System.out.println("threeArray:");
        System.out.println("Three in a row: " + threeNums(threeArray));
        System.out.println("");

        System.out.println("fiveArray:");
        System.out.println("How many 5s: " + howMany(fiveArray, targetNum));
        System.out.println("");

        System.out.println("Reverse:");
        printArray(reverseArray(fiveArray));
        System.out.println("");

        System.out.println("Shift Right:");
        printArray(toTheRight(nicArray));
        System.out.println("");

        System.out.println("Sorted:");
        select(randArray);
        printArray(randArray);
    }

    //prints array
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //1. smallest number
    public static int smallestNum(int[] arr) {

        int lowest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < lowest) {
                lowest = arr[i];
            }
        }

        return lowest;
    }

    //2. smallest index
    public static int smallestIndex(int[] arr) {

        int lowest = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < lowest) {
                lowest = arr[i];
                index = i;
            }
        }

        return index;
    }

    //3. average
    public static int arrayMean(int[] arr) {

        int total = 0;

        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total / arr.length;
    }

    //4. check even
    public static boolean checkEven(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    //5. two 5s -> 0s
    public static void consFive(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 5 && arr[i + 1] == 5) {
                arr[i] = 0;
                arr[i + 1] = 0;
            }
        }
    }

    //6. three in a row
    public static boolean threeNums(int[] arr) {

        for(int i = 0; i < arr.length - 2; i++) {
            if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                return true;
            }
        }

        return false;
    }

    //7. count number
    public static int howMany(int[] arr, int target) {

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    //8. reverse array
    public static int[] reverseArray(int[] arr) {

        int[] newArr = new int[arr.length];
        int j = 0;

        for(int i = arr.length - 1; i >= 0; i--) {
            newArr[j] = arr[i];
            j++;
        }

        return newArr;
    }

    //9. shift right
    public static int[] toTheRight(int[] arr) {

        int[] newArr = new int[arr.length];
        newArr[0] = arr[arr.length - 1];

        for(int i = 1; i < arr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        return newArr;
    }

    //10. selection sort
    public static void select(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
