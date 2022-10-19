import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Element you want to store:");
        int n = Integer.parseInt(s.nextLine());
        int arr[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s.nextLine());
        Set<Integer> data = new HashSet<Integer>();
        for (Integer val : arr) {
            if (data.add(val) == true)
                ;
        }
        System.out.println("After removal of Duplicate Element from Array: ");
        System.out.print(data);
    }
}
