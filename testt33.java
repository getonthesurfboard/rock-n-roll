import java.util.Scanner;

public class testt33
{
    public static void main (String[] args)
    {
        String na,m;
        int qty;
        Scanner sc = new Scanner(System.in);
        System.out.print("WHOLESALER : WHAT DO YOU WANT?");
        m = sc.nextLine();
        System.out.print("WHOLESALER : OK TOTAL PRICE IS Rs.3300");
        System.out.print("HELLO SAUJI");
        System.out.print("What medicine do you need?(INPUT IN UPPERCASE)");
        na = sc.nextLine();
        if ( na.equals( ("PARACETAMOL")) ||  na.equals(("NICO"))){
            System.out.print("How many of them do you need");
            qty = sc.nextInt();
            if (na.equals(("PARACETAMOL"))){
               if ( qty < 15){
                  System.out.print("THE TOTAL PRICE IS Rs." + ( 100 * qty));
               }
               else{
                  System.out.print("WE ARE OUT OF STOCK");
               }
            }
            else{
               if ( qty < 15){
                  System.out.print("THE TOTAL PRICE IS Rs." + ( 120 * qty));
                }
               else{
                  System.out.print("WE ARE OUT OF STOCK"); 
               }
            }
            System.out.print("THE STOCK LEFT IS " + ( 15 - qty));
        }  
        else{
            System.out.print("SORRY, WE AREOUT OF STOCK");
        }
        
    }
}
