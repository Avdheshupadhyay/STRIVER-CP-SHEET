import java.util.*;

public class _45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            String p = sc.next(); 
            String h = sc.next(); 

            char[] pArray = p.toCharArray();
            Arrays.sort(pArray); 
            String sortedP = new String(pArray);

            int n1 = p.length(), n2 = h.length();
            boolean flag = false;

            

            for (int i = 0; i <= n2 - n1; i++) {
                String sub = h.substring(i, i + n1);
                char[] subArray = sub.toCharArray();
                Arrays.sort(subArray); 
                String sortedSub = new String(subArray);

                if (sortedSub.equals(sortedP)) {
                    flag = true;
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
        sc.close();
    }
}
