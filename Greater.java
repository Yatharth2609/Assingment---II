import java.util.Scanner;

public class Greater
{
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(Math.max(x , y));
    }
}
