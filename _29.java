import java.util.*;
public class _29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(0);
                continue;
            }
            int[] skill = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                skill[i] = sc.nextInt();
            }
            Arrays.sort(skill);
            int result = skill[n] - skill[n - 1];
            System.out.println(result);
        }
        sc.close();
    }
}