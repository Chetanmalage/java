package Loop_Condition;

public class Counting_occurrences {
    static void main(String[] args) {

        int n = 44252525;

        int count = 0;

        while (n > 0) {
            int lastDigit = n%10;
            if (lastDigit == 5){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
