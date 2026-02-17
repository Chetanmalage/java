package SimpleProgram;

public class Greeting {
    public static void main(String[] args) {
        String name = "";
        name = Greet(name);
        System.out.println("hello "+name);

        int a = 10;
        int b = 20;

        swap(a,b);
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1+ " " + num2);
    }

    static String Greet(String helo) {
        helo = "chetan malage";
        return helo;
    }
}
