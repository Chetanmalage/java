package Loop_Condition;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers

public class SumOfNnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            number = sc.nextInt();
            if(number == 0){
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
