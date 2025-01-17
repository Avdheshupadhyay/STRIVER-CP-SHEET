import java.util.*;

public class _22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.nextLine();
        String[] hands = new String[5];

        for (int i = 0; i < 5; i++) {
            hands[i] = sc.nextLine();
        }

        for (String h : hands) {
            if (h.charAt(0) == card.charAt(0) || h.charAt(1) == card.charAt(1)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
