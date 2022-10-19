import java.util.Scanner;

public class ArrayLength {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array Element you want to store: ");
        int n = Integer.parseInt(s.nextLine());
        System.out.println("Enter Element:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s.nextLine());
        System.out.println("Element Stored Successfully!");
        System.out.println("Nos. of Element Present in Array: " + arr.length);
    }
}
