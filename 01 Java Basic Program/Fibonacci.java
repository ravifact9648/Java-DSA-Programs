import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("hello");
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println("Please Enter n value: ");
        int n = Integer.parseInt(s.nextLine());
        fn.fibNumber(n);
    }
}

class FibonacciNumber {
    void fibNumber(int n) {
        int a = 0, b = 1;
        if (n <= 0)
            System.out.println("Invalid Number");
        else{
            System.out.print("0");

            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
                System.out.print(" " + temp);
            }
        }
    }
}
