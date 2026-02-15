package Loop_Condition;

import java.util.Scanner;

public class AreaOfCircle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        float area = radius * radius * 3.14f;
        System.out.println("The area of the circle is: " + area);
    }
}
