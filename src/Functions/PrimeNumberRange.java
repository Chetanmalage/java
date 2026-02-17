package Functions;

import java.util.Scanner;

public class PrimeNumberRange {
//    Write a function that returns all prime numbers between two given numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Starting number: ");
        int start = input.nextInt();
        System.out.print("Enter a Ending number: ");
        int end = input.nextInt();

        printPrimes(start,end);
    }



    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    static void printPrimes(int start, int end) {
    for (int i = start; i <= end; i++) {
        if (isPrime(i)) {
            System.out.print(i + " ");
        }
    }
}
}
