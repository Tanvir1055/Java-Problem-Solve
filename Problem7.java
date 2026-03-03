import java.util.*;5
class Problem7 
{
    public static void main(String[] arg) 
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }
}
