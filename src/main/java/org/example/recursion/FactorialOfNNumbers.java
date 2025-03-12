package org.example.recursion;

import java.text.MessageFormat;
import java.util.Scanner;

public class FactorialOfNNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a natural number - ");
        int n = scanner.nextInt();
        while(n < 0){
            System.out.println("Please give a valid number which is any number greater or equal to 0.");
            n = scanner.nextInt();
        }
        FactorialOfNNumbers factorialOfNNumbers = new FactorialOfNNumbers();
        System.out.println(MessageFormat.format("Factorial of {0} is {1}.", n, factorialOfNNumbers.factorial(n)));
    }

    private int factorial(int n){
        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }
}
