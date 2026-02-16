package Loop_Condition;

import java.util.Scanner;

//Input a number and print all the factors of that number

public class FactorExample {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n  = sc.nextInt();

        System.out.println("Factors of "+n+" are: ");
        for (int i = 1; i <= n ; i++) {
            if(n % i ==0){
                System.out.println(i);
            }
        }
    }
}
