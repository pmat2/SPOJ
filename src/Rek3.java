import java.util.Scanner;

/**
 * https://www.spoj.com/WSDOCPP/problems/REK3/
 *
 * @author pmatusiak
 */
public class Rek3 {

    private static int rek3(int n){
        if (n == 1){
            return 1;
        }
        return -2 * rek3(n-1) + 4;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int n = sc.nextInt();
            System.out.println(rek3(n));
        }
        sc.close();
    }
}
