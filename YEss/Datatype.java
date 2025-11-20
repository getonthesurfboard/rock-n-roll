package YEss;


public class Datatype
{
   public static void main (String[] args)
   {
       System.out.println(Integer.MAX_VALUE);
       System.out.println(Integer.MIN_VALUE);
       System.out.println(Integer.BYTES);
       System.out.println(Integer.SIZE);
       System.out.println(Float.MAX_VALUE);
       System.out.println(Float.MIN_VALUE);
       System.out.println(Float.BYTES);
       System.out.println(Float.SIZE);
        
       int a=10;
       float f = 2.333f;
       double d = 2.44d;
       
       int x =(int)(a + f + d);
       System.out.println("sum=" +x);
       
   }
   
}