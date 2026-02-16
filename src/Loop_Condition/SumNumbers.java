package Loop_Condition;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number (to stop Enter 0): ");

        int sumOfNegativeNumbers = 0;
        int sumOfPositiveEvenNumbers = 0;
        int sumOfPositiveOddNumbers = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }

            if(num<0){
                sumOfNegativeNumbers  += num;
            }else if (num % 2 == 0){
                sumOfPositiveEvenNumbers += num;
            }else{
                sumOfPositiveOddNumbers += num;
            }
        }
        System.out.println("Sum of negative numbers: " + sumOfNegativeNumbers);
        System.out.println("Sum of positive even numbers: " + sumOfPositiveEvenNumbers);
        System.out.println("Sum of positive odd numbers: " + sumOfPositiveOddNumbers);
    }
}
