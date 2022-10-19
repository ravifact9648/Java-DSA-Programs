import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class DuplicateArrayElement {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array Element you want to store: ");
        int n = Integer.parseInt(s.nextLine());
        System.out.println("Enter Element:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s.nextLine());
        System.out.println("Element Stored Successfully!");
        System.out.println("********Brute Force Method***********");
        System.out.println("Duplicated Elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }

        System.out.println("***********Hash Set********");
        System.out.println("Duplicated Elements are:");
        Set<Integer> data = new HashSet<Integer>();
        for (Integer i : arr)
            if (data.add(i) == false)
                System.out.println(i);

    }
}
