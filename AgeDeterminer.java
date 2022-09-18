import java.util.Scanner;

public class AgeDeterminer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(c, (Math.max(a, b)));
        int min = Math.min(c , (a < b ? a : b));

        System.out.println("Youngest age is " + min);
        System.out.println("Oldest age is " + max);

    }
}
