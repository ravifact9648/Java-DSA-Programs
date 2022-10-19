import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of element you want to store:");
        int n = Integer.parseInt(s.nextLine());
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s.nextLine());
        System.out.println("Reversed Element:");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + "\t");
    }
}
