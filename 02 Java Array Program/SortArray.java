import java.util.Scanner;
public class SortArray {
   public static void main(String args[])
   {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the Number of Element you want to store:");
   int n = Integer.parseInt(s.nextLine());
   int arr[]=new int [n];
   System.out.println("Enter Elements:");
   for(int i=0;i<n;i++)arr[i]=Integer.parseInt(s.nextLine());

   for(int i=0;i<arr.length;i++)
   {
    for(int j=i;j<arr.length;j++)
    {
        if(arr[i]>arr[j])
        {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }
    }
   }
   System.out.println("Reversed Array:");
   for(int i=0;i<arr.length;i++)System.out.print(arr[i]+"\t");
   }
}
