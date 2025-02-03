import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n < 3) {
                System.out.println(1);
                continue;
            }
            int ans = (int) Math.ceil(n / 2.0); 
            System.out.println(ans);
        }
        scanner.close();
    }
}