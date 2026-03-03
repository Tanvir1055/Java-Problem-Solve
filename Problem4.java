import java.util.*;
class Problem4
{
   public static void main(String[] arg)
    {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
         int max=a;
         if(b>max)
         {
             max=b;
         }
         if(c>max)
         {
             max=c;
         }
         System.out.println("largest number is:"+max);
        
    }
    
}
