import java.util.Scanner;

public class ArrayEvenElement {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of element you want to store:");
        int n = Integer.parseInt(s.nextLine());
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s.nextLine());
        System.out.println("Array Element at Even index");
        for (int i = 0; i < arr.length; i = i + 2)
            System.out.print(arr[i] + "\t");
    }
}
