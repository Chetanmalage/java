package Functions;

import java.util.Scanner;

public class MaxMinNumber {

//    Define two methods to print the maximum and the minimum number respectively
//    among three numbers entered by the user.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 Number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        max(num1,num2,num3);
        min(num1,num2,num3);
    }

    static void max(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is Greater.");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+" is Greater.");
        } else {
            System.out.println(num3+" is Greater.");
        }
    }

    static void min(int num1,int num2,int num3){
        if(num1<num2 && num1<num3){
            System.out.println(num1+" is Smaller.");
        }else if(num2<num1 && num2<num3){
            System.out.println(num2+" is Smaller.");
        }else{
            System.out.println(num3+ " is Smaller.");
        }
    }
}
