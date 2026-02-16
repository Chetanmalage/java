package Loop_Condition;

import java.util.Scanner;

public class VowelCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
