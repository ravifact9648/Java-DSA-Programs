import java.util.Scanner;
class CopyArrayElement{
    public static void main(String arg[])
    {
        int i,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Size of Array:");
        n=Integer.parseInt(s.nextLine());
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter "+n+" Number:");
        for(i=0;i<n;i++)
        {
            arr1[i]=Integer.parseInt(s.nextLine());
        }
        for(i=0;i<n;i++)
        {
            arr2[i]=arr1[i];
        }
        System.out.println("Array 1 Element :");
        for(i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("Array 2 Element :");
        for(i=0;i<arr1.length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}