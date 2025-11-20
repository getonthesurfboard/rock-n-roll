package nov;
import java.util.Scanner;


public class Testie
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR OBTAINED GRADE");
        int g = sc.nextInt();
        String p = ( g >= 40)? "PASS":"FAIL";
        System.out.println(p);
        
    }
}