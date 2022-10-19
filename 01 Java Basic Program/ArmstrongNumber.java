import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        ArmStrong a = new ArmStrong();
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter n value: ");
        int n = Integer.parseInt(s.nextLine());
        a.armstrong(n);
    }
}

class ArmStrong {
    void armstrong(int n) {
        int sum = 0;
        int temp = n;
        if (n < 0) {
            System.out.println("Invalid Number");
        } else {
            while (n != 0) {
                int r = n % 10;
                sum = sum + r * r * r;
                n = n / 10;
            }
        }
        if (temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}