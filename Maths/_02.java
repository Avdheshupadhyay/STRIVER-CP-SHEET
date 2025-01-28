import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = 2 * a;
            if (c <= b) {
                System.out.println(a + " " + c);
            } else {
                System.out.println("-1 -1");
            }
        }

        sc.close();
    }
}
