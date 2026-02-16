package Loop_Condition;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = 0;
        int length = 0;

        int temp = n;
        while(temp != 0){
            length++;
            temp = temp/10;
        }

        temp = n;
        while(temp != 0){
            int rem = temp%10;

            int power =1;
            for(int i=1;i<=length;i++){
                power = power * rem;
            }

            result = result + power;
            temp = temp/10;
        }

        if(n == result){
            System.out.println("The number is Armstrong Number");
        }else {
            System.out.println("The number is not Armstrong Number");
        }
    }
}
