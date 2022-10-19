import java.util.Scanner;
public class SubtractMatrix {
   public static void main(String args[])
   {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the row size:");
   int row=Integer.parseInt(s.nextLine());
   int result[][]=new int[row][row];
   int arr1[][]=new int[row][row];
   int arr2[][]=new int[row][row];
   System.out.println("Enter the element of arr 1:");
   for(int i=0;i<arr1.length;i++)
   {
    for(int j=0;j<arr1[0].length;j++)
    {
        arr1[i][j]=Integer.parseInt(s.nextLine());
    }
   }
   
   System.out.println("Enter the element of arr 2:");
   for(int i=0;i<arr1.length;i++)
   {
    for(int j=0;j<arr1[0].length;j++)
    {
        arr2[i][j]=Integer.parseInt(s.nextLine());
    }
   }


   for(int i=0;i<arr1.length;i++)
   {
    for(int j=0;j<arr1[0].length;j++)
    {
        result[i][j]=arr2[i][j]-arr1[i][j];
    }
   }

   System.out.println("Result: ");
   for(int i=0;i<arr1.length;i++)
   {
    for(int j=0;j<arr1[0].length;j++)
    {
        System.out.print(result[i][j]+"\t");
    }
    System.out.println();
   }


   }
   
}
