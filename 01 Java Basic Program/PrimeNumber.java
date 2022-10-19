import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Prime p = new Prime();
        System.out.println("Please Enter n value: ");
        int n = Integer.parseInt(s.nextLine());
        p.primeNum(n);
    }
}

class Prime {
    int primeNum(int n) {
        if (n < 0)
            System.out.println("Invalid Number");
        else {
            if (n == 1 || n == 2)
                System.out.println("Prime Number");
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("The Number is not prime number");
                    return 0;
                }
            }
            System.out.println("Prime Number");
        }
        return 0;
    }
}
