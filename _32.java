import java.util.*;

public class _32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int n = s.length();

        if (n % k != 0) {
            System.out.println(-1);
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(c[i], map.getOrDefault(c[i], 0) + 1);
        }

        for (int freq : map.values()) {
            if (freq % k != 0) {
                System.out.println(-1);
                return;
            }
        }

        ArrayList<Character> tempList = new ArrayList<>(map.keySet());
        String temp = "";
        for (Character ch : tempList) {
            int repeat = map.get(ch) / k;
            for (int j = 0; j < repeat; j++) {
                temp += ch;
            }
        }

        String ans = "";
        for (int i = 0; i < k; i++) {
            ans += temp;
        }

        System.out.println(ans);
    }
}
