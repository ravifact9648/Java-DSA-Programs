import java.util.Scanner;

public class ASCII {
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter a Character to find ASCII value: ");
        char chr = s.next().charAt(0);  
        int asc=chr;
        System.out.println("ASCII Value: " +asc);
    }
}
