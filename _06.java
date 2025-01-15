import java.util.*;

public class _06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = Integer.toString(n);
            char[] c = s.toCharArray();
            List<String> a = new ArrayList<>();
            String prev = "";
            int count = 0;

            for (int j = c.length - 1; j >= 0; j--) {
                if (c[j] != '0') {
                    a.add(c[j] + prev);
                    count++;
                }
                prev += "0";
            }

            System.out.println(count);
            for (String b : a) {
                System.out.print(Integer.parseInt(b) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}