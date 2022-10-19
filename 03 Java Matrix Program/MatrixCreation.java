import java.util.Scanner;
class MatrixCreation{
   public static void main(String args[])
   {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the row size:");
   int row=Integer.parseInt(s.nextLine());
   System.out.println("Enter the column size:");
   int col=Integer.parseInt(s.nextLine());
      if(row<0 || col<0){
   System.out.println("Invalid Matrix");
   return;
      }
      else{
         int arr[][]=new int[row][col];
   System.out.println("Matrix Created");
      }
   }
}