import java.util.Scanner;

public class _09{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] soldier = new int[n];
        
        for (int i = 0; i < n; i++) {
            soldier[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE, maxIndex = 0;
        int min = Integer.MAX_VALUE, minIndex = 0;
        
        for (int i = 0; i < n; i++) {
            if (soldier[i] > max) {
                max = soldier[i];
                maxIndex = i;
            }
            if (soldier[i] <= min) {
                min = soldier[i];
                minIndex = i;
            }
        }
        
        int ans = maxIndex + n - 1 - minIndex;
        if (maxIndex < minIndex) {
            System.out.println(ans);
        } else {
            System.out.println(ans - 1);
        }
        
        sc.close();
    }
}
