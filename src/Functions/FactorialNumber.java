package Functions;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        factorial(n);
    }

    static void factorial(int n){
        if(n==1 || n==0){
            System.out.print("Factorial of "+n+" is 1");
            return;
        }
        int factorial = 1;
        for(int i=1; i<=n;i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of "+n+" is "+factorial);
    }
}

