import java.util.*;
class Problem3 
{
    public static void main(String[] arg) 
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0) 
        {
            System.out.println("Even");
        } 
        else 
        {
            System.out.println("Odd");
        }

    }
}
