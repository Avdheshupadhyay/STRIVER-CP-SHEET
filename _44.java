import java.util.Scanner;
 
public class _44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            String s = sc.next(); 
            int i = 0, j = n - 1;
            boolean isValid = true;
 
            while (i <= j) {
                char x = s.charAt(i);
                char y = s.charAt(j);
 
                char p1 = (x == 'a') ? '1' : (char) (x - 1);
                char p2 = (y == 'a') ? '1' : (char) (y - 1);
                char n1 = (x == 'z') ? '2' : (char) (x + 1);
                char n2 = (y == 'z') ? '2' : (char) (y + 1);
 
                if (p1 == p2 || p1 == n2 || p2 == n1 || p2 == p1) {
                    i++;
                    j--;
                } else {
                    isValid = false;
                    break;
                }
            }
 
            System.out.println(isValid ? "YES" : "NO");
        }
        sc.close();
    }
}