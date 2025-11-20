import java.util.Scanner;


public class Helloworld
{
    public static void main (String[] args)
    {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum = " + ( a + b));
        System.out.println("Product = " + ( a * b));
        System.out.println("Difference = " + ( a - b));
        System.out.println("Division = " + ( a / b));
        System.out.println("Remainder = " + ( a % b));
    }
}
