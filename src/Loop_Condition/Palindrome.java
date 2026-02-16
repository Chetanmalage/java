package Loop_Condition;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int orginal = n;

        int result = 0;
        while(n > 0){
            int rem = n%10;
            result = result * 10 + rem;
            n = n/10;
        }

        if(orginal == result){
            System.out.println("The number is Palindrome Number");
        }else {
            System.out.println("The number is not Palindrome Number");
        }
    }
}
