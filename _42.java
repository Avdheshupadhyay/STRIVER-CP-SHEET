import java.util.Scanner;

public class _42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder s = new StringBuilder();

        while (n > 0 && n % 7 != 0) {
            n -= 4;
            s.append('4');
        }
        while (n > 0 && n % 7 == 0) {
            n -= 7;
            s.append('7');
        }

        if (n == 0) {
            System.out.println(s);
        } else {
            System.out.println(-1);
        }


        
        sc.close();
    }
}
