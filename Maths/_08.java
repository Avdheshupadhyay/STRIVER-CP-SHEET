import java.util.*;

public class _08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = {a, b, c};
            Arrays.sort(arr);
            int sum = (arr[2] - arr[1]) + (arr[2] - arr[0]);
            n = n - sum;
            if (n >= 0 && n % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}