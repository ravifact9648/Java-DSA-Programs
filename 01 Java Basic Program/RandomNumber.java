import java.lang.Math;
public class RandomNumber {
    public static void main(String argv[])
    {
        double ran=Math.random()*100;
        System.out.println("Random Number "+ Math.round(ran));
    }
}
