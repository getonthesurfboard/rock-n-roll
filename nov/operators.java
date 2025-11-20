package nov;
import java.util.Scanner;



public class operators
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER DAYS");
        int a = sc.nextInt();
        int y = (a / 365);
        int r = a % 365;
        int m = r / 30;
        int rr = r % 30;
        int w = rr / 7; 
        int rrr = rr % 7; 
        System.out.println("Total years is " +y);
        System.out.println("Total months is "+m);
        System.out.println("Total week is "+w);
        System.out.println("Total days are "+rrr);
    }
}