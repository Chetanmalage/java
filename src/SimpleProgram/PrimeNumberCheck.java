package SimpleProgram;

import java.util.*;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = sc.nextInt();
        int c = 2;

        if(num == 1){
            System.out.println("Prime Number");
        }

        while(c*c <= num){
            if(num%c == 0){
                System.out.println(num+" is not prime number");
                return;
            }
            c++;
        }

        System.out.println(num+" is prime number");
    }
}
