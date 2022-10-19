import java.util.Scanner;
public class RightRotateArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of Element you want to insert: ");
        int n = Integer.parseInt(s.nextLine());
        int arr[] = new int[n];
        System.out.println("Enter the Elemensts:");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(s.nextLine());
        System.out.println("Element Stored Successfully!\n Please Enter the location to Rotate:");
        int loc = Integer.parseInt(s.nextLine());
        loc--;
        RotateArray ra = new RotateArray();
        ra.reverse(loc, arr.length - 1, arr);
        ra.reverse(0, loc - 1, arr);
        ra.reverse(0, arr.length - 1, arr);
        System.out.println("After ARray Rotation:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
    }
}

class RotateArray {
    void reverse(int low, int high, int arr[]) {
        int temp;
        while (low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}