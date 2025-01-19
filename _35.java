import java.util.Scanner;

public class _35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long First = -1;
            long Second = -1;
            if (a < c) First = 1;
            if (b * a > c) Second = b;
            System.out.println(First + " " + Second);
        }
        sc.close();
    }
}
