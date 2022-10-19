import java.util.Scanner;
public class LargestElement {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array Element you want to store: ");
        int n = Integer.parseInt(s.nextLine());
        System.out.println("Enter Element:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s.nextLine());
        System.out.println("Element Stored Successfully!");
        System.out.println("Array Elements are: ");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
            int lar=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if (arr[i]>lar)lar=arr[i];
            }
            System.out.println("Largest Element: "+lar);
    }
}
