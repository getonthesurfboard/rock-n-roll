import java.util.Scanner;

public class Store
{
    public static void main (String[] args)
    {
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the water level of the tank");
        l = sc.nextInt();
        System.out.println("The water level is " + l + "l");
        String a = ( l > 1000) ? "WARNING!!! THE WATER LEVEL IS RISING, MONITOR IT." : "WATER LEVEL STATUS = NORMAL";
        System.out.print(a);
    }
}