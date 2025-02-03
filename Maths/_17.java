import java.util.*;
public class _17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int diff = Math.abs(a - b);
            int count = (diff + 9) / 10; 
            
            System.out.println(count);
        }
        sc.close();
    }
}