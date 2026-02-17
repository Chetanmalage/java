package Functions;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        System.out.println("Enter the numbers (to stop enter 0): ");

        sumNumber();
    }

    static void sumNumber(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            int num = input.nextInt();
            if(num == 0){
                break;
            }
            sum += num;
        }
        System.out.println("Sum of all number = "+sum);
    }
}
