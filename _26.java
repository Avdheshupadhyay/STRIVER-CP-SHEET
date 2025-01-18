import java.util.Scanner;

public class _26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        int len = 1, i = 0;
        while (i < n) {
            res.append(s.charAt(i));
            i += len++;
        }
        System.out.println(res.toString());
        sc.close();
    }
}
