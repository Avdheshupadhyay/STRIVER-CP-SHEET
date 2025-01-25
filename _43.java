import java.util.*;

public class _43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int l = -1, r = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    l = i + 1;
                    break;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    r = i + 1;
                    break;
                }
            }
            
            int ans = n;
            if (l != -1) {
                int k = 2 * (r - l + 1);
                k += 2 * Math.max(l - 1, n - r);
                ans = Math.max(ans, k);
            }
            
            System.out.println(ans);
        }
        sc.close();
    }
}
