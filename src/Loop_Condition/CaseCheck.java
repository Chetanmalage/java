package Loop_Condition;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        if(ch>= 'a' && ch <= 'z'){
            System.out.println(ch +" is in Smaller case");
        }else{
            System.out.println(ch +" is in Larger case");
        }
    }
}
