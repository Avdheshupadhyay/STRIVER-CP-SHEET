import java.util.*;
public class _39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int sum = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] >= a[i + 1]) {
                a[i] = Math.max(0, a[i + 1] - 1); 
            }
            sum += a[i];
        }
        
        System.out.println(sum);
        sc.close();
    }
}