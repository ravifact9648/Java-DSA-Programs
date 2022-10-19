import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter n value: ");
        int n = Integer.parseInt(s.nextLine());
        f.factorial(n);
    }
}

class Factorial {
    void factorial(int n) {
        double fact = 1;
        {
            if (n == 1)
                System.out.println("1");
            if (n < 0)
                System.out.println("Invalid Number to find the Factorial");
            else {
                for (int i = n; i > 0; i--) {
                    fact = fact * i;
                }
                System.out.println(fact);
            }
        }
    }
}