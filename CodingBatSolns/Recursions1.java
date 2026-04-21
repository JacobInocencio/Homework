//1. Return the factorial of a number n (n!)
public static int factorial(int n) {
    
    //base case when n is 1
    if(n == 1) {
        return 1;
    }
    
    //recursive case multiplying n by the factorial of (n-1)
    return n * factorial(n - 1);
}

//2. Return the total number of bunny ears (each bunny has 2 ears)
public static int bunnyEars(int bunnies) {
    
    //base case when there are no bunnies
    if(bunnies == 0) {
        return 0;
    }
    
    //base case when there is one bunny
    if(bunnies == 1) {
        return 2;
    }
    
    //recursive case adding 2 ears for each bunny
    return 2 + bunnyEars(bunnies - 1);
}

//3. Return the nth number in the Fibonacci sequence
public static int fibonacci(int n) {
    
    //base case when n is 0
    if(n == 0) {
        return 0;
    }
    
    //base case when n is 1 or 2
    if(n == 1 || n == 2) {
        return 1;
    }
    
    //recursive case adding the previous two numbers
    return fibonacci(n - 2) + fibonacci(n - 1);
}
