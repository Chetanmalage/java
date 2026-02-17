package Functions;

import java.util.Scanner;

public class ProductNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int product = product(num1,num2);
        System.out.println("Multiplication of two number is "+product);
    }

    static int product(int num1,int num2){
        return num1*num2;
    }
}
