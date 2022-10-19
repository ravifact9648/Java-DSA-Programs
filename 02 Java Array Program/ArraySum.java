import java.util.Scanner;
public class ArraySum {
    public static void main(String args[]) {
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array Element you want to store: ");
        int n = Integer.parseInt(s.nextLine());
        System.out.println("Enter Element:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s.nextLine());
        System.out.println("Element Stored Successfully!");
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array Element: "+sum);
}
}
