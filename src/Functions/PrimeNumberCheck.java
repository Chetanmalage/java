package Functions;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();

        isPrime(num);
    }

    static  void isPrime(int num){
        if (num <= 1) {
            System.out.println("Invalid number");
            return;
        }

        for (int i = 2; i * i  <= num; i++) {
            if(num%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
