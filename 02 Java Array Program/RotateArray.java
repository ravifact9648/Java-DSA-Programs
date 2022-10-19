import java.util.Scanner;

public class RotateArray {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int n, loc;
        System.out.println("Enter the Number of Array Elements ");
        n = Integer.parseInt(s.nextLine());
        int arr[] = new int[n];
        System.out.print("Enter Array Element:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s.nextLine());
        }
        System.out.println("Array Element successfully stored\nPlease Enter the location to rotate the Array");
        loc = Integer.parseInt(s.nextLine());
        RotateArrayElement ra = new RotateArrayElement();
        ra.swapArray(0, loc - 1, arr);
        ra.swapArray(loc, arr.length - 1, arr);
        ra.swapArray(0, arr.length - 1, arr);
        System.out.println("Array Element after swap:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

class RotateArrayElement {
    void swapArray(int start, int end, int[] arr) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
