import java.util.Scanner;

public class Pattern {
    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("*\t");
            System.out.println('\n');
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter n value: ");
        int n = Integer.parseInt(s.nextLine());
        pattern(n);
    }
}
