import java.util.Scanner;

public class Company
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int sal = sc.nextInt();
        int exp = sc.nextInt();
        double newSal;
        if(exp > 5)
        {
            newSal = sal + (0.05 * sal);
            System.out.println(newSal);
        }
        else
        {
            System.out.println(sal);
        }
    }
}
