import java.util.*;
class Problem5 
{
    public static void main(String[] arg) 
    {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        char operator = input.next().charAt(0);
        if (operator == '+') 
        {
            System.out.println("Result: " + (num1 + num2));
        }
        else if (operator == '-')
        {
            System.out.println("Result: " + (num1 - num2));
        }
        else if (operator == '*') 
        {
            System.out.println("Result: " + (num1 * num2));
        }
        else if (operator == '/') 
        {
            if (num2 != 0) 
            {
                System.out.println("Result: " + (num1 / num2));
            } 
            else 
            {
                System.out.println("Cannot divide by zero");
            }
        }
        else 
        {
            System.out.println("Invalid operator");
        }

    }
}
