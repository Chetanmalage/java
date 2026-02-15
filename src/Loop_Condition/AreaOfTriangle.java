package Loop_Condition;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        float base = sc.nextFloat();

        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        float area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
    }
}
