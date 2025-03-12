package org.example.recursion;

import java.text.MessageFormat;
import java.util.Scanner;

public class SumOfNNaturalNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a natural number - ");
        int n = scanner.nextInt();

        SumOfNNaturalNumbers sumOfNNaturalNumbers = new SumOfNNaturalNumbers();
        System.out.println(MessageFormat.format("Sum of first {0} number is {1}.", n, sumOfNNaturalNumbers.sum(n)));
    }

    private int sum(int n){
        if(n == 0)
            return 0;
        return n + sum(n-1);
    }
}
