import java.util.Scanner;

/**
 * https://www.spoj.com/WSDOCPP/problems/KORAREK/
 *
 * @author pmatusiak
 */
public class Korarek {

    private static void coral(int n)
    {
        if(n == 0)
        {
            return;
        }
        coral(n / 2);
        if(n % 2 == 0)
        {
            System.out.print("c");
        }
        else
        {
            System.out.print("b");
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        coral(n);
        sc.close();
    }
}