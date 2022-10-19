import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PanlindromNumber pn = new PanlindromNumber();
        System.out.println("Please Enter n value: ");
        int n = Integer.parseInt(s.nextLine());
        pn.palindrome(n);
    }
}

class PanlindromNumber {
    void palindrome(int n) {
        int num = 0;
        int temp = n;
        while (n != 0) {
            int r = n % 10;
            num = r + 10 * num;
            n = n / 10;
        }
        System.out.println(num + " " + temp);
        if (num == temp)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
