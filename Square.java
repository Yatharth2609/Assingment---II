import java.util.Scanner;

public class Square
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();

        if(l == b)
        {
            System.out.println("It is a Square");
        }

        else
        {
            System.out.println("It is not a Square");
        }
    }


}
