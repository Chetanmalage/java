package Loop_Condition;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number of Fibonacci series: ");
        int n = input.nextInt();
        int pre =  0;
        int current = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(pre + " ");
            int next = pre + current;
            pre = current;
            current = next;
        }
    }
}
