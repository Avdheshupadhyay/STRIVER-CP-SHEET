import java.util.*;

public class _34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 0; j--) {

                System.out.print(j + " ");

            }

            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 0; j--) {

                System.out.print(j + " ");

            }

            System.out.println();
        }
    }

}
