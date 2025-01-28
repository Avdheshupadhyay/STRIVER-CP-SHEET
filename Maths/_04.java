import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int element = sc.nextInt();
                sum += element;
            }
            if (sum % 2 == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}