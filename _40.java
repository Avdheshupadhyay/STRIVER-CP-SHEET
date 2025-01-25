import java.util.*;
public class _40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            boolean flagx = true, flagy = true;
            for (int j = Math.max(0, i - x); j < i; j++) {
                if (a[i] >= a[j]) {
                    flagx = false;
                    break;
                }
            }
            for (int j = i + 1; j <= Math.min(n - 1, i + y); j++) {
                if (a[i] >= a[j]) {
                    flagy = false;
                    break;
                }
            }
            
            if (flagx && flagy) {
                System.out.println(i+1);
                return;
            }
        }
        
        sc.close();
    }

}