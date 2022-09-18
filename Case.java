import java.util.Scanner;

public class Case
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        if (!Character.isUpperCase(x)) {
            System.out.println("LowerCase");
        } else {
            System.out.println("UpperCase");
        }

    }
}
