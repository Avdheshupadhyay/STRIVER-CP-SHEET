import java.util.*;

public class _12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int evenMismatch = 0;
            int oddMismatch = 0;
            
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 && a[i] % 2 != 0) {
                    evenMismatch++;
                } else if (i % 2 != 0 && a[i] % 2 == 0) {
                    oddMismatch++;
                }
            }
            
            if (evenMismatch == oddMismatch) {
                System.out.println(evenMismatch);
            } else {
                System.out.println(-1);
            }
        }
        
        sc.close();
    }
}