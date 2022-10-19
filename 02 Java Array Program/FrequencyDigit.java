import java.util.Scanner;
public class FrequencyDigit {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter Number");
        int num=Integer.parseInt(s.nextLine());
        int last;
        while(num!=0)
        {
            last=num%10;
            arr[last]++;
            num=num/10;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Frequency of "+i+" is "+arr[i]);
        }
    }
}
