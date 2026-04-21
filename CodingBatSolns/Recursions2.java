//4. Return the total number of blocks in a triangle with the given number of rows
public static int triangle(int rows) {
    
    //base case when there are no rows
    if(rows == 0) {
        return 0;
    }
    
    //recursive case adding the current row to the rows below it
    return rows + triangle(rows - 1);
}

//5. Return the sum of all digits in a number
public static int sumDigits(int n) {
    
    //stores the last digit of the number
    int total = n % 10;
    
    //base case when there is only one digit left
    if(n / 10 == 0) {
        return n;
    }
    
    //recursive case adding the last digit to the rest of the digits
    return total + sumDigits(n / 10);
}

//6. Return base raised to the power of n
public static int powerN(int base, int n) {
    
    //base case when the exponent is 1
    if(n == 1) {
        return base;
    }
    
    //recursive case multiplying base by the power of (n-1)
    return base * powerN(base, n - 1);
}
