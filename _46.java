import java.util.*;

public class _46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        sc.next(); 
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        sc.next(); 
        int m2 = sc.nextInt();

        int min1 = h1 * 60 + m1;
        int min2 = h2 * 60 + m2;
        int mid = (min1 + min2) / 2;

        int hrs = mid / 60;


        
        int mins = mid % 60;

        if (hrs > 9 && mins > 9) {
            System.out.println(hrs + ":" + mins);
        } else {
            if (hrs < 10) System.out.print("0");
            System.out.print(hrs + ":");
            if (mins < 10) System.out.print("0");
            System.out.println(mins);
        }

        sc.close();
    }
}
