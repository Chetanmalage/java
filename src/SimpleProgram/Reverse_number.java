package SimpleProgram;

public class Reverse_number {
    public static void main(String[] args) {
        int n = 123456;

        int ans = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            ans = ans * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(ans);
    }
}
