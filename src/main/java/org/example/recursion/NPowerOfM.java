package org.example.recursion;

import java.text.MessageFormat;
import java.util.Scanner;

public class NPowerOfM {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give value of N where N is the power of M  - ");
        int n = scanner.nextInt();
        while(n < 0){
            System.out.println("Please give a valid number which is any number greater or equal to 0.");
            n = scanner.nextInt();
        }
        System.out.println("Please give value of M where M is the number  - ");
        int m = scanner.nextInt();
        NPowerOfM nPowerOfM = new NPowerOfM();
        System.out.println(MessageFormat.format("{0} power of {1} is {2}.", n, m, nPowerOfM.calculatePower(m, n)));
    }

    private int calculatePower(int m, int n){
        if(n == 1)
            return m;
        return m * calculatePower(m, n-1);
    }
}
