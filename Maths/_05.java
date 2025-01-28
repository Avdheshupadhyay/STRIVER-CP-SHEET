import java.util.Scanner;

public class _05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            if (n <= 2) {
                System.out.println(1);
            } else {
                n -= 2;
                int res = (int) Math.ceil((double) n / x) + 1;
                System.out.println(res);
            }
        }
        scanner.close();
    }
}