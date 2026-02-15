package Loop_Condition;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        float height = input.nextFloat();
        System.out.print("Enter width: ");
        float width = input.nextFloat();

        float area = height * width;
        System.out.println("The area of the triangle is: " + area);
    }
}
