import java.util.Scanner;

/**
 * https://www.spoj.com/WSDOCPP/problems/SUMREKUR/
 *
 * @author pmatusiak
 */
public class Sumrekur {

    private static int sumRekur(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n + sumRekur(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int n = sc.nextInt();
            System.out.println(sumRekur(n));
        }
        sc.close();
    }
}
