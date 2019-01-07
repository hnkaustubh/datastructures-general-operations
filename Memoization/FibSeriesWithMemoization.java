package org.launchcode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number for nth number of Fibonacci Series");
        int n = scan.nextInt();
        System.out.println("The Fibonacci Number is: "+fibonacci(n, new int[100]));
    }

    public static int fibonacci(int n, int memo[]){
        int result = 0;
        if(memo[n] != 0)
            result = memo[n];
        if(n == 1 || n == 2)
            result = 1;
        else
            result = fibonacci(n-1, memo) + fibonacci(n-2, memo);
        memo[n] = result;
        return result;
    }
}
