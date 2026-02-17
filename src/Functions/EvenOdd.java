package Functions;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        evenOdd(num);
    }

    static void evenOdd(int num){
        if(num%2==0){
            System.out.println(num+ " is Even Number");
        }else {
            System.out.println(num+ " is Odd Number");
        }
    }
}
