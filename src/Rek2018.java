import java.util.Scanner;

/**
 * https://www.spoj.com/WSDOCPP/problems/REK2018/
 *
 * @author pmatusiak
 */
public class Rek2018 {

    private static void line(int n){
        if (n > 0){
            System.out.print("*");
            line(n-1);
        }
    }

    private static void triangle(int n) {
        if (n == 0) {
            return;
        }
        line(n);
        System.out.println();
        triangle(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        triangle(n);

        sc.close();
    }
}
