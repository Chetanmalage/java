package Loop_Condition;

//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestNumberTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int largest = 0;

        System.out.println("Enter a numbers (to stop enter 0): ");

        while(true) {
            number = sc.nextInt();

            if (number == 0) {
                break;
            }

            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The largest number is " + largest);
    }
}
