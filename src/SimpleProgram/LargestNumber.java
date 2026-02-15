package SimpleProgram;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        int b = as.nextInt();
        int c = as.nextInt();

        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);
    }
}
