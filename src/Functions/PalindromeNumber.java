package Functions;

import java.util.Scanner;

public class PalindromeNumber {

    //    Write a function to find if a number is a palindrome or not. Take number as parameter.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        palindromeCheck(num);
    }

    static void palindromeCheck(int num){
        int original = num;
        int result = 0;
        while( num != 0){
            int rem =  num % 10;
            result = result * 10 +rem;
            num = num / 10;
        }
        if(result == original){
            System.out.println(original+" is Palindrome");
        }else {
            System.out.println(original+" is not Palindrome");
        }
    }
}
